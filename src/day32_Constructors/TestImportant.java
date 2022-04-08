package day32_Constructors;

public class TestImportant {

//Constructor chaining
    public TestImportant(){

        System.out.println("A");
    }

    public TestImportant(int a){//A  B
        this();
        System.out.println("B");
    }

    public TestImportant(double a){//A B C
        this(10);
        System.out.println("C");
    }

    public TestImportant(String str){//A B C D

        this(2.5);
        System.out.println("D");
    }


    public static void main(String[] args) {


        new TestImportant("Java");//ABCD



    }










}
