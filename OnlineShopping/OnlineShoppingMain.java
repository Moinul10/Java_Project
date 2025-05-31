
package OnlineShopping;
public class OnlineShoppingMain {
    public static void main(String[] args) {
        // Create seller and list product
        Seller seller = new Seller("Mr. Karim", "S101");
        Product product = new Product("Wireless Mouse", 1200.0, 3);
        seller.listProduct(product);
        product.displayProductInfo();

        // Create customer and place order
        Customer customer = new Customer("Nusrat", "C202");
        customer.placeOrder(product);

        // Confirm order
        Order order = new Order(customer, product);
        order.confirmOrder();

        // Display product info after order
        product.displayProductInfo();
    }
}

