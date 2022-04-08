package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int n = 7;//1-7 is given to us. Nested if-pre condition is tricky now


        if(n == 1){
            System.out.println("Monday");
        } else if (n == 2){
            System.out.println("Tuesday");
        } else if (n == 3){
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

        // Every if block consists of one value and same data type(String)
        //That's why we can use ternary to shorten it
        System.out.println("---------------------------------------------------");

        String result = (n == 1)? "Monday" :(n == 2)? "Tuesday" :(n == 3)? "Wednesday"
                :(n == 4)? "Thursday" :(n == 5)? "Friday" :(n == 6)? "Saturday" : "Sunday";
        System.out.println(result);













    }
}
