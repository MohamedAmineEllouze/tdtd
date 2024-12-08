import java.util.Objects;

public class Commune {
    private String nom;
    private int nombreHabitants;

    public Commune(String nom, int nombreHabitants) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNombreHabitants() {
        return nombreHabitants;
    }

    public void setNombreHabitants(int nombreHabitants) {
        this.nombreHabitants = nombreHabitants;
    }

    @Override
    public String toString() {
        return nom + " : " + nombreHabitants + " habitants";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commune commune = (Commune) o;
        return Objects.equals(nom, commune.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}

