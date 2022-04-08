
package day25_CustomMethods_Overloading;
import utilities.ArraysUtility;
import java.util.Arrays;

public class RemoveElement3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] result = remove(arr, 5);

        System.out.println(Arrays.toString(result));
    }

    public static int[] remove(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }
}
