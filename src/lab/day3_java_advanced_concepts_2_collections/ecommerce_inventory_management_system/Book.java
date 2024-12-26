package lab.day3_java_advanced_concepts_2_collections.ecommerce_inventory_management_system;

public class Book extends Item {
    private String author;

    public Book(String id, String name, double price, int quantity, String author) {
        super(id, name, price, quantity);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
