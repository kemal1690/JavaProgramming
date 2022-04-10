package day37_Inheritance.animalTask;

    public class Cat extends Animal {

//shortcut of super constructor: at the end of the class line hold Alt + enter twice
        //Also right click generate => constructor
        public Cat(String name, String breed, char gender, int age, String size, String color) {
            super(name, breed, gender, age, size, color);
        }

        public void scratch(){

            System.out.println(name + " is scratching");
        }
    }
