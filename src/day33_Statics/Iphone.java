package day33_Statics;

public class Iphone {


    public static String brand = "iphone";//we initialize the value because it has just one value

    public String model;
    public double price;
    public static String OS = "IOS";//operating system;
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean touchScree = true;
    public static boolean hasFaceTime = true;

    public static void printOperatingSystem(){
        System.out.println(OS);
    }


    // public static void printModelAndPrice(){
    //    System.out.println(model+" : "+price); // static methods does not accept instances
    //  }


    public void method1(){//instance method can accept statics
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }








}
