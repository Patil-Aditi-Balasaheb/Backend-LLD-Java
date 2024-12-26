package lab.day3_java_advanced_concepts_2_collections.ecommerce_inventory_management_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
    private HashMap<String, T> ids;

    public Inventory() {
        ids = new HashMap<>();
    }

    public void addItem(T item) {
        ids.put(item.getId(), item);
    }

    public void removeItem(String id) {
        ids.remove(id);
    }

    public T getItem(String id) {
        return ids.get(id);
    }

    public List<T> getAllItems() {
        return new ArrayList<>(ids.values());
    }
}
