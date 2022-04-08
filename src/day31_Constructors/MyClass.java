package day31_Constructors;

public class MyClass {

    int x,y;

    public MyClass(int x, int y) {

       this.x = x;
       this.y=y;

    }

}

class Test{

    public static void main(String[] args) {


        MyClass myClass = new MyClass(5,10);
        System.out.println(myClass.x + " " + myClass.y);

    }







}