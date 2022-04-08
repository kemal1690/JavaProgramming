package day33_Statics.TaskAndSolutions;

public class IPhoneTest {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iphone 12", 20000, "black", "5.6 inches");

        System.out.println(iPhone);

        iPhone.faceTime(123456789);
        iPhone.faceTime("gmail@yahoo.com");
        iPhone.call(123456789);
        iPhone.text(123456789);











    }
}
