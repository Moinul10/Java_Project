
package OnlineShopping;
public class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceStock() {
        if (quantity > 0) {
            quantity--;
        }
    }

    public void displayProductInfo() {
        System.out.println("Product: " + productName + ", Price: $" + price + ", Stock: " + quantity);
    }
}
