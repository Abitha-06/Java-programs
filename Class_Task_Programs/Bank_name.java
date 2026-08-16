package Class_Task_Programs;
class BankName{
    static String bank_name = "Mariamman Indian Bank";
    long account_number;
    String user_name;
    void display_details()
    {
        System.out.println("Bank Name: " + bank_name);
    }
}
public class Bank_name {
    public static void main(String[] args){
    BankName b1 = new BankName();
    BankName b2 = new BankName();
    BankName b3 = new BankName();
    System.out.println("Bank Details of Customer 1:");
    b1.display_details();
    System.out.println("\nBankDetails of Customer 2:");
    b2.display_details();
    System.out.println("\nBank Details of Customer 3:");
    b3.display_details();
    }
}
