package BackOffice;


/**
 * This class lists basic characteristics of the product.
 * The price is in euros.
 */

public class Product {

    private final int id;
    private String name;
    private double price;
    private int quantity;
    private boolean onSale;

    public Product(int id, String name, double price, int quantity, boolean onSale) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.onSale = onSale;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }
    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

}
