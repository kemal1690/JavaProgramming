package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

    int a = 10,
        b = 15,
        c = 20;
    // if we have three different numbers, one MUST maximum, one MUST be minimum and one MUST be Median
        // Example     a=15,b=10,c=20    a=15,b=20,c=10 ==> can be any numbers
    boolean aIsmedian = (a > b && a < c) || (a < b && a > c);
    /*
     in order for a to be the median number:
    1. if c is the maximum number & b is the minimum number, then a is the median number
    2. if b is the maximum number & c is the minimum number, then a is the median number

     */

        boolean bIsmedian = (b>a && b < c) || (b < a && b > c);
        //boolean cIsMedian = c > a && c < b || c < a && c > b;
        boolean cIsMedian = !aIsmedian && !bIsmedian;

        if(aIsmedian){
            System.out.println(a+ " is the median number");
        }
        if(bIsmedian){
            System.out.println(b+ " is the median number");
        }
        if(cIsMedian){
            System.out.println(c+ " is the median number");
        }






    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
        Ex:
        a = 10, b= 15, c = 20;
        Output:
        15 is the median number
        Possibility #1: a could be median number
        Possibility #2: b could be median number
        Possibility #3: c could be median number

 */