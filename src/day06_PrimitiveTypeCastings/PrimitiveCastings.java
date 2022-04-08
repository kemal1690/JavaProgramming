package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;  // implicit casting
        short b = a;

        /* complier run it like;
                byte a = 100;
                short b = (short)a;
         */
        int c = b; //implicit casting
        // int c = (int)b;

        long d = c;
        //long d = (long)c;

        float e = d;
        double f = e;     //the smallest numerical primitive will be after the '=' ==> equal mark

        System.out.println("--------------------------------------");

        int x = 55;
        short y = (short)x;//explicit casting

        System.out.println(x + " : " + y);

        long j = 1000000; //No need to use L or l at the end of the number, because the number is included in int
        short k = (short)j;

        System.out.println(j + " : " + k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n; //output: 10

        System.out.println(n + " : " + s);

        double d1 = 20.5;
        short s1 = (short) d1; // Alt + Enter (cursor is at the end of semicolumn) + cast to short

        System.out.println(d1 + " : " + s1);

        float f1 = 30.5f;
        long l1 = (long) f1;







    }
}
