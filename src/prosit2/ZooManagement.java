package prosit2;

public class ZooManagement {
    public static void main(String[] args) {
// Création d’animaux
        Animal lion = new Animal("Félins", "Lion", 5, true);
        Animal elephant = new Animal("Éléphants", "Éléphant", 12, true);
        Animal crocodile = new Animal("Reptiles", "Crocodile", 7, false);
// Création d’un zoo
        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);
// Ajout des animaux au zoo
        myZoo.animals[0] = lion;
        myZoo.animals[1] = elephant;
        myZoo.animals[2] = crocodile;
// Affichage avec displayZoo
        myZoo.displayZoo();
// Affichage d’un animal
        System.out.println("Premier animal : " + lion);
// Affichage direct de l'objet Zoo
        System.out.println(myZoo);
    }
}
