package day15_ForLoop;

public class FormatFullname {
    public static void main(String[] args) {

        String firstName = "cyDEo",
        lastName = "SCHOOL";

   //  firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
  // Substring (0, 1)                   //C                           +  ydeo
    // 1 is not included


        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
//to convert CharAt() method to String we ad "" in paranthesis                     1= second character



        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println("Full Name = " + fullName);


    }
}
