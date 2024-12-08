import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;


public class Test {
    public static void main(String[] args) throws SQLException {
        Traitement t=new Traitement();
        /*avoir les details d'un prod */
        Produit p1 = t.getProduit(1);
        System.out.println(p1.toString());
        System.out.println("+++++++++++++++++++++++++");
       
        /*ajout de nouveaux prods 
        Produit p4 = new Produit("Produit 4", 10.5);
        t.ajouterProduit(p4);
        Produit p5 = new Produit("Produit 5", 112.5);
        t.ajouterProduit(p5);
        Produit p6 = new Produit("ss 6", 235.5);
        t.ajouterProduit(p6); */

        /*filtrage par nom */
        ArrayList<Produit> result = t.search("Produit");
        Iterator<Produit> it = result.iterator();

        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }

        /*suppression d'un produit */ 
        t.deleteProduit(4);
        System.out.println("Produit supprimé avec succès");

        /*modification des details d'un produit */
        Produit p7 = t.getProduit(7);
        p7.setLibelle("Produit 7");
        t.updateProduit(p7);
        System.out.println("Produit 7 modifié avec succès");

        Produit p6 = t.getProduit(6);
        p6.setLibelle("Produit 6");
        t.updateProduit(p6);
        System.out.println("Produit 6 modifié avec succès");

        Produit p5 = t.getProduit(5);
        p5.setLibelle("Produit 5");
        t.updateProduit(p5);
        System.out.println("Produit 5 modifié avec succès");

    }
}
