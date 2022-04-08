
package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");

        int shortest = words[0].length();

        for (String each : words) {
            if (each.length() < shortest) {
                shortest = each.length();
            }
        }

        int count = 0;

        for (String each : words) {
            if (each.length() == shortest) {
                count++;
            }
        }

        String[] result = new String[count];

        int i = 0;
        for (String each : words) {
            if (each.length() == shortest) {
                result[i++] = each;
            }
        }
        scan.close();

        Arrays.sort(result);

        System.out.println(Arrays.toString(result));

    }

    }

/*
Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings. Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
 */