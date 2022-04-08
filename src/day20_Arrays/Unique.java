package day20_Arrays;

public class Unique {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        for (int i = 0; i <words.length ; i++) {
            String each = words[i];
            int count = 0;

            for (int j = 0; j <words.length ; j++) {

                if(words[j].equals(each)){

                    count++;
                }


            }
            if(count==1){

                System.out.println(each);
            }

        }













    }
}
