package bank;
public class BankAccount {
	String accountNo;
    String accountName;
    double balance;
    public BankAccount(String accountNo, String accountName) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = 0.0;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". Current balance: " + balance);
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }

    public String getAccountDetails() {
        return "Account Number: " + accountNo + "\nAccount Holder: " + accountName + "\nBalance: " + balance;
    }
}
