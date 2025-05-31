package OnlineShopping;
public class Order {
    private Customer customer;
    private Product product;

    public Order(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public void confirmOrder() {
        if (product.getQuantity() > 0) {
            product.reduceStock();
            System.out.println("Order Confirmed!");
            System.out.println("Customer: " + customer.name);
            System.out.println("Product: " + product.getProductName());
        } else {
            System.out.println("Order Failed. Product out of stock.");
        }
    }
}

