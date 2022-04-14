package day39_Recap.deviceTask;

public class Iphone extends Phone{

    public Iphone(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email) {//overloading same method different parameter
        System.out.println(getBrand() + " " + getModel() + " is having a Face Time with email: " + email);

    }


}
