package day19_LoopPractices;

public class Freq {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; //bdf

        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length() ; j++) {

                char each = str.charAt(j);
                if(ch!=each){
                    count++;

                }


            }

        if(count!=0){
            result += ch;
        }


        }
        System.out.println(result);

















        }

    }
