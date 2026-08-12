package Java_Practice.Wednesday;

class p_class
{
    void deposit()
    {
        System.out.println("Deposit method of parent class");
    }
    void deposit(float amt,String des)
    {
        System.out.println("Deposited "+amt+" for "+des);
    }
    void deposit(float amt1,String des1,int id)
    {
        System.out.println("Deposited "+amt1+" for "+des1+" with id "+id);
    }
}

class savings extends p_class
{
    void interest(float p,int t)
    {
       System.out.println("Interest1 = "+(p*6*t)/100); 
    }
}
class current extends p_class
{
    void interest(float p,int t)
    {
       System.out.println("Interest2 = "+(p*2*t)/100); 
    }
}

public class method_over {
    public static void main(String[] args) {
        savings c1 = new savings();
        c1.deposit();
        c1.deposit(10000,"Salary");
        c1.deposit(2000,"Bonus",101);
        c1.interest(10000,2);
        current c2 = new current();
        c2.interest(10000,2);
    }
}