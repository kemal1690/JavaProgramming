package day37_Inheritance;


/*
class A{

    public A(){
        System.out.println("A");
    }

}

class B extends A{

    //compiler gives super() keyword implicitly because A class' constructor is default
    public B(){
        System.out.println("B");
        if print this in main method below we could see 'AB' on the console
    }

}

 */

class A{

public A(int a){//constructor
        System.out.println("A");
        }

}

class B extends A{

    public B() {//constructor
        super(9);
        System.out.println("B");
    }

    }





public class ConstructorPractice {

    public static void main(String[] args) {


        B obj = new B();

        System.out.println(obj);










    }


}
