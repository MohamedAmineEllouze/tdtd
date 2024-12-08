// L'objectif de ce code est de modéliser une gestion simple d'une section universitaire contenant des étudiants,
// en permettant d'ajouter des étudiants à une section, de calculer la moyenne générale de la section, 
// de trouver les meilleurs étudiants (majors de promo), et de trier les étudiants par leur moyenne.


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        // Création d'une section
        Section section = new Section(1, "Informatique", "Licence 3");

        // Ajouter des étudiants
        Etudiant etudiant1 = new Etudiant("Doe", "John");
        etudiant1.ajouterNote(14.0);
        etudiant1.ajouterNote(15.5);
        section.ajouterEtudiant(etudiant1);

        Etudiant etudiant2 = new Etudiant("Smith", "Jane");
        etudiant2.ajouterNote(16.0);
        etudiant2.ajouterNote(17.0);
        section.ajouterEtudiant(etudiant2);

        Etudiant etudiant3 = new Etudiant("Dupont", "Marie");
        etudiant3.ajouterNote(12.0);
        etudiant3.ajouterNote(13.0);
        section.ajouterEtudiant(etudiant3);
        System.out.println("**********************************************************************");

    
        System.out.println("Section initiale : \n" + section);

        System.out.println("********");

        double moyenneSection = section.calculerMoyenneSection();
        System.out.println("Moyenne de la section : " + moyenneSection);
        System.out.println("*********");

        
        List<Etudiant> majors = section.obtenirMajorsDePromo();
        System.out.println("Majors de promo : " + majors);
        System.out.println("**********************************************************************");

        section.trierEtudiantsParMoyenne();
        System.out.println("Section après tri des étudiants par moyenne : \n " + section);
    }
}

