package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

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


        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {

            if(list.indexOf(each)==list.lastIndexOf(each)){//only appear one time in the arrayList.Thats why its unique

                unique.add(each);//We add the unique elements to the unique arrayList
            }

        }



        System.out.println(unique);







        }




    }

/*
   for (int i = 0; i < list.size(); i++) {
             String list1 = list.get(i);
            if(list.indexOf(list1)==list.lastIndexOf(list1)){
                unique.add(list1);
            }
        }
 */