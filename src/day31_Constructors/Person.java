package day31_Constructors;

public class Person {

    public String name;
    public char gender;
    public int age;


    public Person(String name, char gender, int age){//One constructor with 3 parameters

        this.name = name;
        this.gender = gender;
        this.age = age;



    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }











}
