package day21_ForEachLoop;
import java.util.Arrays;
public class OddAndEvenCount {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int countOdd = 0,
                countEven = 0;

        for (int each : arr) {
            if(each%2 ==0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        System.out.println(Arrays.toString(arr) +" has "+countEven+" even numbers and "+countOdd+" odd numbers");




















    }
}
