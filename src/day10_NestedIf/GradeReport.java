package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        /*

score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */
            int score = 83;

            if(score >=0 && score <=100){//If the score is valid==pre conditional statement
                //5 possibilities A,B,C,D,F

                if(score >= 90){// We dont write ( score <=100) because this is applied in pre-condition
                    System.out.println("Excellent");
                }else if(score >= 80){ // false = score<80
                    System.out.println("Great");
                }else if(score >= 70){// false = score<70
                    System.out.println("Good");
                }else if(score >= 60){// false = score <60
                    System.out.println("Passed");
                }else{
                    System.out.println("Failed");
                }

            }else{
                System.out.println("Invalid Score");// If the score is invalid
            }
        System.out.println("-----------------------------------------------------");

        String result = "";//temporary

        if(score >=0 && score <=100){//If the score is valid==pre conditional statement
            //5 possibilities A,B,C,D,F

            if(score >= 90){// We dont write ( score <=100) because this is applied in pre-condition
                result = "Excellent";
            }else if(score >= 80){ // false = score<80
                result = "Great";
            }else if(score >= 70){// false = score<70
                result = "Good";
            }else if(score >= 60){// false = score <60
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{
            result = "Invalid Score";// If the score is invalid
        }
        System.out.println(result);






















    }
}
