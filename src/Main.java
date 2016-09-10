import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joshuakeough on 9/7/16.
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<InventoryItem> inventoryItems = new ArrayList<>();






    public static void main(String args[]) throws Exception {
        InventoryItem item = new InventoryItem("Fruit", 1, "squash");
        boolean a = true;
        while(a) {
            item.menu();
        }



    }




}
