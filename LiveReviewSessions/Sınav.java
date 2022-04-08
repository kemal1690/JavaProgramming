import java.util.Arrays;

public class Sınav {

    public static void main(String[] args) {

/*
        String s = "The ame was tied at 2-2";

        int a = s.indexOf("game");//-1
        System.out.println(a);

        System.out.println("----------------------------");

        String z = "popcorn";

        z = z.substring(1,8);//.StringIndexOutOfBoundsException

        System.out.println(z);

        System.out.println("---------------------------------");



        String b = "today I will go to the beach";

        boolean c = b.contains("i");
        boolean d = b.substring(12).startsWith("go");

        String result = c&&d? "go" : "dont go";

        System.out.println(result);//dont go

  System.out.println("---------------------------------");

        int number = 5;

        while(number<100){

            number += number;
        }
        System.out.println(number);//160


System.out.println("---------------------------------");
        int a = 0;

        do{

            a = a++ + --a - (a%3);
        }while(++a<4);

        System.out.println(a);//7



        String str = "The whole time it was raining.";

       do{

           System.out.println(str.charAt(0));//T o miw in
           str = str.substring(3);
       }while(!str.isEmpty());



        String s  = "I will find the lost book";
        String word ="";

        for(int i = s.length()-1; i<=0; i--){

            word += s.charAt(i);
        }

        System.out.println(word); //No answer text provided

 */


        String input = "today it will be 100 degrees";
        int n = 0;

        while(n++ < input.length()){

            if(n==8){

                continue;
            }else if(n==9){

                break;
            }

            System.out.println(input.charAt(++n));
        }


        System.out.println("-----------------------------------------------------");

        int count = 0;

        for(int a = 0; a<4; a++){

        if(a==3){

            continue;
        }

        for(int b = a+1; b<5; b++){

            count++;

            if(b==3){
                break;
            }

        }

        }

        System.out.println(count);


        System.out.println("-----------------------------------------");
/*
        //note value of a changes from top to bottom. line of index is not important
        int[] nums = new int[5];

        int a = 5;

        nums[2] = a--;
        nums[0] = a*2;
        nums[4] = --a + (a-9);
        nums[1] = nums[2];
        nums[3] = nums[a-3];

        System.out.println(Arrays.toString(nums));

        System.out.println("-----------------------------------------");



        String[] strs = {"display","population", "meeting","copy", "franchise"};

        int a = strs.length;
        int b = strs[5].length();

        System.out.println(b); //ArrayIndexOutOfBoundsException

 */

        int[] arr = {1,3,12,5,24,7,9,10};

        boolean[] bArr = new boolean[arr.length];

        for (int i = bArr.length - 1; i >-1; i--) {

            if(arr[i] %2 ==0){

                bArr[arr.length - 1- i] = true;
            }
            
        }

        System.out.println(Arrays.toString(bArr));






    }
}
