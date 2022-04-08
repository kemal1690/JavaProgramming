
package day35_Encapsulation.taskAndSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {


    Candy candy1 = new Candy("ulker",2,10,true);
    Candy candy2 = new Candy("M&M",2,20,false);
    Candy candy3 = new Candy("nestle",5,30,true);
    Candy candy4 = new Candy("eti",20,40,false);
    Candy candy5 = new Candy("solen",10,40,true);


    ArrayList<Candy> Candy = new ArrayList<>(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy candy : Candy) {

            System.out.println(candy.getBrand() + " : " + candy.getPrice());
        }
/*

   ArrayList<Candy> Candy = new ArrayList<>();
        Candy.addAll(Arrays.asList(
                new Candy("M&M", 60, 1.5, false),
                new Candy("M&M", 50, 0.5, false),
                new Candy("M&M", 40, 2.5, false),
                new Candy("M&M", 30, 3.5, false),
                new Candy("M&M", 20, 2.75, false)
        ));

 */

    }

}
/*
   1.2 Create a class named CandyFactory
                Create an ArrayList of Candy
                Add five objects of Candy
                use for each loop to print the brand and price of each candy
 */