package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.AccessModifiers.*;

public class AccessModifiers_Test {

    public static void main(String[] args) {

        System.out.println(publicData);
       // System.out.println(defaultData);//default Access Modifier is not visible outside the package
        // System.out.println(privateData);//private Access Modifier is not visible outside the class

        AccessModifiers.method1();
       // AccessModifiers.method2();//default Access Modifier is not visible outside the package
        // AccessModifiers.method3();//private Access Modifier is not visible outside the class



    }
}
