package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade");
        int s = scan.nextInt();

        String result = " ";


        if(s >= 0 && s <= 100) {

            if(s>=90) {
                result = "A";
            }else if(s>=80) {
                result = "B";
            }else if (s >= 70) {
                    result = "C";
            } else if (s >= 60) {
                    result = "D";
            } else {
                    result = "F";
            }

        }else{
            result = "Invalid number" ;
        }System.out.println(result);

        scan.close();

    }
}

















/* Ask the user to enter his/her grade
print the grade of the student (A,B,C,D,F)
If user enter invalid score (negative or more than 100) print invalid score

 */