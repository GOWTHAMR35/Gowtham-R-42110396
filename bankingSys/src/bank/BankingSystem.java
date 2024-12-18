package bank;
import java.util.ArrayList;
import java.util.Scanner;
public class BankingSystem {
	private static ArrayList<BankAccount> accounts = new ArrayList<>();
    private static ArrayList<Transaction> transactions = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Banking Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transactions");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNumber = sc.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String accHolder = sc.nextLine();
                    accounts.add(new BankAccount(accNumber, accHolder));
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    BankAccount acc1 = findAccount(sc);
                    if (acc1 != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        acc1.deposit(depositAmount);
                        transactions.add(new Transaction("Deposit", depositAmount));
                    }
                    break;

                case 3:
                    BankAccount acc2 = findAccount(sc);
                    if (acc2 != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();
                        acc2.withdraw(withdrawAmount);
                        transactions.add(new Transaction("Withdrawal", withdrawAmount));
                    }
                    break;

                case 4:
                    BankAccount acc3 = findAccount(sc);
                    if (acc3 != null) {
                        acc3.checkBalance();
                    }
                    break;

                case 5:
                    System.out.println("\n--- Transaction History ---");
                    for (Transaction t : transactions) {
                        System.out.println(t);
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }

    private static BankAccount findAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();
        for (BankAccount account : accounts) {
            if (account.getAccountDetails().contains(accNumber)) {
                return account;
            }
        }
        System.out.println("Account not found!");
        return null;
    }
}
