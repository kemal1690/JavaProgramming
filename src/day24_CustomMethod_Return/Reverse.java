package day24_CustomMethod_Return;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        String str = "Java";

        String result = reverse(str);

        System.out.println(result);

    }

    public static String reverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            result += str.charAt(i);

        }


        return result;

    }
}