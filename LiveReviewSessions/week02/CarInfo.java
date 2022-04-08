package week02;

public class CarInfo {

    public static void main(String[] args) {

    int year =2022;
    String make = "Audi";
    String model = "A6";
    boolean transmission = true; // authomatic is true, manual is false
    String color = "black";
    int mileage = 0;
    int price = 75_000;

        System.out.println(year + " " + make + " " + model + "\nAuthomatic transmission: " + transmission );
        System.out.println(color + " l " + mileage + " l " + price);

        //lets do it fot tl

        double priceIntl = price * 15.5;
        double taxRate = 1.80;
        double priceafterTaxIntl = priceIntl + (priceIntl + taxRate);

        System.out.println("priceafterTaxIntl = " + priceafterTaxIntl);











    }





}
