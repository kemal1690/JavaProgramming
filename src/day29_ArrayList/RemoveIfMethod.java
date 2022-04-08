package day29_ArrayList;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
/*
//it cannot remove all the odd numbers from the list.Collection is dynamic sized. Every time some object gets removed
Index number keeps changing. So, remove method cannot track the right index when you remove the elements.
in order to remove elements properly from a collection type we need to apply root interface of the collection called Iterable
Iterable was designed for dealing with the iteration that is keep changing during the each iteration of the loop.
removeIf method implicitly uses Iterable and for loop


        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 != 0 ){
                list.remove(i);
            }
        }

 */

        System.out.println(list);

        list.removeIf(p-> p<5);//Lambda expression ==> p represents all the elements

        System.out.println("list = " + list);

        System.out.println("------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


        list2.removeIf(each-> each%2==0 );//boolean condition is given in the right side

        System.out.println(list2);
        System.out.println("------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf(p -> p.startsWith("J"));

        System.out.println("list3 = " + list3);

        System.out.println("------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));


        names.removeIf(name-> !StringUtility.isPalindrome(name));

        System.out.println("names = " + names);


    }
}
