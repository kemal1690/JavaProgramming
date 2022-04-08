
package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Study {
    public static void main(String[] args) {

        String name = "Ali, Ahmet, Ceren";
        ArrayList<String> each = new ArrayList<>(Arrays.asList(name));
        System.out.println(each);//[Ali, Ahmet, Ceren]
        System.out.println(each.size());//1







    }
}
