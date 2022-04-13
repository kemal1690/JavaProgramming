package day39_Recap.animalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, int age, char gender, char size, String color) {
        super(name, breed, age, gender, size, color);
    }


    public void eat(){

        System.out.println(getName() + " is dog food");
    }
}
