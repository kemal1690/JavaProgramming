package day43_Abstraction.car;

public final class Tesla extends Car{//final prevents the class to be inherited

    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }


    @Override
    public void start() {//Overrriding the abstract class
        System.out.println("Say \"start\"");
    }


    public void autoPilot(){

        System.out.println(getBrand() +" "+getModel() + " has auto pilot feature");
    }
}
