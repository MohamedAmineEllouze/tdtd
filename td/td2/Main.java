// L'objectif de ce ces classes est de modéliser une gestion basique d'un pays, avec plusieurs villes et leurs communes respectives.
// Le programme permet d'ajouter des villes à un pays, d'ajouter des communes à chaque ville, de rechercher une ville,
// d'afficher les informations sur les villes et les communes, et de calculer le nombre total d'habitants du pays.
// lawej pourquoi l'utilisation et creation des deuc methodes equals et hash code borjolia ena manich fehemhom
// tou ta99ahom zeda fil tp uodholli tp2 ama yodholli lezem nesen3ouhom bech y3awnouna naamlou bech nlawjou 3ala ville fi west arrayliste des villes hajja ki hakka )

public class Main {
    public static void main(String[] args) {

        Pays tunisie = new Pays("Tunisie");
        System.out.println("************************************************************************************************");

        // Ville Tunis
        Ville tunis = new Ville("Tunis");
        tunis.ajouterCommune(new Commune("La Marsa", 100000));
        tunis.ajouterCommune(new Commune("Carthage", 50000));
        tunis.ajouterCommune(new Commune("Sidi Bou Said", 20000));
        tunis.ajouterCommune(new Commune("Bab Souika", 150000));
        System.out.println("************************************************************************************************");

        // Ville Sfax
        Ville sfax = new Ville("Sfax");
        sfax.ajouterCommune(new Commune("Sakiet Ezzit", 120000));
        sfax.ajouterCommune(new Commune("Sakiet Eddaier", 180000));
        sfax.ajouterCommune(new Commune("El Ain", 70000));
        sfax.ajouterCommune(new Commune("Thyna", 40000));
        System.out.println("************************************************************************************************");

        // Ville Sousse
        Ville sousse = new Ville("Sousse");
        sousse.ajouterCommune(new Commune("Bouhsina", 90000));
        sousse.ajouterCommune(new Commune("Hammam Sousse", 130000));
        sousse.ajouterCommune(new Commune("Khezama", 60000));
        sousse.ajouterCommune(new Commune("Sidi Abdelhamid", 45000));
        System.out.println("************************************************************************************************");

        // Ville Nabeul
        Ville nabeul = new Ville("Nabeul");
        nabeul.ajouterCommune(new Commune("Korba", 80000));
        nabeul.ajouterCommune(new Commune("Dar Chaabane", 60000));
        nabeul.ajouterCommune(new Commune("Mrezga", 30000));
        nabeul.ajouterCommune(new Commune("Hammamet", 120000));
        System.out.println("************************************************************************************************");

        // Ville Monastir
        Ville monastir = new Ville("Monastir");
        monastir.ajouterCommune(new Commune("Ksar Hellal", 90000));
        monastir.ajouterCommune(new Commune("Moknine", 70000));
        monastir.ajouterCommune(new Commune("Sahline", 50000));
        monastir.ajouterCommune(new Commune("Bembla", 40000));
        System.out.println("************************************************************************************************");

        // Ajouter les villes au pays Tunisie
        tunisie.ajouterVille(tunis);
        tunisie.ajouterVille(sfax);
        tunisie.ajouterVille(sousse);
        tunisie.ajouterVille(nabeul);
        tunisie.ajouterVille(monastir);
        System.out.println("************************************************************************************************");

        System.out.println("Villes en Tunisie:");
        tunisie.afficherVilles();

        // Rechercher une ville
        Ville villeTrouvee = tunisie.rechercherVille("Sfax");
        if (villeTrouvee != null) {
            System.out.println("************************************************************************************************");

            System.out.println("Ville trouvée: " + villeTrouvee);
            villeTrouvee.afficherCommunes(); // Affiche les communes de Sfax
        } else {
            System.out.println("Ville non trouvée.");
        }

        // Calcul du nombre total d'habitants dans le pays
        int totalHabitants = tunisie.calculerNombreTotalHabitants();
        System.out.println("************************************************************************************************");
        System.out.println("Nombre total d'habitants en Tunisie: " + totalHabitants);

        System.out.println("************************************************************************************************");
        

    }
}
