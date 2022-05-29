package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {

    public static void main(String[] args) {


        Predicate<String> isPalindrome = (p)->{


            String reverse = new StringBuilder(p).reverse().toString();//StringBuilder has reverse method

            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java");

        System.out.println(result1);

        Predicate<Integer> isEven = p -> p % 2 == 0;//Just one condition thats why we may not use parenthesis
        //and curly braces

       // boolean result2 = isEven.test(10);
       // System.out.println(result2);

        System.out.println("--------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));

        list.removeIf(isEven);
        //or list removeIf(p-> {return p%2==0};);
        // if just one statement list.removeIf(p->p %2==0);

        System.out.println(list);

        System.out.println("------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));
        names.removeIf(isPalindrome);

        System.out.println(names);

        System.out.println("----------------------------------------");

        Consumer<String> printEach = (s)-> {

            for (int i = 0; i <s.length() ; i++) {

                System.out.println(s.charAt(i));

            }
        };
        printEach.accept("Java");

        System.out.println("----------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));
/*
        for(Integer each : list2){
            if(each %2 !=0){
                System.out.println(each);
            }
        }

 */

            list2.forEach(p-> {

            if(p%2 != 0) System.out.println(p);

            });

        //    list2.forEach(p-> System.out.println(p)); prints every single elements
        System.out.println("-------------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(s-> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ")+1)));

        System.out.println("-------------------------------------------");

        //We are converting primitive array to List
        Function< int[],List<Integer>> convertToList = (a)->{

        List<Integer> result = new ArrayList<>();

            for (int each : a) {
                result.add(each);
            }
            return result;
        };
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> l = convertToList.apply(arr);

        System.out.println(l);


        System.out.println("-------------------------------------------");
        //Converting the list to the Array

        Function<List<Integer>,int[]> convertToArray = (a)->{//a is List now we will convert it into the array

            //We need an array that contains all the element of the given list(a)
            //First we need to set the size of the array

            int[] result= new int[a.size()];
            //We need to assign the list element to the index of the array

            for (int i = 0; i < a.size(); i++) {

                result[i] = a.get(i);
            }
                return result;
            };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int[] result2 = convertToArray.apply(numbers);

        System.out.println(Arrays.toString(result2));//[1, 2, 3, 4, 5]


        System.out.println("-------------------------------------------");

        // create a function that can return the maximum number from an int array

        // create a function that can swap the first and last elements of an array

        // Create a function that can reverse an array and returns it

        // create a function that can reverse a List


/*
ASK this
        List<Integer> number1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(Arrays.toString(number1.toArray()));

 */



    }
}
