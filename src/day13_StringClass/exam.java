package day13_StringClass;

import java.util.Scanner;

public class exam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean isTall = scan.hasNextBoolean();
        boolean isFast = scan.hasNextBoolean();
        boolean isFlexible = scan.hasNextBoolean();
        String sport = "";
        if(isTall){
            if(isFast){
                sport = "basketball";
            }else if(isFlexible){
                sport = "gymnastic";
            }else{
                sport = "voleyball";
            }


        }else{
            if(isFast){
            sport = "soccer";
            }else{
                sport = "tennis";
            }

        }
        System.out.println(sport);




    }
}
