package day35_Encapsulation.taskAndSolutions;

public class CarpetTest {
    public static void main(String[] args) {

        Carpet carpet = new Carpet(2,3,100,true);

        System.out.println(carpet);

        carpet.setPersian(true);
        carpet.setUnitPrice(8);
        carpet.setWidth(7);
        carpet.setLength(6);

        System.out.println(carpet);














    }
}
