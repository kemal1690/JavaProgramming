package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;  // any user entered number will be less than  2147483647
        //

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if(num < min){ //if the user entered number is lesser than current minimum number
                min = num;
            }

        }

        System.out.println("min = " + min);
        scan.close();



    }
}
