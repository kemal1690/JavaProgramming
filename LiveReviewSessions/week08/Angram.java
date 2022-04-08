package week08;
import java.util.Arrays;
public class Angram {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};

     int sum = 0;


        for (int i = 0; i < numbers.length ; i++) {

         int num = numbers[i];
        sum += num;


        }
        double average = sum/numbers.length;
        System.out.println(average);









    }
}
