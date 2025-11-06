package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;




public class Main {
    public static void main(String[] args) {
    Zoo zoo1 = new Zoo("Zoo de Tunis", "Tunis",3);
    Zoo zoo2 = new Zoo("Zoo de Gafsa", "Gafsa",3);

    Animal a1 = new Animal("Lion",true , 5, "Simba");
    Animal a2 = new Animal("Loup", true, 3, "sisi");
    Animal a3 = new Animal("Oiseau",false , 2, "oiseau");
    Animal a4 = new Animal("Girafe", false, -4, "Gigi");
        try {
            zoo1.addAnimal(a1);
        } catch (ZooFullException | InvalidAgeException e) {}
        System.out.println("Nombre d’animaux après l'ajout : " + zoo1.getAnimalCount());

        try {
            zoo1.addAnimal(a2);
        } catch (ZooFullException  | InvalidAgeException e) {}
        System.out.println("Nombre d’animaux après ajout : " + zoo1.getAnimalCount());

        try {
            zoo1.addAnimal(a3);
        } catch (ZooFullException  | InvalidAgeException e) {}
        System.out.println("Nombre d’animaux après ajout : " + zoo1.getAnimalCount());

        // Ajout d’un animal qqui dépasse la capacité
        try {
            zoo1.addAnimal(a4);
        } catch (ZooFullException | InvalidAgeException e) {}
        System.out.println("Nombre total d’animaux : " + zoo1.getAnimalCount());



        zoo1.displayZoo();
        zoo1.displayAnimals();


        System.out.println("Recherche de Loup : " + zoo1.searchAnimal(a2));
        System.out.println("Recherche de Tigre : " + zoo1.searchAnimal(new Animal("Tigre", true, 4,"tigre")));


        zoo1.removeAnimal(a2);
        zoo1.displayAnimals();


    Zoo comparer = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d’animaux est : " + comparer);





    //Aquatic aquatic = new Aquatic();
    Terrestrial terrestrial = new Terrestrial();
    Dolphin dolphin = new Dolphin();
    Penguin penguin = new Penguin();



    //Aquatic aq1 = new Aquatic("Poisson", false, 2, "Nemo", "océan");
    Terrestrial t1 = new Terrestrial("Chat", true, 3, "Felix", 4);
    Dolphin d1 = new Dolphin("Dauphin", true, 6, "Flipper", "mer", 20.5f);
    Penguin p1 = new Penguin("Pingouin", false, 4, "Pingu", "glace", 15.0f);

    //System.out.println(aq1);
        System.out.println(t1);
        System.out.println(d1);
        System.out.println(p1);



    //aq1.swim();
        d1.swim();
        p1.swim();



    //zoo1.addAquaticAnimal(aq1);
        zoo1.addAquaticAnimal(d1);
        zoo1.addAquaticAnimal(p1);

        zoo1.AnimalsSwim();

        System.out.println("le profondeur maximale des pingouins : " + zoo1.getMaxPenguinDepth());
        zoo1.displayNumberOfAquaticTypes();


}

}