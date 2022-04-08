package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that capable enough to contain 5 names
       // We use below method if you know how many elements you have but dont know the elements

       String [] myGroup = new  String[5];//0-4
       myGroup[0] = "Gunay";
       myGroup[1] = "Neira";
       myGroup[2] = "Suat";
       myGroup[3] = "Hulya";
       myGroup[4] = "Mikael";

       // System.out.println(myGroup); //hashcode- wrong

        System.out.println(Arrays.toString(myGroup));//["Gunay", "Neira", "Suat", "Hulya", "Mikael"


        System.out.println("-------------------------------------");
    //if you know how many elements will be stored int he variable and know what those elements are
        String [] days = {"Monday","Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};
        //index             0           1       2               3       4           5       6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number<1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);



    }
}
