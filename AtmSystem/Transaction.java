
package AtmSystem;

public class Transaction {
    private String transactionId;
    private String type;
    private double amount;

    public Transaction(String id, String type, double amount) {
        this.transactionId = id;
        this.type = type;
        this.amount = amount;
    }

    public void displayTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Type: " + type);
        System.out.println("Amount: $" + amount);
    }
}
