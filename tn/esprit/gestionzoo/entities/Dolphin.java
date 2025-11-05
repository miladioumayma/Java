package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    protected float swimmingSpeed;
    public Dolphin() {
        super();
    }


    public Dolphin(String family, boolean isMammal, int age, String name, String habitat, float swimmingSpeed) {
        super(family, isMammal, age, name, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

}


