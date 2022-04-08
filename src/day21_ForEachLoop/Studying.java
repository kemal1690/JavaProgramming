package day21_ForEachLoop;

import java.util.Arrays;

public class Studying {
    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur" }; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5



        String[] group = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) {
            group[i++] = each;
        }


        for (String each : group2) {
            group[i++] = each;

        }

        System.out.println(Arrays.toString(group));


        System.out.println("--------------------------------------");


        String word = "silent";

        for (char letter : word.toCharArray()) {
            System.out.println("letter = " + letter);

        }











    }
}
