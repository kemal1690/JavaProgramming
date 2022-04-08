package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch = 'D';
        String result = "";
        //We dont use boolean in switch

        switch (ch) {
            case 'A': case 'B' : case 'C' : case 'D': // Case A or B or C or D
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";
                break;


        }

        System.out.println(result);
    }
}
/*
    if the grade is A or B or C or D =====>"Passed"
    otherwise ==> "Failed"
 */