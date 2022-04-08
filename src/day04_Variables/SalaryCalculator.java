package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        //hourlyRate, weeklyHours   Note: first letters are written with lower case, second upper case

        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberOfWeeks =52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks;   // 52 weeks in a year

        // System.out.println(salary);

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = $" + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);







    }




}
