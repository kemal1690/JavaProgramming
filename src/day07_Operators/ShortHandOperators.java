package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //assignment : = ==> it is used for updating the data
        int number = 100;
        System.out.println("number = " + number);//100

        number = 20;
        System.out.println("number = " + number);//20

        String word = "Java Programming";
        System.out.println("name = " + word);// Java Programming

        word = "Wooden Spoon";
        System.out.println("word = " + word); // Wooden Spoon

        word = "Cydeo";
        System.out.println("word = " + word);//Cydeo

        word = "Java Programming";
        System.out.println("word = " + word);// Java Programming

        word = "123" + 1;
        System.out.println("word = " + word);//1231

        System.out.println("-------------------------------------");

        //Addition Assignment:
        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x + 200); // 300

        //x = x + 200;  increasing the value of the variable

        x += 200;
        System.out.println("x = " + x);//300

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1); // 2.5
        num1 += 5.5;
        System.out.println("num1 = " + num1); // 8.0

        double avaliableBalance = 1000.50;

        // deposit = $300
        avaliableBalance += 300; // avaliableBalance = 1000.50 + 300
        System.out.println("avaliableBalance = " + avaliableBalance); // 1300.5

        System.out.println("-----------------------------------------");

        // withdrawing $500
        
        avaliableBalance -= 500; //avaliableBalance = 1000.50 - 300
        System.out.println("avaliableBalance = " + avaliableBalance); // 800.5

        // withdrawing 200$ then depositing 400$

        avaliableBalance -= 200; // 600.5
        avaliableBalance += 400; // 1000.5
        System.out.println("avaliableBalance = " + avaliableBalance);

        System.out.println("------------------------------------");

        double salary = 50000.50;
        System.out.println("salary = " + salary);

        salary *= 2; // or salary = salary  * 2
        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("dodge = " + doge);

        System.out.println("----------------------------------");

        double num2 = 25000.0;
        num2 /= 2; // num2 = num2 / 2
        System.out.println("num2 = " + num2);

        System.out.println("--------------------------------------");

        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);

        System.out.println("----------------------------------------");

        int amount = 127; // cent
        int cents = amount/25;
        int quarter = amount %25;
        System.out.println("quarter = " + quarter);
        System.out.println("cent = " + cents);

        System.out.println("---------------------------");

        int cent2 = 127;
        cent2 %= 25;
        System.out.println("cent2 = " + cent2);

        System.out.println("--------------------------------");

        int y = 300;
        y %= 16;
        System.out.println("y = " + y);

        System.out.println("---------------------");

        int balance = 3500;
        // insurance fee = $153 (You pay this money for every month)
        balance %= 153; // shows your remaining money in your balance

        System.out.println("balance = " + balance);






    }



}
