package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        for(char i = 'A'; i<= 'Z'; i++){

            if(i == 'F'){
                break;//exits the loop
            }
            System.out.println(i+ " "); //A,B,C,D,E
        }
        //if print statement is located before the if statement output will be A,B,C,D,E,F
        System.out.println();
        System.out.println("----------------------------------------");

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num<0){
                break;
            }
        }
                scan.close();










    }
}
