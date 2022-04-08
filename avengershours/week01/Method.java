package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Method {


/*
        * 1.Given a string, print the string made of its first two chars,
            * so the String "Hello" yields “HE".
            */
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    System.out.println(firstTwoChars(str));


    ArrayList<String> str1 = new ArrayList<>();
    scan.close();
}

   public static String firstTwoChars(String str){


      return str.toUpperCase().substring(0,2);

   }

   public static String firstTwoChars1(String str){

    char[] charArr = str.toCharArray();

    return (""+ charArr[0] + charArr[1]);
   }


















}
