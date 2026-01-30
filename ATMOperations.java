import java.util.Scanner;

public class ATMOperations {

    public void start(Account acc) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + acc.getBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    System.out.println("Amount deposited successfully");
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double wd = sc.nextDouble();
                    if (acc.withdraw(wd)) {
                        System.out.println("Please collect your cash");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 4);
    }
}
