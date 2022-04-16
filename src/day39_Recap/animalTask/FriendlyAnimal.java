package day39_Recap.animalTask;

public class FriendlyAnimal extends Animal {

    public static boolean isWild = false,
            isFriendly = true,
            isPlayable = true;


    public FriendlyAnimal(String name, String breed, int age, char gender, char size, String color) {
        super(name, breed, age, gender, size, color);
    }


    public void pet(){
        System.out.println(getName()+" likes being petted");
    }

    public void playing(){
        System.out.println(getName()+" is playing");
    }




















}