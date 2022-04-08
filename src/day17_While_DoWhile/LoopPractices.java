package day17_While_DoWhile;

public class LoopPractices  {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }

        System.out.println("---------------------");
//in while loop you cannot give the initilization and iteration within the expression
        int j = 1;
        while(j<=10){
            //j++// 2-11
            System.out.println(j);
            j++;//1-10
        }
        System.out.println("-----------------------");

            int k = 1;

            do{
                System.out.println(k);
                    k++;
            }while(k<=10);










    }
}
