package day43_Abstraction.employee;

public abstract class Employee extends Person{//Employee is a generic name
    //in the abstract child class it is not mandatory to override abstract method of the parent classs
    //Because abstract class can have abstaract method too

    private final int id;//We cann not create setter for final varibales
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if(id<=0){ // we can create a condition for final variables within the constructor block
            throw new RuntimeException("Invalid ID : " + id);
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            throw new RuntimeException("Invalid salary : " + salary);
        }
        this.salary = salary;
    }

    public abstract void work();



    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", id=" + id +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
