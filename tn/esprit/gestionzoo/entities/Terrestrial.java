package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    protected int nbrLegs;
    public Terrestrial() {
        super();
    }


    public Terrestrial(String family, boolean isMammal, int age, String name, int nbrLegs) {
        super(family, isMammal, age, name);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + "Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                '}';
    }
}
