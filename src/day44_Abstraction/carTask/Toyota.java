package day44_Abstraction.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    public void start(){

        System.out.println(getMake() + " " + getModel() +" Twist the key for ignition");
    }

    public void drive(){
        System.out.println(getMake() + " " + getModel() + " is using steer wheel for driving");
    }


}
