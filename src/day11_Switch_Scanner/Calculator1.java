package day11_Switch_Scanner;

public class Calculator1 {
    public static void main(String[] args) {

        double n1 = 1.0;
        double n2 = 2.0;
        char operator = '0';
        double result = 3.0;

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {

            switch (operator) {
                case '+':
                    result = (n1 + n2);
                    break;

                case '-':
                    result = (n1 - n2);
                    break;

                case '*':
                    result = (n1 * n2);
                    break;

                default:
                    result = (n1 / n2);


            }


        } else {
            System.out.println("invalid operator");

        }
    }
}