package day44_Abstraction.carTask;

public class Nio extends Car implements AutoPark,AutoPilot{

    public Nio( String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    public void start(){

        System.out.println(getMake() + " " + getModel() +" Say \"start\"");
    }

    public void drive(){

        System.out.println(getMake() + " " + getModel() +" Use the steer wheel");
    }

    public void stop(){

        System.out.println(getMake() + " " +getModel() +" Say \"stop\"");
    }

    public void autoPark(){

        System.out.println(getMake() + " " + getModel() +" Say \"Auto park\"");;
    }

    public void selfDrive(){

        System.out.println(getMake() + " " + getModel() + " has auto pilot feature");
    }

}
