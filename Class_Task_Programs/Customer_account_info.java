package Class_Task_Programs;

class CustomerAccountInfo
{
    int accountNumber;
    String accountHolderName;
    long mobileNumber;
    String accountType;
    double balance;
    CustomerAccountInfo(int accountNumber,String accountHolderName,long mobileNumber,String accountType,double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    void DisplayCustomerDetails()
    {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);
    }
}
    
public class Customer_account_info {
    public static void main(String[] args)
    {
        CustomerAccountInfo c1 = new CustomerAccountInfo(1001,"Arun",9876543210L,"Savings",25000);
        CustomerAccountInfo c2 = new CustomerAccountInfo(1002,"Kumar",9876512345L,"Current",50000);
        System.out.println("Customer 1:");
        c1.DisplayCustomerDetails();
        System.out.println("\nCustomer 2:");
        c2.DisplayCustomerDetails();
    }
    
}
