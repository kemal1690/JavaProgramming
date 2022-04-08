package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

        int[] arr3 = merge(arr1, arr2); //merge method returns new int array

        System.out.println(Arrays.toString(arr3));

    }


    public static int[] merge(int[] arr1, int[] arr2) {//return type is int array

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {

            result[i++] = each;// We assign each element to the indexes of the new array
        }
        for (int each : arr2) {

            result[i++] = each;
        }



        return result;

    }

}

/*
Or we can write the code by using addElement methot that we created before

int[] result = {};
 for (int each : arr1) {

      result = addElement(result,each);
      }

 for (int each : arr2) {

       result = addElement(result,each)
       }

 */