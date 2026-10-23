public class BankAccount {
    private final String accountNumber;
    private String ownerName;
    private double balance;

     public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
            System.out.println("Error: Initial balance cannot be negative.");
        }
    }