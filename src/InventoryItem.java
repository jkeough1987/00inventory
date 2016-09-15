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





}

