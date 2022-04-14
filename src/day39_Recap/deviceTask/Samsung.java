package day39_Recap.deviceTask;

public class Samsung extends Phone{

    public Samsung(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void freeze() {
        System.out.println(getBrand() + " " + getModel() + " is freezing");

    }



}
