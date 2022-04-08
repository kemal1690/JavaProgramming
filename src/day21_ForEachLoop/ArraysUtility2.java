package day21_ForEachLoop;
import java.util.Arrays;
public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students,3);//starts from the first element till given number included
        //if the newlength equals bigger than the array elements it will print all the element within the array and instead
        //of remaining numbers it will print "null"

        System.out.println(Arrays.toString(earlyBirds));//[Elif,Sinem,Günay]

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers,5);//{1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));
        System.out.println("--------------------------------------------");

        char[] ch1 = {'A','B', 'C', 'D', 'E', 'F', 'G', 'H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,6);//index numbers==> last index number is excluded. similar to substring

        System.out.println(Arrays.toString(ch2));//[C, D, E, F]

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
                    //  0    1   2   3   4   5   6  7    8   9

        int[] result = Arrays.copyOfRange(scores, 3,8);

        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores,5,scores.length);

        System.out.println(Arrays.toString(result2));






    }
}
