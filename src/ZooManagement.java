public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Zoo de Tunis", "Tunis");
        Zoo zoo2 = new Zoo("Zoo de Sousse", "Sousse");

        Animal lion = new Animal("Félins", "Lion", 5, true);
        Animal tiger = new Animal("Félins", "Tigre", 4, true);
        Animal elephant = new Animal("Éléphants", "Éléphant", 10, true);
        Animal monkey = new Animal("Primates", "Singe", 2, true);


        System.out.println(zoo1.addAnimal(lion));
        System.out.println(zoo1.addAnimal(tiger));
        System.out.println(zoo1.addAnimal(lion));

        zoo1.displayAnimals();


        System.out.println("Recherche du lion : " + zoo1.searchAnimal(lion));
        System.out.println("Recherche du singe : " + zoo1.searchAnimal(monkey));

        System.out.println("Suppression du tigre : " + zoo1.removeAnimal(tiger));
        zoo1.displayAnimals();

        System.out.println("Zoo plein ? " + zoo1.isZooFull());


        zoo2.addAnimal(elephant);
        zoo2.addAnimal(monkey);


        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d’animaux est : " + plusGrand.name);
    }
}
