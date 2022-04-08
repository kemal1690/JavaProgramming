package day17_While_DoWhile;

import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String u = scan.next();//userName
        System.out.println("Enter your password");
        String p = scan.next();//passWord
        int attempts = 0;

        for (int i = 1; i <=3 ; i++) {

            if(u.equals("Cydeo")&& p.equals("Cydeo123")){

                System.out.println("Logged in");
                break;
            }else{
                while(!(u.equals("Cydeo")&& p.equals("Cydeo123"))) {

                    System.out.println("Incorrect username or password, please re-enter");
                    System.out.println("Enter your username");
                    u = scan.next();//userName
                    System.out.println("Enter your password");
                    p = scan.next();//passWord
                    attempts++;


                    if (attempts == 3) {

                        System.out.println("Your account is locked");
                    }

                    break;
                }
                scan.close();


            }

        }













    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */