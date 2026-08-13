package Java_Task.Monday;
class Employee {

    int employeeId;
    String employeeName;

    double basicSalary;
    double hra;
    double da;
    double bonus;
    double tax;
    double grossSalary;
    double netSalary;

    void setDetails(int id, String name, double basic) {
        employeeId = id;
        employeeName = name;
        basicSalary = basic;
    }

    void calculateHRA() {
        hra = basicSalary * 20 / 100;
    }

    void calculateDA() {
        da = basicSalary * 10 / 100;
    }

    void calculateBonus() {
        bonus = basicSalary * 5 / 100;
    }

    void calculateGrossSalary() {
        grossSalary = basicSalary + hra + da + bonus;
    }

    void calculateTax() {
        tax = grossSalary * 8 / 100;
    }

    void calculateNetSalary() {
        netSalary = grossSalary - tax;
    }

    void calculateSalary() {
        calculateHRA();
        calculateDA();
        calculateBonus();
        calculateGrossSalary();
        calculateTax();
        calculateNetSalary();
    }

    void display() {

        System.out.println("\n-----------------------------");
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Bonus         : " + bonus);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Tax           : " + tax);
        System.out.println("Net Salary    : " + netSalary);
    }
}

public class employee_p {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        e1.setDetails(101, "Arun", 30000);
        e2.setDetails(102, "Priya", 40000);
        e3.setDetails(103, "Rahul", 35000);
        e4.setDetails(104, "Divya", 50000);
        e5.setDetails(105, "Kiran", 45000);

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
        e4.calculateSalary();
        e5.calculateSalary();

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();

        Employee highest = e1;

        if (e2.netSalary > highest.netSalary)
            highest = e2;
        if (e3.netSalary > highest.netSalary)
            highest = e3;
        if (e4.netSalary > highest.netSalary)
            highest = e4;
        if (e5.netSalary > highest.netSalary)
            highest = e5;

        Employee lowest = e1;

        if (e2.netSalary < lowest.netSalary)
            lowest = e2;
        if (e3.netSalary < lowest.netSalary)
            lowest = e3;
        if (e4.netSalary < lowest.netSalary)
            lowest = e4;
        if (e5.netSalary < lowest.netSalary)
            lowest = e5;

        double averageSalary =
                (e1.netSalary
                + e2.netSalary
                + e3.netSalary
                + e4.netSalary
                + e5.netSalary) / 5.0;

        System.out.println("\n========== SALARY SUMMARY ==========");

        System.out.println("\nHighest Salary:");
        System.out.println(highest.employeeName + " - " + highest.netSalary);

        System.out.println("\nLowest Salary:");
        System.out.println(lowest.employeeName + " - " + lowest.netSalary);

        System.out.println("\nAverage Net Salary: " + averageSalary);
    }
}