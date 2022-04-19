package day42_Exceptions;

class FadyException extends RuntimeException{//IOT create custom unchecked exception we need to extend/inherit RuntimeException Class

    //We have 2 constructors, so we have 2 ways to create an object

    public FadyException(){//default constructor
        super("Time for a short break");
    }

    public FadyException(String message){
        super(message);// We are calling parent class constructor>>RuntimeException
    }

}


class NoBreakException extends Exception{ // IOT create custom checked exception we need to extend/inherit Exception Class

}

public class CustomExceptions {

    public static void main(String[] args)  {

       // throw new FadyException("It's time for lunch break");


        try {
            throw new NoBreakException();//checked exception
        } catch (NoBreakException e) {
            e.printStackTrace();
        }




    }




}

