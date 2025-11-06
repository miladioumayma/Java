public class Zoo {
    static final int NUMBER_OF_CAGES = 25;
    Animal[] animals=new Animal[NUMBER_OF_CAGES];
    String name, city;
    int animalCount;


    // Constructeur
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // Méthode displayZoo
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + animalCount);
    }
    // L'ajout
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (animalCount == NUMBER_OF_CAGES)
            return false;
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

 //l'affichage
     public void displayAnimals() {
        System.out.println("Animaux du zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println((i + 1) + " - " + animals[i]);
        }
    }



    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animal.name.equals(animals[i].name))
                return i;
        }
        return -1;
    }

    //suppression
    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1) return false;

        for (int i = indexAnimal; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }
    //la méthode full
    public boolean isZooFull() {
        return animalCount == NUMBER_OF_CAGES;
    }
    //la comparison
    public static Zoo comparerZoo(Zoo zoo1, Zoo zoo2) {
        if (zoo1.animalCount >= zoo2.animalCount) {
            return zoo1;
        } else {
            return zoo2;
        }
    }





    @Override
    public String toString() {
        return "Zoo : " + name + " est situé à " + city + " avec " + NUMBER_OF_CAGES + " cages";
    }

}



