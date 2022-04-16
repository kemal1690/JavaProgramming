package day39_Recap.animalTask;

public class Crocodile extends WildAnimal{


    public Crocodile(String name, String breed, int age, char gender, char size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void hunt(){
        System.out.println("Crocodile " + getName()+" hunts reptiles");
    }

}
