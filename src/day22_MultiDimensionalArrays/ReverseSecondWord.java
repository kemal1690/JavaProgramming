package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";

        String[] word = sentence.split(" ");

        String result = "";

        for (int i = word.length - 1; i >= 0; i--) {

           result += word[i]+" ";

        }

        System.out.print(result);




    }
}
