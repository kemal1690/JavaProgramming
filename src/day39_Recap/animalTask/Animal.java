package day39_Recap.animalTask;

public class Animal {

    private String name, breed;
    private int age;
    private char gender, size;
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

        if (name == null) {
            System.err.println("Invalid name");
            System.exit(1);
        }

        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);

        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed == null) {
            System.err.println("Invalid breed");
            System.exit(1);

        }
        if (breed.isEmpty() || breed.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);

            this.breed = breed;
        }
    }
        public int getAge () {
            return age;
        }

        public void setAge ( int age){

            if (age <= 0) {
                System.out.println("Age cannot be negative or zero");
                System.exit(1);
            }
            this.age = age;
        }

        public char getGender () {
            return gender;
        }

        public void setGender ( char gender){

        gender = (""+gender).toUpperCase().charAt(0);
            if (!(gender == 'M' || gender == 'F')) {

                System.out.println("Invalid gender");
                System.exit(1);
            }
            this.gender = gender;
        }

        public char getSize () {
            return size;
        }

        public void setSize ( char size){
            if (!(size == 'S' || size == 'M' || size == 'L')) {
                System.out.println("Invalid size");
                System.exit(1);
            }
            this.size = size;
        }

        public String getColor () {
            return color;
        }

        public void setColor (String color){

            if(color == null){
                System.err.println("Invalid color");
                System.exit(1);
            }

            if(color.isEmpty() || color.isBlank()){
                System.err.println("Invalid color");
                System.exit(1);
            }
            this.color = color;
        }

        public void eat () {

            System.out.println(name + " is eating food");
        }

    public void drink(){
        System.out.println(name+" drinks water");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void move(){
        System.out.println(name+" is moving");
    }


    public String toString () {
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
