package BackOffice;

class ProductInventory{

    private String name;
    private double price;
    private static  ProductInventory instance = null;

    private ProductInventory(){
        //Defeat instantiation
    }

}
