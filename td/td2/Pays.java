import java.util.HashMap;
import java.util.Map;

public class Pays {
    private String nom;
    private HashMap<String, Ville> villes;

    public Pays(String nom) {
        this.nom = nom;
        this.villes = new HashMap<>();
    }

    public String getNom() {
        return nom;
    }

  
    public void ajouterVille(Ville ville) {
        if (!villes.containsKey(ville.getNom())) {
            villes.put(ville.getNom(), ville);
            System.out.println(ville.getNom() + " ajoutée au pays " + nom);
        } else {
            System.out.println("La ville existe déjà.");
        }
    }

    
    public void supprimerVille(String nomVille) {
        if (villes.containsKey(nomVille)) {
            villes.remove(nomVille);
            System.out.println(nomVille + " a été supprimée.");
        } else {
            System.out.println("La ville n'existe pas.");
        }
    }


    public int calculerNombreTotalHabitants() {
        int totalHabitants = 0;
        for (Ville ville : villes.values()) {
            totalHabitants += ville.getNombreHabitants();
        }
        return totalHabitants;
    }


    public Ville rechercherVille(String nomVille) {
        return villes.getOrDefault(nomVille, null);
    }

    public void afficherVilles() {
        for (Map.Entry<String, Ville> entry : villes.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
