package day39_Recap.deviceTask;

public class Laptop extends Computer{

    public Laptop(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void portable(){

        System.out.println( getBrand() + getModel() + " is a portable computer");

    }
}
