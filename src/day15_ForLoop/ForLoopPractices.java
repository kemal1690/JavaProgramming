package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        for(int i = 15; i <=45; i++){
            System.out.print(i+" ");//everthing inside the loop is repeated
        }
        System.out.println();//appends a new line for next statement
        //if not Hello is written after 45
        System.out.println("Hello");

        System.out.println("---------------------------------------");
        //100 99 98..........50
        for(int i = 100; i>=50; i--){ // (<, >, <=, >=) are used a lot in for loop
                      //or i >49

            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("-----------------------------------------------");

        // print all the even numbers between 1-55

        for(int i = 1; i<=55; i ++){

            if(i % 2 == 0){
                System.out.print(i+ " ");

            }

        }
        System.out.println();
        System.out.println("-------------------------------------");
        //print all the even numbers between 1-55 => 2, 4, 6, 8.........54

        for(int i = 2; i <= 54; i +=2){//2, 4, 6,............54

            System.out.print(i+ " ");
        }













    }
}
