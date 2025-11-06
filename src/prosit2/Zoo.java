package prosit2;

public class Zoo {
    Animal[] animals = new Animal[25]; // tableau d'animaux
    String name;
    String city;
    int nbrCages;

    // Constructeur
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // Méthode displayZoo
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo : " + name + " est situé à " + city + " avec " + nbrCages + " cages";
    }
}
