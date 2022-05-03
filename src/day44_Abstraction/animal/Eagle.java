package day44_Abstraction.animal;

public final class Eagle extends Animal implements WildAnimal, Flyable{

    public Eagle(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){

        System.out.println(getName() + " is eating snake");
    }

    public void hunt(){

        System.out.println(getName() + " hunts snakes");
    }

    public void fly(){

        System.out.println(getName() + " can fly 50/h");
    }
}
