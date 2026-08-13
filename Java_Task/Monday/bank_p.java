package Java_Task.Monday;

class BankAccount {

    int accountNumber;
    String customerName;
    String accountType;
    double balance;

    void createAccount(int number, String name, String type) {
        accountNumber = number;
        customerName = name;
        accountType = type;
        balance = 0;
    }

    void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited into Account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance in Account " + accountNumber);
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Account " + accountNumber);
        }
    }

    void transfer(BankAccount receiver, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid transfer amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance in Account " + accountNumber);
        } else {
            this.balance -= amount;
            receiver.balance += amount;

            System.out.println(
                "₹" + amount + " transferred from Account "
                + accountNumber + " to Account "
                + receiver.accountNumber
            );
        }
    }

    void display() {

        System.out.println("----------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }
}

public class bank_p {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.createAccount(101, "Abitha", "Savings");
        account2.createAccount(102, "Priya", "Savings");
        account3.createAccount(103, "Rahul", "Current");

        account1.deposit(10000);
        account2.deposit(5000);

        account1.transfer(account2, 3000);

        account2.withdraw(2000);

        System.out.println("\nFinal Account Details");

        account1.display();
        account2.display();
        account3.display();
    }
}