package prosit4.esprit.gestionzoo.entities;

public class Animal {

    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, boolean isMammal, int age, String name) {
        this.family = family;
        this.isMammal = isMammal;
        setAge(age);
        this.name = name;
    }
    public Animal(){}

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println(" L’âge ne peut pas être négatif");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}