package day39_Recap.animalTask;

public class Lion extends WildAnimal{

    public Lion(String name, String breed, int age, char gender, char size, String color) {
        super(name, breed, age, gender, size, color);
    }


    public void hunt(){

        System.out.println("Lion "+getName()+" hunts buffaloes");
    }
}
