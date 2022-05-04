package day44_Abstraction.carTask;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    public void start(){

        System.out.println(getMake() + " " +getModel() +" Push the start button");
    }

    public void drive(){
        System.out.println(getMake() + " " + getModel() + " Use steer wheel for driving");
    }




}
