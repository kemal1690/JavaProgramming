package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        /*
        Bulk operations are for just Collection types, arguments must be collection type
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,3,3,5,5,5,5,8,8,8,8));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));//3,5,8 are collection of value
        System.out.println(list);

        System.out.println("-------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll( Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900) );

        numbers.retainAll(Arrays.asList(100, 200, 300));

        System.out.println(numbers);

        System.out.println("-------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles);

        System.out.println("-------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(  Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10) );

        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);
        boolean r3 = nums.containsAll(Arrays.asList(2,5,10,1000));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-----------------------------------------------");

        //We can just add non primitives by using asList method
        //There are 2 methods

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));//1.method=We are adding collection values
/*
        ArrayList<String> nameList = new ArrayList<>(); //2.method
        nameList.addAll(Arrays.asList(names));

 */
        System.out.println(nameList);

        System.out.println("-----------------------------------------------");

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};//Non-primitive==>We can directly add into the arraylist

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println("list2 = " + list2);

        System.out.println("-----------------------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list3 = " + list3);

    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){ //We can convert primitives into ArrayList  by using custom method and forloop

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {

            list.add(each);

        }
        return list;
    }












}
