package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCC";
        String result = ""; //A



        for (int i = 0; i < str.length() ; i++) {

           String ch = "" + str.charAt(i);//A,A,B,B,C,C
            if(result.contains(ch)){//if the result already has the character


                continue;// İf we write break it prints just 'A'

            }
                result += ch;

        }
        System.out.println(result);











    }
}
