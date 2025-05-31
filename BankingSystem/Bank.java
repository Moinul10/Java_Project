
package BankingSystem;
public class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void welcomeMessage() {
        System.out.println("Welcome to " + bankName + " Bank!");
    }
}
