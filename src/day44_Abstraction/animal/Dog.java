package day44_Abstraction.animal;


public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating pizza");
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }

   public void play(){//Access modifier of interface method is public thats why we cannot give default access modifier
                        //While overriding a method A.M must be same or more visible

       System.out.println(getName() + " is playing with ball");
    }

}
