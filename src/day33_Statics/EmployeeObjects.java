package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        employee1.salary = 110000;

        Employee employee2 = new Employee();
        employee2.name = "Aygun";
        employee2.salary = 115000;

        Employee employee3 = new Employee();
        employee3.name = "Fady";
        employee3.salary = 120000;


        //We didn't use toString method in Employee class because we're printing variables, not objects

        System.out.println( employee1.name + " : " +employee1.salary);//Prints the last name and last salary if we use static in Employee class
        System.out.println( employee2.name + " : " +employee2.salary);//Prints the last name and last salary if we use static in Employee class
        System.out.println( employee3.name + " : " + employee3.salary);//Prints the last name and last if we use static in Employee class

        System.out.println( employee1.isHuman );
        System.out.println( employee2.isHuman );
        System.out.println( employee3.isHuman );





    }
}
