package day17_While_DoWhile;

public class FrequencyOfWord_WithWhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while(str.contains("Java")){

            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);

        System.out.println("-------------------------------------");

        String sentence = "cat cat cat cat dog dog cat cat CAT CAT Cat";
        sentence = sentence.toLowerCase();

        int countCat = 0;//the first execution of the loop value will be 1, second ececution 2....

        while(sentence.contains("cat")){

            sentence = sentence.replaceFirst("cat", "");//replaceFirst because one cat delete for once to add
                                                                // the deleting number to the countCat
            countCat++;//count the frequency of deleting cat
        }

        System.out.println(countCat);
        System.out.println("---------------------------------------");

        String s = "java java java python python python";

        int countJava = 0;
        int countPython = 0;

        while(s.contains("java") || s.contains("python")){

            if(s.contains("java")){
                s=s.replaceFirst("java","");
                countJava++;
            }
            if(s.contains("python")){
                s=s.replaceFirst("python","");
                countPython++;
            }


        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);





    }
}
