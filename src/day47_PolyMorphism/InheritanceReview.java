package day47_PolyMorphism;

public class InheritanceReview {


    int a;

    public InheritanceReview(int a){
        System.out.println("Parent class' constructor");//this can't be inherited but can be called by sub classes
    }

    void method1(){

    }

}


class A extends  InheritanceReview{

    public A(int a) {
        super(a);
    }

}

class B extends  InheritanceReview{

    public B(int a) {
        super(a);
    }
}

class C extends  InheritanceReview{

    public C(int a) {
        super(a);
    }
}


class Aa extends A{

    public Aa(int a) {
        super(a);
    }
}

class Bb extends B{

    public Bb(int a) {
        super(a);
    }
}

class Cc extends C{

    public Cc(int a) {
        super(a);
    }
}

class D{
    void m(){
        super.toString(); // Object class
    }

}