package FrontOffice;

import BackOffice.Product;

import java.util.ArrayList;

/**
 * This abstract class is used to provide a blueprint for different checkout classes.
 * If a product has as discount by quantity, the total will be calculated differently, and vice versa
 * if the product is discounted by the day of the week.
 */

public abstract class Checkout extends Cart {
    private int total;
    private int discount;

    //This method calculates a generic total. The total calculated will be specified during implementation.
    protected abstract double calculateTotal(ArrayList<Product> productList);

    public int getTotal() {
        return total;
    }

    public int getDiscount() {
        return discount;
    }

}
