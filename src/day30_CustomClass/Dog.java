package day30_CustomClass;

public class Dog {
//instance variables
public String name;
public String breed;
public int age;
public char gender;
public String size;
public String color;


    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
      //We are assigning the argument for the intance variables
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender= dogGender;
        size = dogSize;
        color = dogColor;
    }


public void eat(){// We dont write static because static cannot store the copies of the object

    System.out.println(name + " is eating");
}

public void bark(){//instance method;

    System.out.println(name + " is barking");

}

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

//instance variables or instance methods means every different object has seperate copies















/*
Attributes:
    name, age, gender, breed, size, color
Actions:
    eat(), play(), bark() ....
 */