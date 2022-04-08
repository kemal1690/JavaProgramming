package day14_String;

public class email1 {

    public static void main(String[] args) {
       // String email = "Cydeo.School@gmail.com";
        //email = "School.Cydeo@yahoo.com";

        String email = "Cydeo.School@gmail.com";
        email = email.substring(email.indexOf('@')+1, email.lastIndexOf(".") );
        System.out.println(email);

        System.out.println("----------------------");


        String str1 = "Java is fun, Java is cool, I love Java";

        str1 = str1.substring(str1.indexOf(" J")+1, str1.lastIndexOf(","));
        System.out.println(str1);

        String s3 = str1.substring( str1.lastIndexOf("I"));
        System.out.println(s3);







    }
}
