package day19_LoopPractices;
import java.util.Scanner;
public class HighestFrequency {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch = str.charAt(0);
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch1 == each){
                    count++;
                }
            }if(count > count1){
                count1 = count;
                ch = str.charAt(i);
            }

        }scan.close();
        System.out.println(ch + " has the highest frequency, and its frequency is " + count1);
    }
}



