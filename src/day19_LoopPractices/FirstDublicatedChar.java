package day19_LoopPractices;

public class FirstDublicatedChar {
    public static void main(String[] args) {
        String str = "abcdddeef";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch == each){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("The first duplicated character is: " + str.charAt(i));
                break;
            }
        }
    }
}
