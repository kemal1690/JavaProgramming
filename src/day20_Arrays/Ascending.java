package day20_Arrays;

public class Ascending {

    public static int number3 (int [] arr){
        int response = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        response = arr[2];
        return response;
    }

    public static void main(String[] args) {

        int[] arr = {1,23,54,69,14,24,17,35};

        System.out.println("3. sayı : "+ number3(arr));


    }

}