package day43_Abstraction.employee;

public abstract class Person {//grand parent class, Person is a generic name

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);//setters check the conditions
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract void sleep();

    public void eat(){//We assume that this implementation is common among all the subclasses
        System.out.println(name + " is eating baklava");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
