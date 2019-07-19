import BackOffice.Product;
import FrontOffice.CalcTotal;
import FrontOffice.Cart;



public class Main {

    public static void main(String[] args) {

        //TODO should find a better way to select products
        Product cereal = new Product(1,"Cereal", 2.50, 1, false);
        Product chineseVeg = new Product(2, "Chinese Vegetables", 5, 2, false);

        Cart cart = new Cart();

        cart.addProduct(cereal);
        cart.addProduct(chineseVeg);

        CalcTotal calculator = new CalcTotal();
        calculator.calculateTotal(cart.getList());
    }

}



