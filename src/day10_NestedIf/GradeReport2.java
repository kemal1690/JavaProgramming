package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        //solution1

        int s = 85;
        String result1 = "";
        //If the s is valid==pre conditional statement
        //5 possibilities A,B,C,D,F

              result1 = (s >=0 && s <=100)? (s >=90)? "Excellent" :(s >=80)? "Great"
                :(s >=70)? "Good" :(s >=60)? "Passed" : "Failed" : "Invalid score";
        System.out.println(result1);

        System.out.println("------------------------------------------");

        // solution2
        String result = "";//temporary

        if(s >=0 && s <=100){//If the s is valid==pre conditional statement
            //5 possibilities A,B,C,D,F

            if(s >= 90){// We dont write ( s <=100) because this is applied in pre-condition
                result = "Excellent";
            }else if(s >= 80){ // false = s<80
                result = "Great";
            }else if(s >= 70){// false = s<70
                result = "Good";
            }else if(s >= 60){// false = s <60
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{
            result = "Invalid score";// If the s is invalid
        }
        System.out.println(result);

        System.out.println("-----------------------------");

        //solution3

        String result2 = "";
        if(s >=0 && s <=100){
            result2 = (s >=0 && s <=100)? (s >=90)? "Excellent" :(s >=80)? "Great"
                    :(s >=70)? "Good" :(s >=60)? "Passed" : "Failed" : "Invalid score";

        }else{
            result2 = "Invalid score";// If the s is invalid
        }
        System.out.println(result2);








    }


















    }

