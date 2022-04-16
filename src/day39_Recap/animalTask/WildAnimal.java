package day39_Recap.animalTask;

public class WildAnimal extends Animal{

    public static boolean isWild = true,
                        isFriendly = false,
                        isPlayable = false;




    public WildAnimal(String name, String breed, int age, char gender, char size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }

}
