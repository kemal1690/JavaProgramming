package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabccc"; //indexOf('b') = 3, lastIndexOf('b') = 3, means b is unique
        String result = "";

        for (int i = 0; i <= str.length()-1 ; i++) {//i : index numbers of String starting from 0
           char ch =  str.charAt(i);//get each of the character of String str


            if(str.indexOf(ch) == str.lastIndexOf(ch)) {//if the first and last index numbers of the character are same,
                                                            // then the character is unique
                                                            //indexOf('a') = 0; lastIndexOf('a')=2

                result += ch;
            }

        }
        System.out.println(result);



    }
}
/*
3. Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD
				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
 */