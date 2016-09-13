import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joshuakeough on 9/7/16.
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<InventoryItem> inventoryItems = new ArrayList<>();


    public static void main(String args[]) throws Exception {

        boolean a = true;
        while (a) {
            menu();
        }
    }


    public static InventoryItem createItem() throws Exception {
        System.out.println("Please enter the name of the item");
        String userItem = Main.scanner.nextLine();

        System.out.println("Please enter the quantity");
        int userQuantity = Integer.parseInt(Main.scanner.nextLine());

        System.out.println("Please enter the number of the category you wish to add to.\n1. Fruit\n2. Vegetable\n3. Meat\n4. Grain\n5. Sugar");
        String category = Main.scanner.nextLine();

        InventoryItem newItem;

        switch (category) {
            case "1":
//                enterQuantity();
//                enterName();
                newItem = new Fruit(userItem, userQuantity);
                return newItem;
            case "2":
//                enterQuantity();
//                enterName();
                newItem = new Vegetable(userItem, userQuantity);
                return newItem;

            case "3":
//                enterQuantity();
//                enterName();
                newItem = new Meat(userItem, userQuantity);
                return newItem;

            case "4":
//                enterQuantity();
//                enterName();
                newItem = new Grain(userItem, userQuantity);
                return newItem;
            case "5":
//                enterQuantity();
//                enterName();
                newItem = new Sugar(userItem, userQuantity);
                return newItem;

            default:
                throw new Exception("Invalid type.");
        }


    }

    public static void menu() throws Exception {
        while (true) {
            int i = 1;
            for (InventoryItem newItem : inventoryItems) {

                System.out.printf("%s.| Category %s| Quantity %s| Item %s\n", i, newItem.category, newItem.quantity, newItem.name);
                i++;

            }
            System.out.println("Please choose one of the following!\n1. Create new item.\n2. Remove an item.\n3. Update quantity. ");
            String answer = Main.scanner.nextLine();
            switch (answer) {
                case "1":
                    inventoryItems.add(createItem());
                    break;
                case "2":

                    System.out.println("Please choose the number of the item you wish to remove from the list.");
                    int listNumber = Integer.valueOf(Main.scanner.nextLine());
                    Main.inventoryItems.remove(listNumber - 1);
                    break;
                case "3":
                    InventoryItem item1 = new InventoryItem(null, 0, null);

                    System.out.println("Please indicate the number of the item you want to modify.");
                    int listNumber2 = Integer.valueOf(Main.scanner.nextLine());
                    Main.inventoryItems.get(listNumber2 - 1);
                    System.out.println("Please enter the new amount.");
                    item1.quantity = Integer.valueOf(Main.scanner.nextLine());
                    item1.name = Main.inventoryItems.get(listNumber2 - 1).getName();

                    Main.inventoryItems.set(listNumber2 - 1, item1);
                    break;
                default:
                    System.out.println("Invalid choice please try again!1");


            }

        }

    }


}
