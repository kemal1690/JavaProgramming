package day32_Constructors;

public class Test2 {


    public Test2(){

        System.out.println("A ");

    }

    public Test2(int a){

        this();
        System.out.println("B ");

    }
    public Test2(String str){

        this(100);
        System.out.println(str);

    }

    public static void main(String[] args) {

        Test2 obj = new Test2("C");
    }
















}
