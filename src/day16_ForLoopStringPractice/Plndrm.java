package day16_ForLoopStringPractice;

public class Plndrm {
    public static void main(String[] args) {

        String str = "racecar";

        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {

         reversed += str.charAt(i);
         }
        System.out.println(reversed);
        if (str.equalsIgnoreCase(reversed)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");

        }






















    }
}
