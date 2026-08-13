package Java_Task.Wednesday;
abstract class Employee {

    private int id;
    private String name;
    private double basicSalary;

    Employee() {
        id = 0;
        name = "Unknown";
        basicSalary = 0;
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.basicSalary = 0;
    }

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("-----------------------------");
        System.out.println("ID           : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Final Salary : " + calculateSalary());
    }
}

class Doctor extends Employee {

    private double consultationAllowance;

    Doctor() {
        super();
        consultationAllowance = 0;
    }

    Doctor(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
        consultationAllowance = 5000;
    }

    Doctor(int id, String name, double basicSalary, double consultationAllowance) {
        super(id, name, basicSalary);
        this.consultationAllowance = consultationAllowance;
    }

    public double getConsultationAllowance() {
        return consultationAllowance;
    }

    public void setConsultationAllowance(double consultationAllowance) {
        this.consultationAllowance = consultationAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + consultationAllowance;
    }

    @Override
    public void displayDetails() {
        System.out.println("-----------------------------");
        System.out.println("Employee Type        : Doctor");
        System.out.println("ID                   : " + getId());
        System.out.println("Name                 : " + getName());
        System.out.println("Basic Salary         : " + getBasicSalary());
        System.out.println("Consultation Allow.  : " + consultationAllowance);
        System.out.println("Final Salary         : " + calculateSalary());
    }
}

class Nurse extends Employee {

    private double nightShiftAllowance;

    Nurse() {
        super();
        nightShiftAllowance = 0;
    }

    Nurse(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
        nightShiftAllowance = 3000;
    }

    Nurse(int id, String name, double basicSalary, double nightShiftAllowance) {
        super(id, name, basicSalary);
        this.nightShiftAllowance = nightShiftAllowance;
    }

    public double getNightShiftAllowance() {
        return nightShiftAllowance;
    }

    public void setNightShiftAllowance(double nightShiftAllowance) {
        this.nightShiftAllowance = nightShiftAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + nightShiftAllowance;
    }

    @Override
    public void displayDetails() {
        System.out.println("-----------------------------");
        System.out.println("Employee Type        : Nurse");
        System.out.println("ID                   : " + getId());
        System.out.println("Name                 : " + getName());
        System.out.println("Basic Salary         : " + getBasicSalary());
        System.out.println("Night Shift Allow.   : " + nightShiftAllowance);
        System.out.println("Final Salary         : " + calculateSalary());
    }
}

class LabTechnician extends Employee {

    private double labAllowance;

    LabTechnician() {
        super();
        labAllowance = 0;
    }

    LabTechnician(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
        labAllowance = 2000;
    }

    LabTechnician(int id, String name, double basicSalary, double labAllowance) {
        super(id, name, basicSalary);
        this.labAllowance = labAllowance;
    }

    public double getLabAllowance() {
        return labAllowance;
    }

    public void setLabAllowance(double labAllowance) {
        this.labAllowance = labAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + labAllowance;
    }

    @Override
    public void displayDetails() {
        System.out.println("-----------------------------");
        System.out.println("Employee Type        : Lab Technician");
        System.out.println("ID                   : " + getId());
        System.out.println("Name                 : " + getName());
        System.out.println("Basic Salary         : " + getBasicSalary());
        System.out.println("Lab Allowance        : " + labAllowance);
        System.out.println("Final Salary         : " + calculateSalary());
    }
}

public class hospital {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Doctor(101, "Arun", 60000, 10000);
        employees[1] = new Nurse(102, "Priya", 30000, 5000);
        employees[2] = new LabTechnician(103, "Rahul", 25000, 3000);
        employees[3] = new Doctor(104, "Divya", 70000, 12000);
        employees[4] = new Nurse(105, "Kiran", 35000, 6000);

        System.out.println("===== HOSPITAL EMPLOYEE DETAILS =====");

        for (Employee employee : employees) {
            employee.displayDetails();
        }

        Employee highestPaid = employees[0];

        for (int i = 1; i < employees.length; i++) {

            if (employees[i].calculateSalary() >
                highestPaid.calculateSalary()) {

                highestPaid = employees[i];
            }
        }

        System.out.println("\n===== HIGHEST PAID EMPLOYEE =====");

        highestPaid.displayDetails();
    }
}