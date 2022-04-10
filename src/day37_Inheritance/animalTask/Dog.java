package day37_Inheritance.animalTask;

public class Dog extends Animal {

    //public int a; extra instance variable of Dog class
    public Dog(String name, String breed, char gender, int age, String size, String color){//we add int a here
        super(name, breed, gender, age, size, color);//Ctrl + space shows choices
        //this a = a;
    }

    public void bark(){

        System.out.println(name+" is barking");
    }

}


