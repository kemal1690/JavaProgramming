package day20_Arrays;

public class SortMethod {
    public static void main(String[] args) {


    }
        public static int largestNumber(int [] array){

            for (int i = 0; i < array.length-1; i++) {

                for (int j = i+1; j < array.length ; j++) {

                    if(array[i]> array[j]){

                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;

                    }
                }

            }
            return array[array.length-1];
        }
    }

