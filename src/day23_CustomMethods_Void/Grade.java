package day23_CustomMethods_Void;

public class Grade {
    public static void main(String[] args) {



grade(110);

    }


    public static void grade(int score){

        String grade = "Invalid"; //or String grade = ""

       if(score>=0 && score<=100){

            grade = (score >= 90)?"A" :(score >= 80)?"B" :(score >= 70)?"C" :(score >= 60)?"D" : "E";

        } //else{ ("Invalid")
        //return;

        System.out.println("grade = " + grade);



        }



    }










/*
5. create a method that can calculate the grade of the student based on the score
 */