package week01;

public class TestManipulator {
    public static void main(String[] args) {


    StringManipulator word = new StringManipulator("java");

        StringManipulator word1 = new StringManipulator("selenium");

        System.out.println(word.str);

        word.firstTwoChars();
        word1.firstTwoChars();

        System.out.println(word.str);
        System.out.println(word1.str);










    }
}
