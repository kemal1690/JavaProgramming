package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Study {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("Java");//0
        list.add("Java");//1
        list.add("Java");//2
        list.add("Python");//3 first and last indexes of that are same
        list.add("C#");//4
        list.add("C#");//5
        list.add("C#");//6
        list.add("Ruby"); //7 first and last indexes of that are same
        list.add("C++"); //8
        list.add("C++"); //9

        ArrayList<String> result = new ArrayList<>();

        for (String each : list) {

            if(list.indexOf(each)== list.lastIndexOf(each)){
                result.add(each);

        }

        }

        System.out.println(result);




    }
}