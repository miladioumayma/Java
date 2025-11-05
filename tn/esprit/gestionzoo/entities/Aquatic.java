package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
    protected String habitat;

    public Aquatic(){
        super();
    }
    public Aquatic(String family, boolean isMammal, int age, String name, String habitat) {
        super(family, isMammal, age, name);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }


    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;

        Aquatic autre = (Aquatic) obj;
        return this.getName().equals(autre.getName())
                && this.getAge() == autre.getAge()
                && this.habitat.equals(autre.habitat);
    }


}

