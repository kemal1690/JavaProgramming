package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

    String firstName = "Jimmy";
    String lastName = "King";
    int age = 45;
    String jobTitle = "SDET";
    String companyName = "Apple Inc";
    double salary = 100000.58;
    String fullName = firstName + " " + lastName;

    // Full Name of the person is ......

        // .....is ..... years old

        // fullName is Jobtitle +at+ companyName
        // fullName is Jobtitle +at+ companyName and fullNames' salary is .....

        System.out.println(fullName);
        System.out.println("Full Name of the person is " + fullName);
        System.out.println(fullName + " is " + age  + " years old");
        System.out.println(fullName + " is " + jobTitle +", works at " + companyName);
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + " and " + fullName + "' salary is $" + salary);









    }




}
/* Create class called FullName.java
declare the following variables
        1.firstName
        2.lastName
        3.Use Concatenation to print the full adress
 */