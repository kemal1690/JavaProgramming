package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {

       // System.out.println(Circle.pi);//this is unnecessary because we imported pi
        System.out.println(pi);// if we didn't import pi, we sshould have called the class name


    }
}
