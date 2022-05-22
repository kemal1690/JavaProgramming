package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("list = " + list);//25 elements, because List and ArrayList accept duplication
        System.out.println( list.get(4) );


        //If we wanna remove the duplicates Set is the best choice
        //List has index numbers but Set doesnt have index


        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(null, null, null));
        //HashSet implements the Set Interface
        //HashSet class accept null values
        //remove the duplicates
        //import.java.util.HashSet

        System.out.println("hashSet = " + hashSet);//5 random elements, Set and child of Set(heshSet,,) dont accept duplication
        //System.out.println( hashSet.get(4) );We can not use get method because order is random





        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet);
        //LinkedHashSet class maintains the insertion order(keeps the order of the elements)
        //Accepts null values
        //Child class of HashSet Class
        //removes the duplicates
        //import java.util.LinkedHashSet

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        //  treeSet.addAll(Arrays.asList(null,null,null));


        System.out.println("treeSet = " + treeSet);

        //   String str = null;
        // System.out.println(str.charAt(0));


        //TreeSet class implements the sortedSet interface
        //Maintains the sorted(ascending) order
        //Does not accept null values
        //removes the duplicates
        //performance is slow compare to other Set components
        //import java.util.TreeSet










    }
}
