package week08;

public class ShoppingAppTest {
    public static void main(String[] args) {


        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        //                   0         1           2         3        4           5

        double[] prices = {99.99,   150.0,  9.99,   250.0 ,  439.50,  39.99};
        //                   0        1       2       3        4         5

        int[] itemIDs =   {12345 ,  12346,  12347,  12348,  12349,   12350};


        System.out.println("-----Look for 'Jacket' in items and if found print all the details of the item");

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("Jacket")){
                String itemDetail = items[i]+ " - $ "+prices[i]+" - # "+itemIDs[i];
                System.out.println("itemDetail = " + itemDetail);
                break;
            }

        }





    }
}
