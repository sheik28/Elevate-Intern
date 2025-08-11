import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount("Alice", "123456", 0.03);
        int choice;

        do {
            System.out.println("\n=== BANK MENU ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Apply Interest");
            System.out.println("4. Check Balance");
            System.out.println("5. Show Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    account.withdraw(wd);
                    break;
                case 3:
                    account.applyInterest();
                    break;
                case 4:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                case 5:
                    account.printTransactionHistory();
                    break;
                case 6:
                    System.out.println("Thank you for using the Bank App!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
