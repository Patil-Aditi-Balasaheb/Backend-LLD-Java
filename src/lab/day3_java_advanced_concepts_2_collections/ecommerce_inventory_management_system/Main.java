package lab.day3_java_advanced_concepts_2_collections.ecommerce_inventory_management_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Milestone 1: Item Class Hierarchy
        System.out.println("\n------------ Milestone 1: Item Class Hierarchy: ------------");
        List<Item> items = new ArrayList<>();
        Item clothing1 = new Clothing("C1", "T-shirt", 90.36, 30, "L");
        Item clothing2 = new Clothing("C2", "Pants", 100.76, 20, "M");
        Item clothing3 = new Clothing("C3", "Shirts", 50.48, 55, "XL");
        Item electronic1 = new Electronics("E1", "Phone", 445, 10, 2);
        Item electronic2 = new Electronics("E2", "Laptop", 5955, 8, 3);
        Item electronic3 = new Electronics("E3", "Tablet", 1022, 3, 1);

        items.add(clothing1);
        items.add(clothing2);
        items.add(clothing3);
        items.add(electronic1);
        items.add(electronic2);
        items.add(electronic3);

        System.out.println("Before Sorting: ");
        for (Item i : items) {
            System.out.println("ID: " + i.getId() + ", Name: " + i.getName());
        }

        System.out.println("\nAfter Sorting: ");
        Collections.sort(items);
        for (Item i : items) {
            System.out.println("ID: " + i.getId() + ", Name: " + i.getName());
        }


        // Milestone 2: Generic Inventory Management
        System.out.println("\n\n------------ Milestone 2: Generic Inventory Management: ------------");
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
        System.out.println("\nRecently Viewed: ");
        for (Item i : inventory.recentViewedItems) {
            System.out.println("ID: " + i.getId() + ", Name: " + i.getName());
        }

        // remove an item from inventory by id
        inventory.removeItem(i2.getId());

        // add item with duplicate id to the inventory
        Item i4 = new Item("1", "Apple Watch", 90.36, 30);
        inventory.addItem(i4);

        // get the item name of the duplicate item from inventory
        System.out.println("\nID: " + i4.getId() + ", Name: " + inventory.getItem(i4.getId()).getName());
        System.out.println("ID: " + i1.getId() + ", Name: " + inventory.getItem(i1.getId()).getName());


        // Milestone 3: Recently Viewed Items
        System.out.println("\n\n------------ Milestone 3: Recently Viewed Items: ------------");
        // print recently viewed list
        System.out.println("Recently Viewed: ");
        for (Item i : inventory.recentViewedItems) {
            System.out.println("ID: " + i.getId() + ", Name: " + i.getName());
        }


        // Milestone 4: Order Processing with Priority Queue
        System.out.println("\n\n------------ Milestone 4: Order Processing with Priority Queue: ------------");
        Order o1 = new Order("1", false);
        Order o2 = new Order("2", false);
        Order o3 = new Order("3", true);
        Order o4 = new Order("4", true);
        Order o5 = new Order("5", false);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(o1);
        orderProcessor.addOrder(o2);
        orderProcessor.addOrder(o3);
        orderProcessor.addOrder(o4);
        orderProcessor.addOrder(o5);
        System.out.println("Processing Order: " + orderProcessor.processOrder());
        System.out.println("Processing Order: " + orderProcessor.processOrder());
        System.out.println("Processing Order: " + orderProcessor.processOrder());
        System.out.println("Processing Order: " + orderProcessor.processOrder());
        System.out.println("Processing Order: " + orderProcessor.processOrder());
        System.out.println("Processing Order: " + orderProcessor.processOrder());
    }
}
