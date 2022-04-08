package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {// i: index numbers of list

            list.set(i,list.get(i)*2);

        }
        System.out.println(list);












    }
}
/*
{10,20,30,40,50}
{20,40,60,80,100}
 */