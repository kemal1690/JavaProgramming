package day38_Inheritance;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", "Camry", 2020, 25000, "white",80000);


        Tesla tesla = new Tesla("Tesla", "Model S", 2019, 50000, "black",30000);

        BMW bmw = new BMW("BMX", "X6", 2018, 45000, "black",100000);



        toyota.start();
        tesla.start();
        bmw.start();



    }
}
