package day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Daniel", 29, 'M', 'D', "MIT");
        student1.setAge(39);
        student1.setGrade('B');
        student1.setSchoolName("Cydeo");
        System.out.println(student1.getAge());
        System.out.println(student1);


    }
}
