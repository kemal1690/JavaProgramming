package day50_Collections;


import java.util.*;


public class IterablePractice3 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));


        Integer[] array = set.toArray(new Integer[0]);

    }






}
