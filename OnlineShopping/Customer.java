
package OnlineShopping;
public class Customer extends User {

    String name;
    public Customer(String name, String userId) {
        super(name, userId);
    }

    public void placeOrder(Product product) {
        if (product.getQuantity() > 0) {
            product.reduceStock();
            System.out.println(name + " placed an order for: " + product.getProductName());
        } else {
            System.out.println("Product is out of stock.");
        }
    }
}

