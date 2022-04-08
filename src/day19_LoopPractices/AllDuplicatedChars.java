package day19_LoopPractices;

public class AllDuplicatedChars {
    public static void main(String[] args) {


                String str = "aabbccddeeff";
                String result = "";

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
                        if(result.contains(str.charAt(i)+"")){
                            continue;
                        }
                        result += str.charAt(i);
                    }
                }
                System.out.println(result);
    }
}
