package tn.esprit.gestionemplye.main;
import tn.esprit.gestionemplye.entities.Employe;
import tn.esprit.gestionemplye.entities.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ali", "Ben Salah", "RH", 2);
        Employe e2 = new Employe(1, "Sami", "Trabelsi", "IT", 3);
        Employe e3 = new Employe(2, "Hana", "Gharbi", "IT", 1);
        Employe e4 = new Employe(4, "Noura", "Ayadi", "Finance", 2);

        // L'Ajout
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("=== Liste initiale ===");
        societe.displayEmploye();

        // La recherche
        System.out.println("\nRecherche par nom 'Ali' : " + societe.rechercherEmploye("Ali"));

        // Le tri naturel (id)
        societe.trierEmployeParId();
        System.out.println("\n=== Tri par ID ===");
        societe.displayEmploye();

        // Le tri par Département + Grade + Nom
        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\n=== Tri par Département, Grade et Nom ===");
        societe.displayEmploye();

        // la recherche avancée
        System.out.println("\n=== Employés du département IT ===");
        for (Employe e : societe.rechercherParDepartement("IT")) {
            System.out.println(e);
        }
    }
}
