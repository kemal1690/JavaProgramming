package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        int[] reverse = new int[array.length];


        for (int i = reverse.length-1, j=0; i >=0 ; i--,j++) {//j stands for index number of reverse array
            reverse[j] = array[i];


        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("---------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));


        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            int each = list.get(i);
           reversedList.add(each);
        }

        System.out.println(reversedList);




    }
}
