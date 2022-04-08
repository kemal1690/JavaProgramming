package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';//3

        int frequency = 0;//for each equality value of frequency is increased by one

        for (int i = 0; i <str.length() ; i++) {

            char eachChar = str.charAt(i);

                //'A'   == 'A'
            if(eachChar == ch){ //if(ch==str.charAt(i)) in that case no need to write char eachchar
                frequency++;//if given char is matching with the eachChar then char is appeared in the String
            }

        }
        System.out.println(frequency);












    }
}
/*
1. Write a program that can return the frequency of a char from a String
			Ex:
				str = "AAABBBC"
				ch = 'A'
			Output:
				3
 */