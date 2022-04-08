package day24_CustomMethod_Return;

public class Palindrome {
    public static void main(String[] args) {

       String str = "Level";

      boolean result =  palindrome(str);

        System.out.println(result);


    }

public static boolean palindrome(String str){


   return Reverse.reverse(str).equalsIgnoreCase(str);


}





}
/*
4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false
				Ex:
					str = "Level"
					isPalindrome(str) ===> true
 */