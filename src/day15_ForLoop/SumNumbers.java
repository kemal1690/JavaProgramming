package day15_ForLoop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {


        int total = 0;


        Scanner scan = new Scanner(System.in);


        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number");
            total += scan.nextInt();

        }
        System.out.println(total);

            scan.close();








    }
}
