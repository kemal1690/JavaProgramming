package day23_CustomMethods_Void;

public class PrintEvenNumbers1To100 {

    public static void main(String[] args) {

evenNumbers();

    }

    public static void evenNumbers(){


        for (int i = 1; i <100 ; i++) {

            if(i%2==0){

                System.out.println(i+" ");
            }

        }


    }

}
