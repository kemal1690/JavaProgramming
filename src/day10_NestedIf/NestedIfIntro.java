package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

    int score = 400;

    if( score >= 0 && score <= 100) { //If the score is valid

        if (score >= 60) { //If student passed the exam
            System.out.println("Passed");
        } else {//If the student failed the exam
            System.out.println("Failed");
        }
    }else{//If the score is invalid
        System.out.println("Invalid score");

    }

        System.out.println("-----------------------------");

        int age = 20;
        boolean hasID = true;

        if(hasID){// If the person has an ID

        if(age>=21){//If the person is 21 years old or older than
            System.out.println("Eligible to buy alcohol");
        }else{//if the person is less than 21
            System.out.println("Not eligible to buy alcohol");
        }

        }else{//If the person does not have an ID
            System.out.println("You must have an ID to buy alcohol");
        }
        System.out.println("-------------------------------------");
        //Name of the day from Monday to Sunday
        int number = 7;
        if(number >=1 && number <= 7){//If number is a valid number
            //In java you cant write 1>= number <=2 we have to use logical operators like ||, &&

            if(number==1){
                System.out.println("Monday");
            }
            else if(number ==2){
                System.out.println("Tuesday");
            }
            else if(number == 3){
                System.out.println("Wednesday");
            }
            else if(number == 4){
                System.out.println("Thursday");
            }
            else if(number == 5){
                System.out.println("Friday");
            }
            else if(number == 6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else{
            System.out.println("Invalid Number");
        }







    }
}
