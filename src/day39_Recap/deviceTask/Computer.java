package day39_Recap.deviceTask;

public class Computer extends Device{

    public Computer(String brand, String model, double price) {
        super(brand, model, price);
    }


    public void turnOn(){

        System.out.println(getBrand() + " " + getModel() + " " + getPrice() + " turned on") ;

    }






}
