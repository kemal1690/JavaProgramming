package day39_Recap.deviceTask;

public class Device {

    private String brand;
    private String model;
    private double price;
    private static boolean hasBattery;
    private static boolean hasPowerButton;



    static{

        hasBattery = true;
        hasPowerButton = true;
    }

    public Device(String brand, String model, double price) {
       setBrand(brand);
       setModel(model);
       setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if(brand == null){

            System.out.println("Brand cannot be null");
            System.exit(1);
        }

        if(brand.isBlank() || brand.isEmpty()){
            System.out.println("Brand can not be either empty nor blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model==null){
            System.out.println("Model can not be null");
            System.exit(1);
        }

        if(model.isBlank() || model.isEmpty()){
            System.out.println("Model can not be either empty nor blank");
            System.exit(1);
        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <=0){

            System.out.println("Price can not be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }


    public void turnOn(){

        System.out.println(brand + " " + model+ " turned on" );

    }

    public void turnOff(){

        System.out.println(brand + " " + model+ " turned off" );

    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
