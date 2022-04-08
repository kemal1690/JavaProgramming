package day32_Constructors;

public class ConstructorCalls {


    public ConstructorCalls(){//default constructor

        System.out.println("Default Constructor");

    }

    public ConstructorCalls(int a){//first execute the default constructor
        this();//We dont pass any argument because, first constructor is default constructor
        System.out.println("Constructor with int argument");

    }

    public ConstructorCalls(String str){
        this(10);//Default Constructor ,  Constructor with int argument
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {


       ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println("---------------------------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println(obj2);

        System.out.println("---------------------------------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");

        System.out.println(obj3);

    }





}
