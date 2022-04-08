package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num = 200;

        //Long n1 = num;  data type must be int
        Integer n1 = num;//autoboxing- assigning an object to make it non primitive

        System.out.println(n1+1);//201

        int num2 = n1;//unboxing-assigning wrapper class to the primitive variable


        System.out.println("--------------------------------------------------------");

        Integer integerValue = 200;

        long longValue = integerValue;//We can assign any types of primitive

        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("-----------------------------------------------------");

        int num3 = 200; // We can only convert int to Integer Wrapper class
        //Long l2 = num3; not possible
        Integer num4 = num3;//autoboxing

        System.out.println("-------------------------------------------------");

        Integer z = 900;

        Integer y = z;

        System.out.println("-------------------------------------------------");

        int[] numbers1 = {1,2,3,4,5};

        Integer[] numbers2 = {1,2,3,4,5};


    }


}
