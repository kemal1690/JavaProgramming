
package day29_ArrayList;

import java.util.Arrays;

public class ShortNamedCountries {
    public static void main(String[] args) {


        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada",};

        int count = 0;

        for (String each : countries) {
            if (each.length() < 10) {
                count++;
            }
        }
       String[] shortNamedCountries = new String[count];

        int i = 0;
        for (String each: countries) {
            if (each.length() < 10){
                shortNamedCountries[i++] = each;
            }
        }

        System.out.println(Arrays.toString(shortNamedCountries));
    }

        }

/*
1. create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */