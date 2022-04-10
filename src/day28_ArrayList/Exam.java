package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;



public class Exam {

    public static void main(String[] args) {


        ArrayList<Integer> list =  new ArrayList<>( );
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for (Integer each : list) {

            if(each %2 != 0){
                continue;
            }

            System.out.println(each + " ");//2
            break;
        }

        System.out.println("----------------------------------------");

        ArrayList<Integer> list1 =  new ArrayList<>( );

        list1.add(1);
        list1.add(2);
        list1.add(3);

        int a = 1;

        list1.remove(a);

        System.out.println(list1);//[1,3]

        System.out.println("----------------------------------------");

        ArrayList<Integer> list2 =  new ArrayList<>( );

        list2.add(1);
        list2.add(2);
        list2.add(3);

        int b = 1;

        list2.remove(b);

        System.out.println(list2);//[2,3]

        System.out.println("----------------------------------------");

        ArrayList<Integer> list3 =  new ArrayList<>( );

        Integer c = 1;
        System.out.println(list.remove(c));//false

        System.out.println("----------------------------------------");

        ArrayList<Integer> list4 =  new ArrayList<>( );
        list4.addAll(Arrays.asList(1,2,3,4,5));

        list4.set(0,list4.get(4));//[5,2,3,4,5]
        list4.set(4,list4.get(0));//[5,2,3,4,5]



    }
}
