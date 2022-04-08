package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJava"; //length = 19

        int frequency = 0;
                                    //length()-4 stands for the length of the given word
        for (int i = 0; i <= str.length()-4 ; i++) {//Not to exceed the length of the str or out of index bound exception
                                         //i = 0,1,2,3

            String eachSub = str.substring(i, i+4);//ending index is excluded due to the substring
                                                // Ex: (18, 22) exceeds the length of the str
            //System.out.println(eachSub);

            if(eachSub.equalsIgnoreCase("Java")){

                frequency++;//frequency += 1;
            }


        }
        System.out.println(frequency);









    }
}
/*
2. write a program that can return the frequency of the word Java from the sentence
        Ex:
            sentence = "JavaJavaJava";
            output: 3

            substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)

 */