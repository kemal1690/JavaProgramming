package day44_Abstraction.animal;

public final class Eagle extends Animal {

    public Eagle(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){

        System.out.println(getName() + " is eating snake");
    }
}
