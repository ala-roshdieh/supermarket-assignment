package FrontOffice;

import BackOffice.Product;

import java.util.ArrayList;

public class CalcTotal extends Checkout {

    protected double calculateTotal(ArrayList<Product> productList) {
        double sum = 0;
        double productTotal;
        for (Product product: productList) {
            if(!product.isOnSale()) {
                productTotal = product.getQuantity() * product.getPrice();
                sum += productTotal;
            }
        }
        return sum;
    }
}
