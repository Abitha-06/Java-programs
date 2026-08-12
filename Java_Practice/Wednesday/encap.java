package Java_Practice.Wednesday;

abstract class Employee
{
    private String name;
    private double salary;
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name = name;
    }
    double getSalary()
    {
        return salary;
    }
    void setSalary(double salary)
    {
        this.salary = salary;
    }
    abstract double bonus();
    abstract void display();
}

class developer extends Employee
{
    String role;
    developer(String role) 
    { 
        this.role = role;
    }
    @Override
    double bonus()
    {
        if( role.equals("Full Stack")) 
            {
                return getSalary() * 0.10;
            }
            else 
            {
                return getSalary() * 0.07;
            }
    
    }

    @Override
    void display() {
        System.out.println("\n"+role+" Developer");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Salary + Bonus : "+(bonus() + getSalary()));
    } 
}
class manager extends Employee{
 @Override
 double bonus() {
   return getSalary() * 0.20;
 }
 @Override
    void display() {
        System.out.println("\nManager");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Salary + Bonus : "+(bonus()+getSalary()));
    }
}
	
class officeWorker extends Employee{
 @Override
 double bonus() {
  return getSalary() * 0.05;
 }
 @Override
    void display(){
        System.out.println("\nOffice Worker");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Salary + Bonus : "+(bonus()+getSalary()));
    }
}
public class encap {
     public static void main(String[] args) {
  developer d = new developer("Full Stack");
  d.setName("Mano"); d.setSalary(20000);
  d.display();
  
  developer d1 = new developer("Mean Stack"); 
  d1.setName("Rahi"); d.setSalary(15000);
  d1.display();
  
  manager m = new manager(); 
  m.setName("Raya"); m.setSalary(30000);
  m.display();
  
  officeWorker o = new officeWorker(); 
  o.setName("Kasi"); o.setSalary(10000);
  o.display();
  
 }
}
