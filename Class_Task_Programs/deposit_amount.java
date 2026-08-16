package Class_Task_Programs;

class Setter_deposit{
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    Setter_deposit(int accountNumber,String accountHolderName,String mobileNumber,String accountType,double balance)
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

}

public class deposit_amount{
    public static void main(String[] args)
    {
        Setter_deposit g = new Setter_deposit(1003,"Abitha","9876543210","Savings",25090.500);
        System.out.println("Account Number : " + g.getAccountNumber());
        System.out.println("Account Holder Name : " + g.getAccountHolderName());
        System.out.println("Mobile Number : " + g.getMobileNumber());
        System.out.println("Account Type : " + g.getAccountType());
        System.out.println("Balance : " + g.getBalance());

        g.setMobileNumber("9300336652");
        System.out.println("Updated Mobile Number : " + g.getMobileNumber());

        g.deposit(2550);
        System.out.println("Updated Balance : " + g.getBalance());
    }
}
