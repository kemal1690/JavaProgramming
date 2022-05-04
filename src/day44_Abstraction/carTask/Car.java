package day44_Abstraction.carTask;

public abstract class Car {

  private final String make;
  private final String model;
  private final int year;
  private double price;
  private String color;

    public Car(String make, String model, int year, double price, String color) {
        if(make==null || make.isEmpty()) {

            throw new RuntimeException("Invalid make");
        }
        this.make = make;

        if(model==null || model.isEmpty()) {

            throw new RuntimeException("Invalid model");
        }
        this.model = model;

        if(year < 1886){
            throw new RuntimeException("Invalid year");
        }
        this.year = year;

        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){

            throw new RuntimeException("Invalid price");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if(color==null || color.isEmpty()) {

            throw new RuntimeException("Invalid color");
        }
        this.color = color;
    }

   public abstract void start();
    public abstract void drive();
    public void stop(){

        System.out.println("Press the brake");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
