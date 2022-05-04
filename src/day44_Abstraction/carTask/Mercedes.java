package day44_Abstraction.carTask;

public class Mercedes extends Car implements AutoPark{

    public Mercedes( String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    public void start(){

        System.out.println(getMake() + " " + getModel() +" push the start button");
    }

    public void drive(){

        System.out.println(getMake() + " " + getModel() +" Use the steer wheel");
    }

    public void stop(){

        System.out.println(getMake() + " " + getModel() +" push the stop button");
    }

    public void autoPark(){

        System.out.println(getMake() + " " + getModel() +" push the auto park button");
    }

    public void selfDrive(){

        System.out.println(getMake() + " " + getModel() + " has auto pilot feature");
    }





}
