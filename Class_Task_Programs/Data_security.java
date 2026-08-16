package Class_Task_Programs;

class DataSecurity
{
    private int accountNumber = 1001;
    private String accountHolderName = "Abitha";
    private String mobileNumber = "8765400235";
    private String accountType = "Current";
    private double balance = 2500;
    void DisplayCustomerDetails()
    {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);
    }
}
public class Data_security {
    public static void main(String[] args)
    {
        DataSecurity d = new DataSecurity();
        d.DisplayCustomerDetails();
    }
}
