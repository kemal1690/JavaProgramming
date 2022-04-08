package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

    String name = "Josh";
    int age = 34;
    String citizen = "USA";

    boolean isEligible = age >=21 && citizen == "USA";//true

    //Eligible
        if(isEligible){//true
            System.out.println("Eligible");
        }

        // Not Eligible
        if(!isEligible){//not true ==> false output is not executed on the console
            System.out.println("Not Eligible");


        }







    }




}
