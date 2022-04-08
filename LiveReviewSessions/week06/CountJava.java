package week06;
import java.util.Scanner;
public class CountJava {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        String sentence = scan.nextLine();
        int count = 0;

        for (int i = 0; i <=sentence.length()-4 ; i++) {

            String word = sentence.substring(i,i+4);

            if(word.equalsIgnoreCase("java")){
                count++;

            }scan.close();

        }
        System.out.println(count);



















    }

}
