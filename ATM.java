import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dummy account
        Account acc = new Account("12345", 1234, 5000);

        System.out.println("===== WELCOME TO ATM =====");

        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (accNo.equals(acc.getAccountNumber()) && pin == acc.getPin()) {
            System.out.println("Login Successful");
            ATMOperations atm = new ATMOperations();
            atm.start(acc);
        } else {
            System.out.println("Invalid credentials");
        }
    }
}
