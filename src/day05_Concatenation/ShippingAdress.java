package day05_Concatenation;

public class ShippingAdress {

    public static void main(String[] args) {

    String name = "Jimmy Joe",
            buildingNumber = "11821B",
            streetName = "Jones Branch Dr",
            city = "McLean",
            state = "VA",
            ZIPCode = "22031A";


/*

    String name = "Jimmy Joe";
    String buildingNumber = "11821B";
    String streetName = "Jones Branch Dr";
    String city = "McLean";
    String state = "VA";
    String ZIPCode = "22031A";
 */

       // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + ZIPCode);

        String adress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + ZIPCode;
        System.out.println(adress);








    }




}
/* 1.Create a class called ShippingAdress.java
   2.Declare the following variables;

        1.name
        2.building number
        3. street name
        4. city
        5. state
        6. ZIP code
    3.Use concatenation to print the full adress

        Example:  Jimmy Joe
                  7925 Jones Branch Dr
                  McLean, VA 20125



 */