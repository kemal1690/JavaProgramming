package day22_MultiDimensionalArrays;
import java.util.Arrays;
public class ReverseSecondWord1 {
    public static void main(String[] args) {

/*
      String  sentence = "I Love Java";

      String[] word = sentence.split(" ");
      String secondWord = "";
      String reversed = "";

        for (int i = 1; i <word.length-1 ; i++) {

          secondWord+= word[i];

            }

        String result = "";
        for (int i = secondWord.length()-1; i >=0 ; i--) {

            reversed += "" + secondWord.charAt(i);

        }

        result += sentence.replaceFirst( word[1], reversed);


        System.out.println(result);

 */

        String sentence = "I Love Java";

        String[] words = sentence.split(" "); //[I, Love, Java]

        String reverse ="";

        for(int i = words[1].length()-1; i >= 0; i-- ){
            reverse += words[1].charAt(i);
        }

        System.out.println(reverse);//evoL

        //  sentence = sentence.replaceFirst(words[1], reverse);

        words[1] = reverse;
        System.out.println(Arrays.toString(words));//[I, evoL, Java]

/*
        for (String word : words) {
            System.out.print(word+" ");
        }

 */

        String result = "";
        for (String word : words) {
           result += word + " ";
        }
        System.out.println(result);//I evoL Java










    }
}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";
			output:
				I evoL Java
 */