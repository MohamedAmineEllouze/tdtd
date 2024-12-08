// creer 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Section {
    private int numeroDuGroupe;
    private String filiere;
    private String niveau;
    private List<Etudiant> etudiants;


    public Section(int numeroDuGroupe, String filiere, String niveau) {
        this.numeroDuGroupe = numeroDuGroupe;
        this.filiere = filiere;
        this.niveau = niveau;
        this.etudiants = new ArrayList<>();
    }


    public int getNumeroDuGroupe() {
        return numeroDuGroupe;
    }

    public void setNumeroDuGroupe(int numeroDuGroupe) {
        this.numeroDuGroupe = numeroDuGroupe;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }
    public double calculerMoyenneSection() {
        if (etudiants.isEmpty()) return 0.0;
        double total = 0.0;
        for (Etudiant etudiant : etudiants) {
            total += etudiant.getMoyenne();
        }
        return total / etudiants.size();
    }

    public List<Etudiant> obtenirMajorsDePromo() {
        List<Etudiant> majors = new ArrayList<>();
        if (etudiants.isEmpty()) return majors;

        double maxMoyenne = etudiants.stream().mapToDouble(Etudiant::getMoyenne).max().orElse(0.0);

        for (Etudiant etudiant : etudiants) {
            if (etudiant.getMoyenne() == maxMoyenne) {
                majors.add(etudiant);
            }
        }
        return majors;
    }

    public void trierEtudiantsParMoyenne() {
        Collections.sort(etudiants, Comparator.comparingDouble(Etudiant::getMoyenne).reversed());
    }

    @Override
    public String toString() {
        return "Section{" +
                "NumeroDuGroupe=" + numeroDuGroupe +
                ", Filiere='" + filiere + '\'' +
                ", Niveau='" + niveau + '\'' +
                ", Etudiants=" + etudiants +
                '}';
    }
}
