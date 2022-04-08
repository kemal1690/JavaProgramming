package day24_CustomMethod_Return;

public class ReturnMethodIntroReverseExample {
    public static void main(String[] args) {

        String str = "Java";


    String result = reverse(str);
        System.out.println(result);

        if(str.equalsIgnoreCase(result)){

            System.out.println(str +" is palindrome ");
        }else{
            System.out.println(str +" is not palindrome");
        }

    }




    public static String reverse(String str){//we dont use print statement in return method
                                            // we use print statement in void method
        //The aim of return method is to make data reusable even outside of the method

        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {

            reverse += str.charAt(i);


        }
            return reverse;


    }



}
