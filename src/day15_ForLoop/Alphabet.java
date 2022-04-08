package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        /*We can use relational operators like < > <= .. for char data type
        We can not use String for relational operators in the initialization and condition

         */

         for(int i = 65 ;  i <= 90; i++){ // i: 65, 66, 67... 90  ascii table numbers also returns char
            System.out.print((char)i+" ");//casting int to char
        }

        System.out.println();
        System.out.println("-------------------------------------------------");


        for(char i = 'A'; i<= 'Z'; i++){ //A-Z
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("------------------------");
        for(char i = 'Z'; i>= 'A'; i--) {//Z-A
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        for(char i = 'a'; i<= 'z'; i++){//a-z
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------------");
        for(char i = 'z'; i>= 'a'; i--) {//z-a
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------");

        for(char i = 1; i<=4000; i++){
            System.out.print(i + " ");
        }
        //char ch = 'ক'











    }
}
