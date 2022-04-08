package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {//public access modifier. Outer class can not be static
//class can be static if the inner class has the static keyword
    //pre condition for static class is there must be a nested class
    static class class1{//default access modifier


    }

    public static int num = 100; //variable can be static

    public static void method(){//method can be static


    }

    static { //block can be static




    }


}




   class A {//outer class

      static  class B {//inner class

          public static void method1() {


          }

        }
    }

    class C {

        public static void main(String[] args) {

           A.B.method1();

        }


    }

class X{

}

class Y{

}

class Z{
    static class Q{

    }
}