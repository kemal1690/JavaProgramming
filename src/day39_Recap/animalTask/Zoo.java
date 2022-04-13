package day39_Recap.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Lily","crum",3,'M','S',"black");
        Dog dog = new Dog("Comar","Kangal",3,'F','L',"White");
        Tiger tiger = new Tiger("Azman","Ashley",2,'M','S',"Pink");
        Eagle eagle = new Eagle("Kartal","twin-head",2,'M','L',"black");


        cat.eat();
        System.out.println(cat.getAge());

        dog.setAge(4);

        System.out.println(dog);

        tiger.setGender('F');

        System.out.println(tiger);

        tiger.eat();







    }
}
