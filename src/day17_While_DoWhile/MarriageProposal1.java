package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me");
        String answer = scan.next().toLowerCase();
        int attempt = 0;

            while(!(answer.equals("yes") || answer.equals("no"))){

                System.out.println("Invalid answer, please try again");

                System.out.println("Will you marry me");
               answer = scan.next().toLowerCase();
               attempt++;
               if(attempt==2){
                   System.out.println("yaylan");
                   break;
               }
            }
        if(answer.equals("yes")){

            System.out.println("congrats");

        }else if(answer.equals("no")){

            System.out.println("goodbye");
        }

    }
}
