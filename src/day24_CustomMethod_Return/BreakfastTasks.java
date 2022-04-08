package day24_CustomMethod_Return;

public class BreakfastTasks {


    public static void main(String[] args) {

initials("wooden","spoon");//2 Arguments

        System.out.println("---------------------------");

domain("Cydeo@gmail.com");

        System.out.println("-------------------------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {

            domain(email);

        }


       nameOfMonth(13);
        System.out.println("---------------------------------");

        nameOfDay(8);
        System.out.println("--------------------------------------");

        daysInMonth(8);


    }

//1. Create a method that can display the initials of the person

public static void initials(String firstName, String lastName){// 2 parameters

      String  initial = firstName.charAt(0) + "." + lastName.charAt(0); //body of the method determines the type of the function

    initial = initial.toUpperCase();
    System.out.println(initial);

}

  //2.  Create a method that can display the domain of the email

public static void domain(String eMail ){//Cydeo@gmail.com

      String domain = eMail.substring(eMail.indexOf("@")+1, eMail.lastIndexOf("."));

    System.out.println("domain = " + domain);;

}

//3. Create a method that can display the name of the month based on the given number to the method

public static void nameOfMonth(int number){

        String name = "";

if(number>=1 && number<=12) {

    name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May"

    :(number == 6) ? "June"  :(number == 7) ? "July" :(number == 8) ? "August" :(number == 9) ? "September"
            :(number == 10) ? "October" :(number == 11) ? "November" : "December";

}else {
    name = "Invalid";
}

    System.out.println("Month name : " + name);







}


//4. Create a method that can print the name of the day based on the given number to the method
public static void nameOfDay(int number){

  String name = "";

  if(number>= 1 && number<=7){

      name = (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday" :(number==4)? "Thursday" :(number==5)? "Friday"
              :(number==6)? "Saturday" : "Sunday";



  }else{
      name = "Invalid";
  }

    System.out.println("Name of the day: " + name);




}

//5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){

        String days = "";

        if(number>=1 && number <=12){

            days = (number == 2)? "Month has 28 Days" :(number==4 || number ==6 || number == 9 || number ==11)?
        "Month has 30 days" : "Month has 31 days";

        }else{
           days = "Invalid";
        }

        System.out.println( days);

    }
/*
    Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
    Months that has 30 days: 4, 6, 9, 11
    Month that has 28 days: 2

 */

//6. ageGroups




}









/*
Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
                        */