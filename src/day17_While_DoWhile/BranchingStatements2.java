package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <='E' ; i++) {


            if(i=='C'){
            continue;
                                    //break; it prints just A,B
            }
            System.out.println(i);//A,B,D,E

        }
        System.out.println("----------------------------------");

        //even numbers between 0-10
        for (int i = 1; i <=10 ; i++) {

            if(i%2!=0){
                continue;//Skip the odd numbers
            }
            System.out.println(i);
        }

        System.out.println("-------------------------------------");

        //odd numbers between 0-10
        for (int i = 1; i <=10 ; i++) {

            if(i%2==0){
                continue;//Skip the even numbers
            }
            System.out.println(i);
        }










    }
}
