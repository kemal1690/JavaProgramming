package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Replitword {

    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
                String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


                String[] result = new String[words.length];

                int i = 0;
                for(String each: words ){

                    String word = each.charAt(0) + "" + each.charAt(each.length()-1);

                    result[i++] = word;


                }

                    input.close();
                System.out.println(Arrays.toString(result));

            }
        }


