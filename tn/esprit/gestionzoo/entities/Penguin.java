package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
   protected float swimmingDepth;
    public Penguin() {
        super();
    }


    public Penguin(String family, boolean isMammal, int age, String name, String habitat, float swimmingDepth) {
        super(family, isMammal, age, name, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}

