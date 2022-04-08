package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str = "   ";

        boolean r = str.isEmpty();//false - totalLength>0 ==> false = is not empty
        System.out.println(r);
        System.out.println("----------------------------");
        boolean r1 = str.isBlank();//true
        System.out.println(r1);

        String str2 = "Cydeo     ";

        System.out.println(str2.isBlank());//false

        System.out.println("----------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("YES".equalsIgnoreCase("Yes"));//true

        System.out.println("----------------------------------------------");

        String sentence = "My favorite Programming Language is Java";

        boolean hasCsharp = sentence.contains("C#");//false
        boolean hasJava = sentence.contains("Java");//true
        boolean hasJava2 = sentence.contains("java");//false
        boolean hasJava3 = sentence.toLowerCase().contains("java");//to ignore the case sensivity we can use toLowerCase
        // or toUpperCase//true
        boolean r3 = sentence.contains("java") || sentence.contains("Java");
        System.out.println(hasCsharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(r3);

        System.out.println("------------------------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";
        String input3 = "I love JAvA";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false
        System.out.println(input1.contains(input2));//true

        System.out.println(input3.contains("Java"));
        System.out.println("----------------------------------------");

        System.out.println(input1.toLowerCase().contains("java"));//ignore the case sensivity
        System.out.println(input1.toUpperCase().contains("JAVA"));//ignore the case sensivity

        System.out.println("------------------------------------------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");//true
        boolean x1 = a.startsWith("oo"); //false
        boolean y = a.endsWith("Spoon");//true
        boolean z = a.toLowerCase().endsWith("wooden");//to ignore the case sensivitiy first create lowerCase or upperCase
        //of the String then compare it
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);




































 }
}
