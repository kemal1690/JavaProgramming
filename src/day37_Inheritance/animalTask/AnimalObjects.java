package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {


        Dog dog1 = new Dog("Alex", "Husky", 'M',1,"Small","White");
        //Animal{name='Alex', breed='Husky', gender=M, age=1, size='Small', color='White'}
        //to change animal to Dog we need to implement method overriding for toString method

        System.out.println(dog1);

        dog1.bark();
        //dog1.scratch();We cannot call
        //dog1.sing();We cannot call


        Cat cat1 = new Cat("Love", "Siamese",'F',2,"Large","Black");

        System.out.println(cat1);
        cat1.scratch();
        //  cat1.bark();We cannot call
        //  cat1.sing();We cannot call


        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue");

        System.out.println(parrot1);

        parrot1.sing();
        //  parrot1.bark();We cannot call
        //  parrot1.scratch();We cannot call










    }

}
