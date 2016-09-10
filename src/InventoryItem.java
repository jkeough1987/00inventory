import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joshuakeough on 9/7/16.
 */
public class InventoryItem {
    protected String category;
    protected int quantity;
    protected String name;

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

    public void enterName() {
        System.out.println("Please enter the name of the item");
        name = Main.scanner.nextLine();
    }

    public void enterQuantity() {
        System.out.println("Please enter the quantity");
        quantity = Integer.parseInt(Main.scanner.nextLine());
    }


    public void createItem() throws Exception {
        System.out.println("Please enter the type of item.\n1. Fruit\n2. Vegetable\n3. Meat\n4. Grain\n5. Sugar");
        category = Main.scanner.nextLine();

        switch (category) {
            case "Fruit":
                enterQuantity();
                enterName();
                Fruit fruit = new Fruit(category, quantity, name);
                break;
            case "Vegetable":
                enterQuantity();
                enterName();
                Vegetable veg = new Vegetable(category, quantity, name);
                break;
            case "Meat":
                enterQuantity();
                enterName();
                Meat meat = new Meat(category, quantity, name);
                break;
            case "Grain":
                enterQuantity();
                enterName();
                Grain grain = new Grain(category, quantity, name);
                break;
            case "Sugar":
                enterQuantity();
                enterName();
                Sugar sugar = new Sugar(category, quantity, name);
                break;
            default:
                throw new Exception("Invalid type.");
        }

        InventoryItem item = new InventoryItem(category, quantity, name);
        Main.inventoryItems.add(item);
    }

    public void menu() throws Exception {
        while(true) {
            int i = 1;
            for(InventoryItem item : Main.inventoryItems) {

                System.out.printf("%s.| Category %s| Quantity %s| Item %s\n", i, item.getCategory(), item.getQuantity(), item.getName());
                i++;

            }
            System.out.println("Please choose one of the following!\n1. Create new item.\n2. Remove an item.\n3. Update quantity. ");
            String answer = Main.scanner.nextLine();
            switch(answer){
                case "1":
                    createItem();
                    break;
                case "2":

                    System.out.println("Please choose the number of the item you wish to remove from the list.");
                    int listNumber = Integer.valueOf(Main.scanner.nextLine());
                    Main.inventoryItems.remove(listNumber - 1);
                    break;
                case "3":

                    System.out.println("Please indicate the number of the item you want to modify.");
                    int listNumber2 = Integer.valueOf(Main.scanner.nextLine());
                    Main.inventoryItems.get(listNumber2 - 1);
                    System.out.println("Please enter the new amount.");
                    quantity = Integer.valueOf(Main.scanner.nextLine());
                    String newName = Main.inventoryItems.get(listNumber2 -1).getName();
                    InventoryItem item1 =  new InventoryItem(category, quantity, name);
                    Main.inventoryItems.set(listNumber2 -1, item1);
                    break;
                default:
                    System.out.println("Invalid choice please try again!1");



            }

        }

    }

}

