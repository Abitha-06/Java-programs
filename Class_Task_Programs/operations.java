package Class_Task_Programs;

class op{
    String BankName = "MARIAMMAN INDIAN BANK";
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    op(int accountNumber,String accountHolderName,String mobileNumber,String accountType,double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    int getAccountNumber()
    {
        return accountNumber;
    }

    String getAccountHolderName()
    {
        return accountHolderName;
    }

    String getMobileNumber()
    {
        return mobileNumber;
    }
    void setMobileNumber(String mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }

    String getAccountType()
    {
        return accountType;
    }

    double getBalance()
    {
        return balance;
    }

    void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Amount deposited successfully.");
        }
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("Amount withdrawn successfully.");
        }
        else
        {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    void DisplayCustomerDetails()
    {
        System.out.println("\n\nAccount Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);
    }
}

public class operations{
    public static void main(String[] args)
    {
        op b1 = new op(1001,"Abitha","9876543210","Savings",25090);
        op b2 = new op(1002,"Deepi","9854543910","Current",55000);

        System.out.println("Account 1:\n");
        b1.DisplayCustomerDetails();

        b1.deposit(2550);
        System.out.println("Updated Balance after deposit: " + b1.getBalance());

        b1.withdraw(1500);
        System.out.println("Updated Balance after withdrawal : " + b1.getBalance());

        b1.setMobileNumber("9300336652");
        System.out.println("Updated Mobile Number : " + b1.getMobileNumber());

        b1.deposit(-2550);
        System.out.println("Updated Balance after deposit: " + b1.getBalance());

        b1.withdraw(-1500);
        System.out.println("Updated Balance after withdrawal : " + b1.getBalance());
    
        System.out.println("Account 2:\n");
        b2.DisplayCustomerDetails();

        b2.deposit(2550);
        System.out.println("Updated Balance after deposit: " + b2.getBalance());

        b2.withdraw(1500);
        System.out.println("Updated Balance after withdrawal : " + b2.getBalance());

    }
} 