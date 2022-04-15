package day32_Constructors;

public class Test {


    public Test(){

        System.out.println("A ");

    }

    public Test(int a){

        this();
        System.out.println("B ");

    }
    public Test(String str){

        this();

     // this(100); error here
        System.out.println(str);

    }

    public static void main(String[] args) {

        Test obj = new Test();
    }


}
