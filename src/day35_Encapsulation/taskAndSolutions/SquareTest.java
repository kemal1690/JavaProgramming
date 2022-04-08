package day35_Encapsulation.taskAndSolutions;

public class SquareTest {
    public static void main(String[] args) {

        Square square =  new Square(5);

        System.out.println(square);

        square.setSide(10);
        System.out.println(square.getSide());

        System.out.println(square);

    }
}
