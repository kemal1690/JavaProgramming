package day43_Abstraction.car;

public final class Honda extends Car{//final prevents the class to be inherited

    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {//Overrriding the abstract class
        System.out.println("Twist the key for ignition");
    }
}
