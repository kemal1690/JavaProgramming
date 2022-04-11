package day38_Inheritance;

public class Toyota extends Car {


    public Toyota(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }


    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }


    public void start(){
        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }


}

/*
1. Toyota:
					extra methods:
							reliable()
 */
