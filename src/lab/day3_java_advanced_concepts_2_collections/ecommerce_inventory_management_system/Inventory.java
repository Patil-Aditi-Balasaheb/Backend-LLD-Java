package lab.day3_java_advanced_concepts_2_collections.ecommerce_inventory_management_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Inventory<T extends Item> {
    private HashMap<String, T> ids;
    public LinkedList<Item> recentViewedItems;

    public Inventory() {
        ids = new HashMap<>();
        recentViewedItems = new LinkedList<>();
    }

    public void addItem(T item) {
        ids.put(item.getId(), item);
    }

    public void removeItem(String id) {
        ids.remove(id);
    }

    public T getItem(String id) {
        addRecentViewedItem(ids.get(id));
        return ids.get(id);
    }

    public List<T> getAllItems() {
        return new ArrayList<>(ids.values());
    }

    public void addRecentViewedItem(Item item) {
        if (recentViewedItems.size() >= 3) {
            recentViewedItems.removeFirst();
        }
        recentViewedItems.add(item);
    }
}
