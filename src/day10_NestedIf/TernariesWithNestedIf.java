package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int score = 85;
        /*
        if( score >= 0 && score <= 100) { //If the score is valid

            if (score >= 60) { //If student passed the exam
                System.out.println("Passed");
            } else {//If the student failed the exam
                System.out.println("Failed");
            }
        }else{//If the score is invalid
            System.out.println("Invalid score");
        }
        */

        String result = ( score >= 0 && score <= 100)? (score >= 60)? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result);




    }
}
