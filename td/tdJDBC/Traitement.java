// cette classe est utilisé pour le traitement de la table des produits


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Traitement {
    Connection con = null;
    public Traitement(){
        this.con=Connect.getConnection();
        if (con!= null) {
            System.out.println("Connected to the database");
        } else {
            System.out.println("Failed to connect to the database");
        }

    };
    public void ajouterProduit(Produit p) throws SQLException {
        PreparedStatement pr = con.prepareStatement("INSERT INTO produits (NOM_PRODUIT, PRIX, DATE_CREATION) VALUES (?, ?, ?)");
        pr.setString(1, p.getLibelle());
        pr.setDouble(2, p.getPrix());
        pr.setString(3, p.getDateCreation());
        pr.executeUpdate();
        System.out.println("Produit ajouté avec succès");
    }

    // retourner la liste des produit
    public ArrayList<Produit> search(String mc) throws SQLException {
        ArrayList<Produit> listProduit = new ArrayList<>();
        PreparedStatement pr = con.prepareStatement("SELECT * FROM produits WHERE NOM_PRODUIT LIKE ?");
        pr.setString(1, "%" + mc + "%");
        ResultSet res = pr.executeQuery();
        while (res.next()) {
            Produit p = new Produit();
            p.setId(res.getInt("ID_PRODUIT"));
            p.setLibelle(res.getString("NOM_PRODUIT"));
            p.setPrix(res.getDouble("PRIX"));
            p.setDateCreation(res.getString("DATE_CREATION"));
            listProduit.add(p);
        }
        return listProduit;
    }


    //  filtre selon le id 
    public Produit getProduit(int idid) throws SQLException {
        PreparedStatement pr = con.prepareStatement("SELECT * FROM produits WHERE ID_PRODUIT = ?");
        pr.setInt(1, idid);
        ResultSet res = pr.executeQuery();
        if (res.next()) {
            Produit p = new Produit();
            p.setId(res.getInt("ID_PRODUIT"));
            p.setLibelle(res.getString("NOM_PRODUIT"));
            p.setPrix(res.getDouble("PRIX"));
            p.setDateCreation(res.getString("DATE_CREATION"));
            return p;
        }
        return null;
    }


    public void deleteProduit(int id) throws SQLException{
        PreparedStatement pr = con.prepareStatement("DELETE FROM produits WHERE ID_PRODUIT = ?");
        pr.setInt(1, id);
        pr.executeUpdate();
    }




}