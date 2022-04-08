package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {


        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};


        for (int j = 0; j < chars.length; j++) {

            char ch =  chars[j]; //"Java"

            int frequency =0;
            for (int i = 0; i < chars.length; i++) { // finds the frequency of element from array
                if( chars[i] == (ch)){
                    frequency++;
                }
            }

            if(frequency == 2){
                System.out.println(ch);
            }

        }

    }
}
/*

 for (char each : chars) {
            int count = 0;
           for (char ch : chars){

               if(each == ch){
                   count++;
               }
               }
            if(count ==2){
                System.out.println(each);
           }

        }

 */