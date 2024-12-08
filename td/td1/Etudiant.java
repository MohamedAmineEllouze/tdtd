import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Etudiant implements Comparable<Etudiant> {
    private String nom;
    private String prenom;
    private double moyenne;
    private List<Double> notes;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new ArrayList<>();
        this.moyenne = 0.0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public List<Double> getNotes() {
        return notes;
    }

 
    public void ajouterNote(double note) {
        notes.add(note);
        calculerMoyenne(); 
    }
    private void calculerMoyenne() {
        if (!notes.isEmpty()) {
            double total = 0.0;
            for (Double note : notes) {
                total += note;
            }
            this.moyenne = total / notes.size();
        }
    }


    public List<Double> obtenirNotesSuperieuresA12() {
        List<Double> notesSuperieuresA12 = new ArrayList<>();
        for (Double note : notes) {
            if (note > 12) {
                notesSuperieuresA12.add(note);
            }
        }
        return notesSuperieuresA12;
    }


    @Override
    public int compareTo(Etudiant autreEtudiant) {
        return Double.compare(this.moyenne, autreEtudiant.moyenne);
    }

    @Override
    public String toString() {
        return "Etudiant{Nom='" + nom + "', Prenom='" + prenom + "', Moyenne=" + moyenne + ", Notes=" + notes + "}";
    }
}