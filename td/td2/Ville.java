import java.util.HashMap;

public class Ville {
    private String nom;
    private HashMap<String, Commune> communes;

    public Ville(String nom) {
        this.nom = nom;
        this.communes = new HashMap<>();
    }

    public String getNom() {
        return nom;
    }

    // Add a commune to the city
    public void ajouterCommune(Commune commune) {
        if (!communes.containsKey(commune.getNom())) {
            communes.put(commune.getNom(), commune);
            System.out.println(commune.getNom() + " ajoutée à la ville " + nom);
        } else {
            System.out.println("La commune existe déjà.");
        }
    }

    // Remove a commune from the city
    public void supprimerCommune(String nomCommune) {
        if (communes.containsKey(nomCommune)) {
            communes.remove(nomCommune);
            System.out.println(nomCommune + " a été supprimée de la ville " + nom);
        } else {
            System.out.println("La commune n'existe pas.");
        }
    }

    // Calculate the total number of inhabitants across all communes
    public int getNombreHabitants() {
        int totalHabitants = 0;
        for (Commune commune : communes.values()) {
            totalHabitants += commune.getNombreHabitants();
        }
        return totalHabitants;
    }

    // Display the communes of the city
    public void afficherCommunes() {
        for (Commune commune : communes.values()) {
            System.out.println(commune);
        }
    }

    @Override
    public String toString() {
        return nom + " avec " + communes.size() + " communes, total habitants: " + getNombreHabitants();
    }
}
