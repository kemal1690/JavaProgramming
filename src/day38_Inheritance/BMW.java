package day38_Inheritance;

public class BMW extends Car{


    public BMW(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }


    public void breaksDown(){
        System.out.println(brand + " "+ model +" is breaking down");
    }

    public void racing(){
        System.out.println(brand + " "+ model +" is a racing car");
    }


    public void start(){
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }


}

/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */












