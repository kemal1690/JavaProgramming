package day18_NestedLoop;



public class DivideTwoNumbers {
    public static void main(String[] args) {



        int a = 30; //a =30-7=23-7=16 -7 =9 - 7 = 2
        int b = 7;

        int count = 0; // count = 1+1=2+1 = 3+1 =4

        while (a >= b) {
            a -= b;
            count++;
        }


        System.out.println(count+" with a remainder of "+a);


    }

}



/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int count = 0;

        while(num1>=num2){

            num1 -= num2;
            count++;
        }
        System.out.println(count + " remainder: " + num1);



1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators
                        20 / 6 ==> 3 with the reaminder of 2
                        a = 20
                        b = 6;
                        a -= b;  // a = 14  three times
                        a -= b;  // a = 8
                        a -= b;  // a = 2   remainder
                        x = 100;
                        y = 8;
                        while(a >= b){
                                a -= b;
                                count++;

 */