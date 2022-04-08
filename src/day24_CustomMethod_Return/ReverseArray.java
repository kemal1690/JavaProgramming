package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

     int[]   arr = {10, 20, 30, 40};

        reverse(arr);
        System.out.println(Arrays.toString(reverse(arr)));

    }


    public static int[] reverse(int[] arr){

        int[] reverse = new int[arr.length];

        int j = 0;
        for (int i = arr.length-1; i >=0 ; i--) {

           reverse[j++] = arr[i];

        }


        return reverse;

    }










}
/*
8. Create method named reverse that passes an integer array parameter, the method can return the reversed array
				Ex:
					arr = {10, 20, 30, 40};
					reverse(arr) ==> {40, 30, 20, 10}
 */