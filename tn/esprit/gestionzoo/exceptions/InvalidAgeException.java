package tn.esprit.gestionzoo.exceptions;

public class InvalidAgeException  extends Exception {
    public InvalidAgeException() {
        System.out.println("Âge d’animal invalide : l’âge ne peut pas être négatif .");
    }
}
