package lab.day3_java_advanced_concepts_2_collections.ecommerce_inventory_management_system;

public class Order implements Comparable<Order> {
    private String orderId;
    private boolean isExpress;

    Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public int compareTo(Order o) {
        if (this.isExpress == o.isExpress) {
            return this.orderId.compareTo(o.orderId);
        } else if (this.isExpress) {
            return -1;
        } else {
            return 1;
        }
    }
}
