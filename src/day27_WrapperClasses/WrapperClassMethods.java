package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        // parse method converts String to the primitives
        //valueOf method converts String to Wrapper class

    String str = "123";

   int num = Integer.parseInt(str);//We are assigning primitive to another primitive type thats why we cannot say autoboxing or non boxing

        System.out.println(num+1);//124
        System.out.println(str+1);//1231

        String str2 = "10.5";
       double num2 = Double.parseDouble(str2);
        System.out.println(num2+1);//11.5

        int max = Integer.MAX_VALUE;//MAX_VALUE is variable is not method
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);



        String s1 = "true"; //maybe = false by default,
       boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("--------------------------------------");

    String s2 = "123";
    Integer x = Integer.valueOf(s2);// Integer wrapper class by using valueOf method
    int y = Integer.valueOf(s2);//unboxing

        System.out.println(x);
        System.out.println(y);

     String s3 = "1.5";

     Double z = Double.valueOf(s3);

     // double z = Double.valueOf(s3); also possible but compiler works in background

        System.out.println(z);

        System.out.println("--------------------------------------");

        //isDigit() returns true or false

        char c1 = '!';

        boolean r2 = Character.isDigit(c1); // No need to check ascii table by using these methods
        //isLetter()
        boolean r3 = Character.isLetter(c1);

        //special char
        boolean r4 = !Character.isLetterOrDigit(c1);

        //upperCase
       boolean r5 = Character.isUpperCase(c1);

       //lowerCase
        boolean r6 = Character.isLowerCase(c1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("-------------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if(Character.isDigit(each)){

                sum += Integer.parseInt(""+each);
            }

        }

        System.out.println("sum = " + sum);











    }
}
