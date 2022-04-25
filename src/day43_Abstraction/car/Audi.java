package day43_Abstraction.car;

public final class Audi extends Car{//final prevents the class to be inherited


    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);//Audi is not changeable
    }

    public void start(){//Overrriding the abstract class

        System.out.println("Push the start button");

    }

    public void autoPark(){//override the abstract class
        System.out.println(getBrand() + " "+ getModel() + " has autopark feature");
    }
}
