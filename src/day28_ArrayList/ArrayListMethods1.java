package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();//Empty ArrayList

        //1.Adds element after the last index
        numbers.add(10);// index-0 -autoboxing - ArrayList size is increased by one
        numbers.add(20);// index-1
        numbers.add(30);//2
        numbers.add(40);//3
        numbers.add(50);//4
        numbers.add(60);//5

        //Inserts the data at the given index
        numbers.add(2,25);
        numbers.add(5,45);

        System.out.println(numbers);

        System.out.println(numbers.size());
        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("-------------------------------------------");


        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i));
            
        }

        System.out.println("-------------------------------------------------");

        ArrayList<String> list  = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);

       list.set(2,"JavaScript");//replace
       list.set(3,"C++");

        System.out.println(list);


        System.out.println("----------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);//for primitives it removes according to the index

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove(employees.size()-1);

        System.out.println(employees);

       boolean r1 = employees.remove("Hulya");//İf there are multiple same object first one will be removed

        System.out.println(employees);

        boolean r2 = employees.remove("Neira");//for non-primitives it removes the object

        System.out.println(employees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);











    }
}
