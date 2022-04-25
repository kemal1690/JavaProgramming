package day43_Abstraction.employee;

public final class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {//method comes from Employee class
        System.out.println(getName()+" is developing application");
    }


    @Override
    public void sleep() {//method comes from Employee class(it comes to Employee class from person class)
        System.out.println(getName()+" sleeps 6 hours");
    }

    public void unitTest(){
        System.out.println(getName()+" is unit testing");
    }

}
