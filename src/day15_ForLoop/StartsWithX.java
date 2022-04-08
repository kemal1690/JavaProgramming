package day15_ForLoop;
import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        System.out.println("Enter a word");

        String word = new Scanner(System.in).next();//If we have just one input we can write like that
        //If we dont write Scanner variable no worries for closing Scanner

        if(word.charAt(0) == 'x'){
          word = word.replaceFirst("x","a");
        }
        System.out.println(word);




    }
}
/*
1. Write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */