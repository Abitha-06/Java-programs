package Class_Task_Programs;
class Getter_class{
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    Getter_class(int accountNumber,String accountHolderName,String mobileNumber,String accountType,double balance)
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

    String getAccountType()
    {
        return accountType;
    }

    double getBalance()
    {
        return balance;
    }

}
public class getter {
    public static void main(String[] args)
    {
        Getter_class g = new Getter_class(1003,"Abitha","9876543210","Savings",25090.500);
        System.out.println("Account Number : " + g.getAccountNumber());
        System.out.println("Account Holder Name : " + g.getAccountHolderName());
        System.out.println("Mobile Number : " + g.getMobileNumber());
        System.out.println("Account Type : " + g.getAccountType());
        System.out.println("Balance : " + g.getBalance());
    }
}
