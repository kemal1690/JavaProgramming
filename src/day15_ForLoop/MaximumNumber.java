package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max =  -2147483648;  // any user entered number will be greater than -2147483648==>temporary value
        // max= 1,2,3,4,5

        for (int i = 0; i < 5; i++) {//loop will be executed for five times

            System.out.println("Enter a number:");
            int num = scan.nextInt();//1, 2, 3, 1, 5,==> can be any number

            if(num > max){ //if the user entered number is greater than current maximum number
                           //greater number will be assigned to the max continuously
                max = num; //for example 2 is greater than 1, 3 is greater than 2
                //only the greater number will be assigned to the max
                //all inputs will be compared to the previous one
            }

        }

        System.out.println("max = " + max);
        scan.close();

    }
}

/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number
 */