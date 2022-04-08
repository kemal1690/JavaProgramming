package day36_Inheritance.employeeTask;

public class Company {

    public static void main(String[] args) {

        Tester tester = new Tester();

        tester.setInfo("Aslı",'F',28,"SDET",123,110000,"Amazon");
        tester.testing();

        Developer developer = new Developer();
        developer.setInfo("Kemal",'M',28,"developer",234,150000,"Apple");
        developer.coding();

        Driver driver = new Driver();
        driver.setInfo("John",'M',35,"driver",543,70000,"Fedex");
        driver.driving();











    }
}
