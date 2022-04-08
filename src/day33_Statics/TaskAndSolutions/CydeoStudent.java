package day33_Statics.TaskAndSolutions;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int id;
    public int batchNumber, groupNumber;
    public char grade;

    public static String schoolName = "Cydeo", programmingLanguage = "Java";

    public CydeoStudent(String name, char gender, int age, int id, int batchNumber, int groupNumber, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public void study(){

        System.out.println(name + " is studying " + programmingLanguage);

    }

    public void attendClass(){

        System.out.println(name + " is attending class");

    }

    public static void schoolName(){

        System.out.println("School name : " + schoolName);

    }

    public static void printProgLanguage(){

        System.out.println("Programming Language : " + programmingLanguage);

    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                '}';
    }
}
/*
1. Create a class named CydeoStudent:
				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage
				Add a constructor that can set All the fields (instances)
				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */