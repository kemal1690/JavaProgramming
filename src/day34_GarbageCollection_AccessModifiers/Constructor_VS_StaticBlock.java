package day34_GarbageCollection_AccessModifiers;

public class Constructor_VS_StaticBlock {

    static{
        System.out.println("Static Block");

    }

    public Constructor_VS_StaticBlock(){

        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        System.out.println("Main Method");

        new Constructor_VS_StaticBlock();
        new Constructor_VS_StaticBlock();
        new Constructor_VS_StaticBlock();
        new Constructor_VS_StaticBlock();
        new Constructor_VS_StaticBlock();

    }










}
