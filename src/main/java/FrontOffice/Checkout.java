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

    /**
     * @param productList an arraylist of products to iterate
     */
    protected abstract void calculateTotal(ArrayList<Product> productList);

    public int getTotal() {
        System.out.println("Your total is " + total);
        return total;
    }

    public int getDiscount() {
        return discount;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

}
