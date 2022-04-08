package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabet = new char[26];//26 is the length of the array
                                        //Z-A
        /*        i     ch
        alphabets[0] = 'Z'; //90
        alphabets[1] = 'Y'; //89
        alphabets[2] = 'X'; //88
            ...
        */

        for (char i = 0, j = 'Z'; i < alphabet.length; i++, j--) {

            alphabet[i] = j;
        }

        System.out.println(Arrays.toString(alphabet)); // print the whole array
        //       System.out.println( alphabets[0] ); // printing the element of array
        //   System.out.println( alphabets );
/*
        char ch = 'Z';
        for (int i = 0; i < alphabet.length  ; i++, ch--) {
            alphabet[i] = ch;

        }

*/





















    }
}
