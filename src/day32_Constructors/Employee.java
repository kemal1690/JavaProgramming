package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public int salary;


    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, char gender){
        this(name); //this.name = name; executes the previous name
        this.gender = gender;
    }

    public Employee(String name,char gender,String jobTitle){
        this(name,gender);
        this.jobTitle =jobTitle;

    }

    public Employee(String name,char gender,String jobTitle, int salary){
        this(name,gender,jobTitle);//we use these 3 attributes from previous constructor
        this.salary = salary;

    }
    /*
    public void method1(){
        this("Aaron");
    }
*/

     /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){ We can call previous method inside this method
        method1();
    }
    */

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
