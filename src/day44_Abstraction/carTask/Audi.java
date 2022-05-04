package day44_Abstraction.carTask;

public class Audi extends Car implements AutoPark{

    public Audi( String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    public void start(){

        System.out.println(getMake() + " " + getModel() + " Push the start button");
    }

    public void drive(){

        System.out.println(getMake()+ " " +getModel() +" Use the steer wheel");
    }

    public void stop(){

        System.out.println(getMake() + " " + getModel() +" Push the stop button");
    }

   public void autoPark(){

       System.out.println(getMake() + " " + getModel() +" Push the auto park button");
   }

   public void selfDrive(){

       System.out.println(getMake() + " " + getModel() + " has auto pilot feature");
   }



}
