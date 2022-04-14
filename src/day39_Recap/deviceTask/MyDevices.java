package day39_Recap.deviceTask;

public class MyDevices {

    public static void main(String[] args) {

        Computer computer = new Computer("Hp","i5",1000);
        Phone phone = new Phone("Samsung","Galaxy",2000);
        TV tv = new TV("LG","100a",2000,1);

        Nokia nokia = new Nokia("123","abc",100);

        Laptop laptop = new Laptop("Apple", "12s",5000);


        computer.turnOn();
        System.out.println(computer);

        System.out.println(phone.getBrand());

        tv.setBrand("Samsung");
        System.out.println(tv);








    }
}
