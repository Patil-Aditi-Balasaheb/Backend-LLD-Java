package lab.day3_java_advanced_concepts_2_collections.ecommerce_inventory_management_system;

import java.util.PriorityQueue;

public class OrderProcessor {
    private PriorityQueue<Order> orders;

    public OrderProcessor() {
        orders = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String processOrder() {
        if (!orders.isEmpty()) {
            Order currentOrder = orders.poll();
            return currentOrder.getOrderId();
        }
        return "No orders found";
    }
}
