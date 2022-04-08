package day24_CustomMethod_Return;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int element = 4;

      int[] result =  result(arr,element);
        System.out.println(Arrays.toString(result));

    }

public static int [] result(int[] arr, int element){

        int[] result = new int[arr.length + 1];

        int i = 0;
    for (int each : arr) {

       result[i++] = each;

        result[i] = element;


        }
            return result;
    }




}









/*
 6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array
    			Ex:
    				arr ={1,2,3};
    				num = 4;
    				addElement(arr, num) ==> {1,2,3,4}
 */