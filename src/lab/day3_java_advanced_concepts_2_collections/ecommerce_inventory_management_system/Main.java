package lab.day3_java_advanced_concepts_2_collections.ecommerce_inventory_management_system;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("1", "IPad", 64.38, 20);
        Item i2 = new Item("2", "Macbook", 500.34, 10);
        Item i3 = new Item("3", "IPhone", 100.37, 50);

        Inventory<Item> inventory = new Inventory<Item>();

        // add items to the inventory
        inventory.addItem(i1);
        inventory.addItem(i2);
        inventory.addItem(i3);

        // get the item names from inventory by id
        System.out.println("ID: " + i1.getId() + ", Name: " + inventory.getItem(i1.getId()).getName());
        System.out.println("ID: " + i2.getId() + ", Name: " + inventory.getItem(i2.getId()).getName());
        System.out.println("ID: " + i3.getId() + ", Name: " + inventory.getItem(i3.getId()).getName());
        System.out.println("ID: " + i2.getId() + ", Name: " + inventory.getItem(i2.getId()).getName());

        // print recently viewed list
        System.out.println("\n\nRecently Viewed: ");
        for (Item i : inventory.recentViewedItems) {
            System.out.println("ID: " + i.getId() + ", Name: " + i.getName());
        }

        // remove an item from inventory by id
        inventory.removeItem(i2.getId());

        // add item with duplicate id to the inventory
        Item i4 = new Item("1", "Apple Watch", 90.36, 30);
        inventory.addItem(i4);

        // get the item name of the duplicate item from inventory
        System.out.println("\n\nID: " + i4.getId() + ", Name: " + inventory.getItem(i4.getId()).getName());
        System.out.println("ID: " + i1.getId() + ", Name: " + inventory.getItem(i1.getId()).getName());

        // print recently viewed list
        System.out.println("\n\nRecently Viewed: ");
        for (Item i : inventory.recentViewedItems) {
            System.out.println("ID: " + i.getId() + ", Name: " + i.getName());
        }
    }
}
