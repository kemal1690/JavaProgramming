package utilities;

import day31_Constructors.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ImportantNotes {
    public static void main(String[] args) {


        System.out.println("--------------Multiply Two Numbers---------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result12 = 0;

        for (int i = 0; i <num2 ; i++) {
            result12 += num1;
                }
        System.out.println("Multiplication =" + result12);
        scan.close();

        System.out.println("------------------While Loop-------------------------------");

        int d = 0;

        while(d<=6){
            d+=2;
        }

        System.out.println(d);//8


        System.out.println("----------------For Loop----------------------------------------");

        for (int i = 0; i <=4;) {
            i++;
            System.out.println(i+""); //1,2,3,4,5
        }




        System.out.println("-------------------Divide two Numbers--------------------------");
        int a = 30; //a =30-7=23-7=16 -7 =9 - 7 = 2
        int b = 7;

        int count = 0; // count = 1+1=2+1 = 3+1 =4

        while (a >= b) {
            a -= b;
            count++; //denominator : bölen
                    // nominator: bölünen
        }


        System.out.println(count+" with a remainder of "+a);

        System.out.println("---------------AllDuplicatedChars--------------------------");

        String str = "aabbccddeeff";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count1 = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch == each){
                    count1++;
                }
            }
            if(count1 == 2){
                if(result.contains(str.charAt(i)+"")){
                    continue;
                }
                result += str.charAt(i);
            }
        }
        System.out.println(result);

        System.out.println("-------------------------------------------------------------");

        int code = 200;

        int[] codes = new int[8]; // my codes array holds 8 elements, they are all int type
        int[] statusCodes = {200,201,204,400,401,403,404,500};
        System.out.println(Arrays.toString(codes));//[0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(statusCodes));//[200, 201, 204, 400, 401, 403, 404, 500]
        int sizeOfArrays = statusCodes.length; //8

        System.out.println("-----------------------------------------");
        int[] nums = {1,2,3,4,5};

        System.out.println(nums); //hashcode
        System.out.println(Arrays.toString(nums)); // "[1,2,3,4,5]"

        System.out.println(  nums[0] );//1 This is not array. This is element contained in array

        System.out.println("----------------------------------------------------------------");

        int [] nums1 = {5 , 10 , 4, 1000, 35};
        int [] numsTwo = {4, 5 , 10, 35, 1000};
        int [] numsThree = nums1; // creating a new refernce for the same the object
        nums1[0]=5000;
        System.out.println(Arrays.toString(numsThree));//[5000, 5, 10, 35, 1000]
        System.out.println("---------------------------------------------------");

        char[] letters = {'j','a','v','a',' ','i','s',' ','f','u','n'};
        String sentence = new String(letters);//sentence = java is fun
        System.out.println("sentence = " + sentence);//sentence = java is fun
        //We can convert char array to String like that

        for (char letter : letters) {//for each method
            System.out.print(letter+" ");//j a v a   i s   f u n
        }
        //to convert string into char Array
        char [] newArray = sentence.toCharArray();//[j, a, v, a,  , i, s,  , f, u, n]

        for (char c : newArray) {
            System.out.print(c+" "); //java is fun
        }
        System.out.println("-------------------------------------------");

        // SPlIT METHOD
        String searchResult = "1-16 of 829 results for ipad";
        String[] each = searchResult.split(" "); //convert String into String Array
        System.out.println(Arrays.toString(each));//[1-16, of, 829, results, for, ipad]

        String searchAmount = each[2]; //second element in the array
        System.out.println("searchAmount = " + searchAmount);//829
        System.out.println("-------------------------------------------");

        System.out.println("How many numbers would you like to enter: ");
        //Scanner
      //  int length = scan.nextInt();
     //   int[] numbers = new int[length]; //array needs to have enough capacity to contain all the element

        System.out.println("------putting zeros to the end-- important-------------");


        int[] array = {10, 0, 5, 0, 1, 0};

        int[] result13 = new int[array.length];


        int j =0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0) {

                result13[j++] = array[i];


            }

        }
        System.out.println(Arrays.toString(result13));


        System.out.println("-----------Reverse------------------------------------------");


        int[] array1 = {1,2,3,4,5};

        int[] reverse = new int[array1.length];



        for (int i = array1.length-1, k=0; i >=0 ; i--,k++) {

            reverse[k] += array1[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("-------------Merge---------------------------------------");
        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[]  arr3 = {8, 9, 17, 5, 4, 1};

        int[] merge = new int[arr1.length + arr2.length + arr3.length];

        int l = 0;

        for (int each3 : arr1) {

            merge[l++] = each3;
        }
        for (int each3 : arr2) {

            merge[l++] = each3;
        }
        for (int each3 : arr3) {

            merge[l++] = each3;
        }
        System.out.println(Arrays.toString(merge));


        System.out.println("------------Reversing Word in Sentence-----------------");


        String  sentence1 = "I Love Java";

        String[] word = sentence1.split(" ");
        String reverse1 = "";

        for (int i = word[1].length()-1; i >=0 ; i--) {
            reverse1 += word[1].charAt(i);
        }
        word[1] = reverse1;
        /*
        for (String s : word) {

            System.out.print(s+" ");
        }

         */
        String result1 = "";
        for (int i = 0; i <word.length ; i++) {
            result1 += word[i];

        }
        System.out.println(result1);

        System.out.println("-------------Get number into Array through Scanner----------------------------------------");


        Scanner scan1 = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter: ");
        int length = scan1.nextInt();

        if(length<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[length]; //array needs to have enough capacity to contain all the elements user going to enter

        for (int i = 0; i <length ; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scan1.nextInt();// each input user provided during each execution of the loop, will be assigned to the indexes of the array
        }
        System.out.println(Arrays.toString(numbers));
        scan1.close();


        System.out.println("-------------------------ArrayList------------------------------------");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);//false.Because new keyword creates a new object in the heap memory
        System.out.println(list1.equals(list2));//compares at each of the element of each of the index
        // if the elements in the same indexes are not same it returns false
        // if both of the array lists have the same elements in the same order returns true


        System.out.println("-------------Garbage Collection----------------------");

        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";//We have one object from the student class, thats why we can not store both
        //"Ahmet" and "Tahir". student1 and student2 they're referencing the same object

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;//referencing the same object
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);


        System.out.println("-------------get the testers and developers from the scrum team");
/*
        for(Tester tester : scrumTeam.testers){

            System.out.println(tester.name + " : " + tester.salary);
        }

        System.out.println("-------------------------------------");


        for(Developer developer : scrumTeam.developers){

            System.out.println(developer.name + " : " + developer.salary);
        }

 */
        System.out.println("---------------converting arraylist to an array---------------------");


        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada", };

        // converting array to arraylist:
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));//adding non-primitive array

        list.removeIf(p-> p.length() >=10);//p represents each element

        //converting arraylist to array
        countries = list.toArray(new String[0]);//0 is replaced size of array list. We can put any number instead of 0

        System.out.println(Arrays.toString(countries));








    }
}
