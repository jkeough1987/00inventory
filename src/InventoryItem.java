import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joshuakeough on 9/7/16.
 */
public class InventoryItem {
    String category;
    int quantity;
    String name;

    public InventoryItem(String category, int quantity, String name) {
        this.category = category;
        this.quantity = quantity;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

//    public void enterName() {
//        System.out.println("Please enter the name of the item");
//        String userItem = Main.scanner.nextLine();
//    }
//
//    public void enterQuantity() {
//        System.out.println("Please enter the quantity");
//        int userQuantity = Integer.parseInt(Main.scanner.nextLine());
//    }




}

