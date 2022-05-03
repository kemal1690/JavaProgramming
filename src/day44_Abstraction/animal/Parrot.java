package day44_Abstraction.animal;

public final class Parrot extends Animal implements Playable, Flyable{

    public Parrot(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating chocolate");
    }

    public void play(){

        System.out.println(getName() + " is playing with ball");
    }

    public void fly(){

        System.out.println(getName() + " can fly 20km/h");
    }
}
