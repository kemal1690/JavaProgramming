package week01;

public class StringManipulator {

    public String str;


    public StringManipulator(String str) {
        this.str = str;
    }


    public void firstTwoChars() {
        str = str.toUpperCase().substring(0, 2);
    }


    public String tripler(){


    str = "" + str.charAt(str.length()-1) + str.charAt(str.length()-2);

    return str;
    }










}