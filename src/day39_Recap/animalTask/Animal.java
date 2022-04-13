package day39_Recap.animalTask;

public class Animal {

    private String name, breed;
    private int age;
    private char gender,size;
    private String color;

    public Animal(String name, String breed, int age, char gender, char size, String color) {
       setName(name);
       setBreed(breed);
       setAge(age);
       setGender(gender);
       setSize(size);
       setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name == null){
            System.out.println("Name cannot be null");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age<=0){
            System.out.println("Age cannot be negative or zero");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( !(gender=='M'|| gender =='F') ){

            System.out.println("Gender cannot be different than male or female");
            System.exit(1);
        }
        this.gender = gender;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        if( !(size=='S' || size == 'M' || size == 'L') ){
            System.out.println("Invalid size");
            System.exit(1);
        }
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(){

        System.out.println(name + " is eating food");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
