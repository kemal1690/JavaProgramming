package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

            boolean a = false;

        for (int i = 0; a;) {
            System.out.println("Wooden Spoon---for loop");//a is false so it is not being printed
        }

        System.out.println("-----------------------------------");

            while (a){
                System.out.println("Wooden Spoon--while loop");//a is false so it is not being printed
            }

        System.out.println("---------------------------------");

            do{
                System.out.println("Wooden Spoon--do-while loop");

            }while(a);




    }
}
