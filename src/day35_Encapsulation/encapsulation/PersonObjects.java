package day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {

    Person p1 = new Person();

        // p1.name = "Daniel";
        //  p1.age = 28;

        //   p1.name = ""; if we dont make them private we cannot restrict them
        //   p1.age = 2000;

        p1.setName("Daniel");
        p1.setAge(45);

       // System.out.println(p1.name +" : "+p1.age);//we cannot access directly

        System.out.println(p1.getName() +" : "+ p1.getAge());
















    }
}
