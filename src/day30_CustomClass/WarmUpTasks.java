package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Integer.parseInt;

public class WarmUpTasks {
    public static void main(String[] args) {

        ////solving without using the new arrayList
    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));//Bulk opeartions can be applied to any Collection type

     Collections.swap(numbers, 0,  numbers.size()-1);

        System.out.println(numbers);

        //int[] arr = {1,2,3,4,5,6,7,8}; for Arrays iot swap element we have to use temporary variables
        // System.out.println( Arrays.toString(arr )  );

        System.out.println("-----------------------------------------");


        ArrayList<Integer> list = new ArrayList<>();

       list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);

      //if we get the size of the arraylist and remove all the zeros from the arrayList after that subtract the new size from orijinal size
       // we can find the number of zeros
       int size = list.size();

        list.removeAll(Arrays.asList(0));//removeIf is used for unknown, removeAll is used for known elements

        System.out.println(list);

        int newSize = list.size();

        int totalNumberOfZeros = size - newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i <totalNumberOfZeros ; i++) {

            list.add(0);
        }
        System.out.println(list);//[1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("------------------------------------------");

        //solving by using the new arrayList
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if(each != 0){
                result.add(each);
            }
        }

        for (Integer each : list2) {
            if(each == 0){
                result.add(each);
            }
        }

        System.out.println(result);

        System.out.println("----------------------------------------------------");

        String str = "ABCD123$%#@&456EFG!";
        //elements that are removed unknown thats why we cant use removeAll or retain

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) { //to convert String to ArrayList we have to use loop
            chars.add( str.charAt(i) );
        }

        ArrayList<Character> letters = new ArrayList<>( chars ); // add all the characters

        letters.removeIf(p-> !Character.isLetter(p));//remove the characters that are not letters
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>( chars );//chars is Collection type

        digits.removeIf(p-> !Character.isDigit(p)); //remove the characters that are not digits

        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar= new ArrayList<>( chars );
        // specialChar.removeAll( letters ); letters:Collection type
        //  specialChar.removeAll( digits ); digits: collection type

        specialChar.removeIf(p-> Character.isLetterOrDigit(p));

        System.out.println("specialChar = " + specialChar);

    }
}













/*
1. write a program that can swap the first and last elements of an ArrayList
2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}


	1.  ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));


       int temp = list.get(0);

        list.set(0, list.get(list.size()-1));
        list.set(list.size()-1, temp);

        System.out.println("list = " + list);

--------------------------------------------------------------------
  int[] arr = {1,2,3,4,5,6,7,8,9};
        int i = arr[0];
        int j = arr[arr.length-1];
        System.out.println(j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(Arrays.toString(arr));



 */