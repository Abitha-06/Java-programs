
package Java_Practice.Wednesday;

class bank
{
    int balance = 1000;
    void withdraw(int amount) throws Exception
    {
        if(amount > balance)
        {
            throw new Exception("Insufficient balance");
        }
        else
        {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }
}
public class throw_p{
    public static void main(String[] args) {
        bank b = new bank();
        try
        {
            b.withdraw(1200);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}