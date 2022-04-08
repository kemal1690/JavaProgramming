
package day30_CustomClass;

import java.util.ArrayList;

public class ExtractElement {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";


        ArrayList<Character> letters = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {

            if(Character.isLetter(str.charAt(i)))
                letters.add(str.charAt(i));
        }
        ArrayList<Character> digits = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {

            if(Character.isDigit(str.charAt(i)))
                digits.add(str.charAt(i));
        }

        ArrayList<Character> specialChars = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {

            if(!Character.isLetterOrDigit(str.charAt(i)))
                specialChars.add(str.charAt(i));
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
