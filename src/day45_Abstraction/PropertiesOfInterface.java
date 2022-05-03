package day45_Abstraction;

public interface PropertiesOfInterface {//interface can not be final because of the inheritance
//interface method can be abstract,static or default

    int a = 100;  // static & final by default
    static int b = 200; // final by default

    /*
    public PropertiesOfInterface(int a){//interface can not have constructor but abstract can have
        this.a =a;
    }
    */
    /*
    static{ //static block can not be used in interface static block is used in class
        b = 100;
    }

     */


    /*
    public void method1(){//Instance variable is used when you creatge an object
        System.out.println("Instance method"); //interface method can not have body and instance method
    }

     */


    static void method2(){
        System.out.println("Static method");
    }

    void method3();

    default void method4(){
        System.out.println("Default method");//it will be implemented as it (same) is by the sub-classes
        //and in the subclass method4() is teated as instance
    }

    class Test implements PropertiesOfInterface{

        @Override
        public void method3() {

        }



        public static void main(String[] args) {

            new Test().method4();//We have to create an object IOT implement default method4
            //in regular class method4() for is treated as instance method



        }


    }











}
