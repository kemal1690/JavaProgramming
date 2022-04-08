package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        int min = list.get(0);

        for (Integer each : list) {

            if(each<min){

                min = each;
            }

        }

        System.out.println("min = " + min);





    }
}
