
package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {



        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

        String[] arr = str.split("");//We can convert to char Array but char is primitive thats why we cannot convert char Array to ArrayList

        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );//to convert array into arrayList we use asList method from the Arrays utility

        System.out.println("list = " + list);

        String unique = "";

        for (String each : list) {

            int frequency =  Collections.frequency(list, each);
            if(frequency == 1){
                unique += each;
            }

        }


        System.out.println("unique = " + unique);

/*
        String name = "Ali, Ahmet, Ceren";
        ArrayList<String> each = new ArrayList<>(Arrays.asList(name));
        System.out.println(each);
        System.out.println(each.size());

 */




    }

        }





        /*
        ArrayList<String> each = new ArrayList<>(Arrays.asList(arr));

        each.removeIf(p-> Collections.frequency(each,p)>1);

        System.out.println(each);

         */























