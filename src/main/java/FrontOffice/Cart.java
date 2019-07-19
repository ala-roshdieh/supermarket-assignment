package FrontOffice;

import BackOffice.Product;

import java.util.ArrayList;

/**
 * This is the shopping car that will hold the products
 * it has the basic functionality of adding and removing products.
 * The list can be retrieved to be iterated upon.
 */

public class Cart {


    private ArrayList<Product> list =  new ArrayList<Product>();


    public ArrayList<Product> getList() {
        return list;
    }

    public void addProduct(Product product) {
        list.add(product);
        System.out.println(product.getName() + " has been added to the cart");
    }

    public void removeProduct(Product productToRemove) {
        for(Product product:
             list) {
            if(productToRemove.equals(product)) {
                list.remove(product);
                System.out.println(product.getName() + " has been removed from the cart");
            } else {
                System.out.println("The product you want to remove isn't found!");
            }
        }

    }

}
