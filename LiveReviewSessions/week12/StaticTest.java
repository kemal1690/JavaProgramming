package week12;

public class StaticTest {

    public String instanceValue = "Selenium";
    public static String word = "Java";

    public static void main(String[] args) {
        //System.out.println(instanceValue);//even if in main method
        // we can not call instance method because main method is also static
        System.out.println("word = " + word);


        // I want to use displayMessage method, do I have to create object? NO
        StaticMethods.displayMessage("Hello static function");
        StaticMethods object = new StaticMethods();
        object.displayMessage("Hello, I am using object to call you");
        // variables
        System.out.println(StaticMethods.count);
        System.out.println(object.count);

        StaticMethods object2 = new StaticMethods();
        System.out.println(object2.num);
        object2.count = 15;//we can assign a value to static variable by calling object

        System.out.println(object.count); // 15

        // call instance method
        //  StaticMethods.instanceMethod(); compiler error, because we cant use instances by calling class name
        object.num = 3;
        object2.num=4;

        object.instanceMethod();
        object2.instanceMethod();
    }
}
