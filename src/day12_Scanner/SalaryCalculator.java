package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your hourly rate");
        int hourlyRate = scan.nextInt();
        System.out.println("how many hours do you work in a week");
        int weeklyHour = scan.nextInt();
        System.out.println("Enter state tax");
        double stateTax = scan.nextDouble();
        System.out.println("Enter federal tax");
        double federalTax = scan.nextDouble();

        Double totalTax = stateTax + federalTax;
        int salary = weeklyHour * hourlyRate * 52;
        double netIncome =  salary - (salary * totalTax);

        System.out.println("totalTax = " + totalTax);
        System.out.println("salary = " + salary);
        System.out.println("netIncome = " + netIncome);;
        scan.close();

















    }
}
/*Ask the user to enter his/her hourlyRate
Ask the user how many hours does he/she work in a week
Ask the user to enter state tax (in percentage)
Ask the user to enter federal tax (in percentage)
calculate the
salary
stateTax
federalTax
totalTax
netIncome


 */