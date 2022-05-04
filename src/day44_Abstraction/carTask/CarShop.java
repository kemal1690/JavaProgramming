package day44_Abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {

        Honda honda = new Honda("Civic", 1990,10000,"white");
        Toyota toyota = new Toyota("Corolla",2009,20000,"black");
        Tesla tesla = new Tesla("Hybrid",2019,30000,"black");
        BMW bmw = new BMW("X6",2019,50000,"white");
        Audi audi = new Audi("A6",2021,40000,"white");
        Nio nio = new Nio("Pars",2020,50000,"blue");
        CydeoCar cydeoCar = new CydeoCar("Cydeo",2020,100000,"green");


        System.out.println("honda = " + honda);
        System.out.println("toyota = " + toyota);
        System.out.println("tesla = " + tesla);
        System.out.println("bmw = " + bmw);
        System.out.println("audi = " + audi);
        System.out.println("nio = " + nio);
        System.out.println("cydeoCar = " + cydeoCar);


        honda.drive();
        toyota.start();
        tesla.selfDrive();
        audi.autoPark();
        nio.stop();
        cydeoCar.fly();








    }
}
