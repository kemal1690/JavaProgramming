package day20_Arrays;
import java.util.Arrays;
public class DescendingArray {
    public static void main(String[] args) {

        int arr[] = {3,5,7,8,12,5,9,15};

        // Without Sort Method --->> Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
















    }
}
