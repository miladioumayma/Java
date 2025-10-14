package prosit4.esprit.gestionzoo.entities;

public class Zoo {
    static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals = new Animal[NUMBER_OF_CAGES];
    private String name;
    private String city;
    private int animalCount;


    // Constructeur
    public Zoo(String name, String city) {
        setName(name);
        setCity(city);
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name == null) {
            return false;
        }
        this.name = name;
        return true;
    }

    public String getCity() {
        return city;
    }

    public boolean setCity(String city) {
        if (city == null) {
            return false;
        }
        this.city = city;
        return true;
    }

    // Getter pour animalCount
    public int getAnimalCount() {
        return animalCount;
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
        if (isZooFull()) {
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        System.out.println(animal.getName() + " a été ajouté au zoo.");
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
            if (animal.getName() == (animals[i].getName()))
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


    //le tableau aquatic
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaCount = 0;

    // la methode  addAquaticanimal
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaCount < aquaticAnimals.length) {
            aquaticAnimals[aquaCount++] = aquatic;
        } else {
            System.out.println("Le tableau des animaux aquatiques est plein !");
        }

    }

    // la methode AnimalSwim
    public void AnimalsSwim() {
        System.out.println("Les animaux aquatiques nagent :");
        for (int i = 0; i < aquaCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // la methode getMaxPenguinDepth
    public float getMaxPenguinDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.swimmingDepth > maxDepth) {
                    maxDepth = p.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }

    //la methode displayNumberOfAquaticTypes
    public void displayNumberOfAquaticTypes() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin)
                dolphinCount++;
            else if (aquaticAnimals[i] instanceof Penguin)
                penguinCount++;
        }

        System.out.println("le nombre de dauphins : " + dolphinCount);
        System.out.println("le nombre de pingouins : " + penguinCount);
    }
}