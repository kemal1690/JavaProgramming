package day16_ForLoopStringPractice;

import java. util.Scanner;

public class NewLineString {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below

       String result = " ";

        for(int i = 0; i < word.length(); i++){

            char ch =  word.charAt(i);
            result = "\n" + ch;
            System.out.print(result);


        } inp.close();
















    }






}
