package day09_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "John";
        int age = 18;
        String citizen = "UK";

        if(age >= 18 && citizen == "USA"){
            System.out.println(name + " is eligible to vote");
        }else{
            System.out.println(name + " is not eligible to vote");
        }




    }

}
