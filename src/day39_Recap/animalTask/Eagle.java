package day39_Recap.animalTask;

public class Eagle extends Animal{

    public Eagle(String name, String breed, int age, char gender, char size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void eat(){

        System.out.println(getName() + " is eating snakes");
    }
}
