package day21_ForEachLoop;

import java.util.Arrays;

public class MergeMeeting {
    public static void main(String[] args) {

        int[] arr1 = {5, 9, 7, 15, 69, 34};
        int[] arr2 = {38, 10, 3, 45, 11, 65};

        int[] merge = new int[arr1.length + arr2.length];

        int i = 0;//index number of int[] merge starts from zero

        for (int each : arr1) {

            merge[i++] = each;
        }

        for (int each : arr2) {

            merge[i++] = each;
        }

        System.out.println(Arrays.toString(merge));


        for (int j = 0; j < merge.length - 1; j++) {

            for (int k = i + 1; k < merge.length; k++) {

                if (merge[i] > merge[j]) {

                    int temp = merge[j];
                    merge[j] = merge[i];
                    merge[i] = temp;
                    System.out.println(merge[i]);

                }
            }

        }


    }


}





