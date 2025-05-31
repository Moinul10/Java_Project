
package OnlineShopping;
public class Seller extends User {
    public Seller(String name, String userId) {
        super(name, userId);
    }

    public void listProduct(Product product) {
        System.out.println(name + " listed a new product: " + product.getProductName());
    }
}
