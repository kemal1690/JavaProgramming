package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseTwoDimensionalArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        int[] arr3 = {8,9,10,11,12,13};

        int[] reverse1 = new int[arr1.length];
        int[] reverse2 = new int[arr2.length];
        int[] reverse3 = new int[arr3.length];
        int[][] allReverse = new int[3][];

        allReverse[0] = reverse1;
        allReverse[1] = reverse2;
        allReverse[2] = reverse3;

        for (int i = arr1.length-1, j=0; i >=0 ; i--,j++) {

            reverse1[j] =  arr1[i];

        }

        for (int k = arr2.length-1, l = 0; k >=0 ; k--, l++) {

            reverse2[l] =  arr2[k];
        }

        for (int m = arr3.length-1, n = 0; m  >=0 ; m--, n++) {

           reverse3[n] =  arr3[m];
        }

        System.out.println(Arrays.deepToString(allReverse));

    }
}
