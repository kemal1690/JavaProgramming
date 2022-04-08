package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;


/*
    public void setInfo(String name, char gender, int age, int ID, char grade){//These are local variable that can have the same name with the instance variables,
                                                                            //Beacuse they are different variables
    //name = name;by default local variable is assigned to local variable not to instance variable if we assign like that
        // thats why we have to use this keyword
    this.name = name;//IOT make complier to know instance variable we have to use 'this' keyword
    this.gender = gender;
    this.age = age;
    this.ID = ID;
    this.grade = grade;


}
 */

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }


    public void code() {

        System.out.println(name + " is coding");
    }
    public void sleep(){

        System.out.println(name + " is sleeping");
    }


}