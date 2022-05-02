package day44_Abstraction.animal;

public final class Tiger extends Animal implements WildAnimal{

    public Tiger(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){

        System.out.println(getName() + " is eating deer");
    }

    public void hunt(){

        System.out.println(getName() + " hunts deer");
    }
}
