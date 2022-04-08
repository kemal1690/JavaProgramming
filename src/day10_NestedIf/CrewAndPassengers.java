package day10_NestedIf;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int number = 70;
        String result = "";
        boolean validNumber = number == 50 || number == 75 || number == 100;

        if(validNumber) {

            if (number == 50) {
                result = "20 crew, 30 passengers";
            } else if (number == 75) {
                result = "25 crew, 50 passengers";
            } else {
                result = "30 crew, 70 passengers";
            }
        }else{
            result = "Invalid Number";
        }

        System.out.println(result);













    }
}
/* Given a number of people on the ship

        Total : 50 ====> 20 crew, 30 passengers;
        Total : 75 ====> 25 crew, 50 passengers;
        Total : 100 ====> 30 crew, 70 passengers;
        Any other number of people on the ship is not valid
        NOTE: Must use Nested If, Do not use more than one print statement



 */