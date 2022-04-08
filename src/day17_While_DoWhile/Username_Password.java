package day17_While_DoWhile;

import java.util.Scanner;

public class Username_Password {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String u = scan.next();//userName
        System.out.println("Enter your password");
        String p = scan.next();//passWord




            if(u.equals("Cydeo")&& p.equals("Cydeo123")) {

                System.out.println("Logged in");

            }else{
                for (int i = 1; i <3 ; i++) {

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username");
                u = scan.next();//userName
                System.out.println("Enter your password");
                p = scan.next();//passWord

                    if(u.equals("Cydeo")  && p.equals("Cydeo123")) {
                        System.out.println("Logged In");
                        break;
                    }
            }
                if(!(u.equals("Cydeo")&& p.equals("Cydeo123"))){

                    System.err.println("Your account is locked, Please contact support team");
                }

                scan.close();



            }














    }
}
