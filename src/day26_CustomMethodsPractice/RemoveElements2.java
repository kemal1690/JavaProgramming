package day26_CustomMethodsPractice;
import utilities.ArraysUtility;

import java.util.Arrays;
public class RemoveElements2 {

    public static void main(String[] args) {


    int[] numbers = {100, 200, 300, 400, 500, 600};

    numbers = removeElement(numbers, 1); //{100, 300, 400, 500, 600}

    //  numbers = removeElement(numbers, 1); //[100, 400, 500, 600]

        System.out.println(Arrays.toString(numbers));



}


    //                              {1,2,3,4,3}         4 (will be removed)
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index Number: "+index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {// i: array's index number
            if(i != index){ //We are getting all the element in the array for ex  {1,2,3,4,3}, except index (for ex. 4)
                result = ArraysUtility.addElement(result, array[i]);
            }
        }

        return result;
    }
}
