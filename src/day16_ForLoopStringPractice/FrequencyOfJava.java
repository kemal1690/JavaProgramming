package day16_ForLoopStringPractice;
import java.util.Scanner;
public class FrequencyOfJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        int frequency = 0;
        for (int i = 0; i <= sentence.length()-4 ; i++) { //"java" includes 4 character and loop will check whole sentence
            // 4 by 4.(increasing one character everytime). So the length must be shorter as much as length of "java".
            String word =sentence.substring(i,i+4);//we must indicate how to compare word in sentence to find same words
            if(word.equalsIgnoreCase("java")){
                frequency++;//add one as the loop executions find a match
            }
        }scan.close();
        System.out.println(frequency);
    }
}










