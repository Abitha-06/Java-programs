package Java_Task.Wednesday;

abstract class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount() {
        accountNumber = 0;
        holderName = "Unknown";
        balance = 0;
    }

    BankAccount(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0;
    }

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public abstract void withdraw(double amount);

    public void displayDetails() {
        System.out.println("-----------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount() {
        super();
    }

    SavingsAccount(int accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (getBalance() - amount >= 1000) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " withdrawn from Savings Account.");
        } else {
            System.out.println("Withdrawal rejected.");
            System.out.println("Minimum balance of ₹1000 must be maintained.");
        }
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount() {
        super();
    }

    CurrentAccount(int accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (getBalance() - amount >= -5000) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " withdrawn from Current Account.");
        } else {
            System.out.println("Withdrawal rejected.");
            System.out.println("Overdraft limit of ₹5000 exceeded.");
        }
    }
}

public class Banking {

    public static void main(String[] args) {

        SavingsAccount savings1 =
                new SavingsAccount(101, "Abitha", 10000);

        SavingsAccount savings2 =
                new SavingsAccount(102, "Priya");

        CurrentAccount current1 =
                new CurrentAccount(201, "Rahul", 3000);

        System.out.println("===== INITIAL DETAILS =====");

        savings1.displayDetails();
        savings2.displayDetails();
        current1.displayDetails();

        System.out.println("\n===== SAVINGS ACCOUNT =====");

        savings1.deposit(2000);
        savings1.withdraw(5000);
        savings1.withdraw(6000);
        savings1.displayDetails();

        System.out.println("\n===== CURRENT ACCOUNT =====");

        current1.deposit(1000);
        current1.withdraw(7000);
        current1.withdraw(3000);
        current1.displayDetails();

        System.out.println("\n===== POLYMORPHISM =====");

        BankAccount account;

        account = savings1;
        System.out.println("\nBankAccount reference -> SavingsAccount");
        account.withdraw(1000);
        account.displayDetails();

        account = current1;
        System.out.println("\nBankAccount reference -> CurrentAccount");
        account.withdraw(2000);
        account.displayDetails();
    }
}
