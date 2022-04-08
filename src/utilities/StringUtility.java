package utilities;

import java.util.Arrays;

public class StringUtility {

    // print each character of the given String
    public static void printEachChar(String str){

        for (int i = 0; i <str.length() ; i++) {

            System.out.println(str.charAt(i));

        }

    }

    // reverses the given String and returns the reversed str
    public static String reverse(String str){

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    // checks if the given String is palindrome, returns boolean
    public static boolean isPalindrome(String str){
       return reverse(str).equalsIgnoreCase(str);
    }

    // checks if the given String is anagram, returns boolean
    public static boolean isAnagram(String str1,String str2){ //"acb", "abc"

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

            return Arrays.equals(ch1,ch2);
        }

    // remove the duplicates from the String, returns String
    public static String removeDuplicates(String str){//"aaabbbbccc"==> "abc"

        String result = "";

        for (int i = 0; i <str.length(); i++) {

           char each =  str.charAt(i);

            if(!result.contains("" + each)){

                result += each;
            }
        }

        return result;

    }


















    }













