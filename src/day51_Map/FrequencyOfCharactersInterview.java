package day51_Map;

import java.util.*;

public class FrequencyOfCharactersInterview {

    public static void main(String[] args) {


        String str = "bbcccaaaaa";//We can't convert this into the Collection directly

        //           bca
        //           235
        //Collections.frequency()

        String[] arr = str.split("");

        Map<String,Integer> result = new LinkedHashMap<>();


        for (String each : arr) {

            int frequency = Collections.frequency(Arrays.asList(arr),each);
            //Collections.frequency accepts one collection type(Arrays.asList(arr)) and object(each)
            result.put(each,frequency); //each is key frequency is value

        }

        System.out.println(result);









    }
}
/*
        2. Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
        {b=2, c=3, a=5}

 */
