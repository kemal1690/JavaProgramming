package utilities;

import day40_FinalKeyWord.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {


       // System.out.println(AccessModifiers_Test4.name1);//default A.M is not visible outside the package
        System.out.println(AccessModifiers_Test4.name2);//protected A.M is visible outside the package in subclass ONLY

        //AccessModifiers_Test4.method1();
        AccessModifiers_Test4.method2();









    }

}
