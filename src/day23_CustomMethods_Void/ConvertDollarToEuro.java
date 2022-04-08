package day23_CustomMethods_Void;

public class ConvertDollarToEuro {
    public static void main(String[] args) {


        dollarToEuro(1000);


    }

    public static void dollarToEuro(double dollarAmount){
        double euro = dollarAmount * 1.13;
        System.out.println(dollarAmount+" dollar equal to "+euro+" euro");
    }


}
/*
8. create a method that can convert dollar to euro



9. create a method that can can convert dollar to lira

    public static void dollarToLira(double dollarAmount){
        double lira = dollarAmount * 13.85;
        System.out.println(dollarAmount+" dollar equal to "+lira+" lira");
    }

10. create a method that can convert kg to lb
public void kgToLb(double kg){

        double lb = kg * 2.205;
        System.out.println(kg+" kg equal to "+lb+" pounds");



 */






