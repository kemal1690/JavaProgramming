package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

    char[] letters = new char[26];
     /*
        letters[0] = 'A';
        letters[1] = 'B';
        letter[2] = 'C';
        ....
         */
/*
        //every single char has a number that's why we can assign second char data type for the int
        for (char i = 'A', j=0 ; i <='Z' && j< letters.length ; i++,j++) {//i stands for the characters==>'A'-'Z'
                        //j stands for the index numbers of 'A'-'Z'

            letters[j] = i ;

 */
        char ch = 'A';
        for (int i = 0; i < letters.length ; i++, ch++) {
            letters[i] = ch;

        }


        System.out.println(Arrays.toString(letters));


    }
}
/*
  char ch = 'A';
        int i = 0;

        for (char letter : letters) {

            letters[i++] = ch++;
        }
        System.out.println(Arrays.toString(letters));
 */