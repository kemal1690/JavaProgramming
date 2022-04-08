package day33_Statics.day37_Inheritance.phoneTask;

public class Iphone extends Phone{

//We cannot stop inheritance of brand thats why we can assign an argument for brand
    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);//We can use brand for every Iphone objects,
        //because Apple is a known information
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email) {//overloading same method different parameter
        System.out.println(brand + " " + model + " is having a Face Time with email: " + email);

    }
}
/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */