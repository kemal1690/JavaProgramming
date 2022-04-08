package day33_Statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        Student student2 = new Student("Aygun", 'F');

        Student student3 = new Student("Nigara", 11);

        Student student4 = new Student("Mert", 12, 'A');

        Student student5 = new Student("Cihad", 'M', 28);

        Student student6 = new Student("Suhaib", 'M', 27, 15);

        Student student7= new Student("Ali",'M',42,30,'A');

        System.out.println(student1==student2);//false


       Student[] students = {student1,student2,student3,student4,student5,student6,student7};
       //Student is a custom class thats why we can store custom class objects as an array

        System.out.println(Arrays.toString(students));


        ArrayList<Student> students1 = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5,student6,student7));


        System.out.println(students1);



    }
}
