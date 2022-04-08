package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        /*
        int num = 1;//primitive
        list.remove(num);//num is taken as index
        System.out.println(list);

         */



        Integer num = 200;//non-primitive
        list.remove(num);
        System.out.println(list);//[100, 200, 200, 300, 400, 500]
/*
        list.remove(200);//indexOutOfBoundsException
        System.out.println(list);

 */     Integer num1 = 200;
        list.remove(num1);//object, beacuse Integer num1 is non-primitive
        System.out.println(list);//[100, 200, 300, 400, 500]

        Integer num2 = 2000;
        boolean r = list.remove(num1);
        System.out.println(r);//false-2000 is not in the list

        System.out.println("-------------------------------------------------");

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("-------------------------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =  characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4

        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------------------------");

        boolean r2 = characters.contains('A');

        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);//true
        System.out.println("r3 = " + r3);//false

        System.out.println("--------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(1000);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);//false.Because new keyword creates a new object in the heap memory
        System.out.println(list1.equals(list2));//compares at each of the element of each of the index
        // if the elements in the same indexes are not same it returns false
        // if both of the array lists have the same elements in the same order returns true

        System.out.println("---------------------------------------------");
        list1.clear();

       boolean r4 = list1.isEmpty();

        System.out.println("r4 = " + r4);//true

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);


    }
}
