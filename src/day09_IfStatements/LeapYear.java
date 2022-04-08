package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

    int year = 2001;
    boolean leapYear = year % 4 == 0;

        if(leapYear){
            System.out.println("Year " + year + " is leap Year");
        }
        if(!leapYear){  // Java compiler checks all if statements

            System.out.println("Year " + year + " is not a leap Year");
        }

        System.out.println("------------------------------------");

        if(year % 4 == 0) {
            System.out.println("Year " + year + " is leap Year");
        }else{
            System.out.println("Year " + year + " is not a leap Year");
        // Java compiler checks just the if statement and then if statement true it doesnt check the else
        }












    }
}
