package domain;

public class Account {
    private String accountNumber;
    private String customerName;
    private Double balance;
    private String accountType;

    public Account(String accountNumber, String customerName, Double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.accountType = accountType;
    }

}
