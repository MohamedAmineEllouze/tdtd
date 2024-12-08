public class Produit{
    int id;
    String libelle;
    double prix;
    String dateCreation;

    public Produit(int id, String libelle, double prix, String date)   {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
        this.dateCreation =date ;

    }

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit [id=" + id + ", libelle=" + libelle + ", prix=" + prix + ", dateCreation=" + dateCreation + "]";
    }

    
    
    
    


    
}