package day21_ForEachLoop;

public class MinimumNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 2};
        int min = numbers[0]; //We are assuming that max number is thr first element 10


        for (int number : numbers) {

            if(number<min){

               min = number;
            }

        }
        System.out.println(min);






    }
}
