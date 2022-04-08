package day33_Statics.TaskAndSolutions;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person("Josh", 28, 'M');
        Person person2 = new Person("Breanna", 32, 'F');

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);


        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);

        person1.eat("pizza");
        person2.drink("coke");
        person1.sleep();

    }
}
