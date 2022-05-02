package day44_Abstraction.animal;

public interface Playable {// super type

    boolean isFriendly= true;//All the variables are static and final by default in interface
    //no need to write static boolean isFriendly;

    /*
    static{ we can not use static block. Because interface is not a class
        isFriendly = true;
    }
     */
/*
    public static void method1(){
        System.out.println(isFriendly);//We can understand that isFriendly is static by using it within the static method

    }

 */

    //public abstract void play(); no need to write public abstract because compiler gives them by default
     void  play();//abstract and public by default
}
