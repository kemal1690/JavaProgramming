package day27_WrapperClasses;

public class PasswordValidation {
    public static void main(String[] args) {

    String password = "A123.45";

    password = password.trim();

    int countUpperCaseLetter = 0;
    int countLowerCaseLetter = 0;
    int countDigit = 0;
    int countSpecialChar = 0;

        for (int i = 0; i <password.length() ; i++) {

            char each = password.charAt(i);


            if(Character.isLowerCase(each)){
                countLowerCaseLetter++;

            }else if(Character.isUpperCase(each)) {
                countUpperCaseLetter++;

            }else if(Character.isDigit(each)) {

                countDigit++;

            }else{
                countSpecialChar++;
            }

        }

        boolean result = password.length()>=8 && !password.contains(" ") && countUpperCaseLetter>=1 && countLowerCaseLetter >=1
                && countSpecialChar >=1 && countDigit >=1;

        if(result){

            System.out.println("Valid Password");
        }else{

            System.out.println("Invalid password. Please re-enter valid password");

            }

        }

    }

/*
PasswordValidation:
        Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1. Password MUST be at least have 8 characters long, and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lower case letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit

 */

