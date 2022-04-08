package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbaacc";
        //result should be abc

        String result = "";//if the character is already contained result it shouldnt be added again
        // i <= 7 = word.length()-1 or i < 8 = word.length()-1

        for (int i = 0; i < str.length(); i++) {//i represents all the index numbers of str(starts from 0)
        String ch = ""+ str.charAt(i); //adding "" converts char into String

        if(!result.contains(ch)) {//if the character is not contained in the result
            result += ch; //the character will be added to the result
        }

        }
        System.out.println(result);


















    }
}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC
				Output:
					ABC
			Hint: You can add each characters of the string into another String
	    Condition: the character is not contained in the other String yet before you are adding
 */