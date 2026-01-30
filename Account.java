public class Account {
    private String accountNumber;
    private int pin;
    private double balance;

    public Account(String accNo, int pin, double bal) {
        this.accountNumber = accNo;
        this.pin = pin;
        this.balance = bal;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
