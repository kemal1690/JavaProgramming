package day33_Statics.TaskAndSolutions;

public class CydeoTest {

    public static void main(String[] args) {


        CydeoStudent student1 = new CydeoStudent("Jimmy", 'M', 29, 14, 25, 16, 'C');

        CydeoStudent student2 = new CydeoStudent("Kathy", 'F', 28, 15, 25, 13, 'A');


        System.out.println(student1);
        System.out.println(student2);

        student2.study();
        student2.attendClass();
        student1.schoolName();
        student2.printProgLanguage();














    }
}
