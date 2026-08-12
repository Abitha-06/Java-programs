package Java_Task.Monday;
import java.util.*;

interface Insurable {

    double getInsuranceCost(int days);
}

abstract class Vehicle {
    String vehicleNumber;
    String brand;
    double baseRate;
    Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }
    abstract double calculateRentalCost(int days);
    void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Brand          : " + brand);
        System.out.println("Base Rate      : ₹" + baseRate);
    }
}
class Car extends Vehicle implements Insurable {
    Car(String vehicleNumber, String brand, double baseRate) {

        super(vehicleNumber, brand, baseRate);
    }
    @Override
    double calculateRentalCost(int days) {

        return baseRate * days;
    }
    @Override
    public double getInsuranceCost(int days) {

        return 200 * days;
    }
}
class Bike extends Vehicle {
    Bike(String vehicleNumber, String brand, double baseRate) {

        super(vehicleNumber, brand, baseRate);
    }
    @Override
    double calculateRentalCost(int days) {

        return baseRate * days;
    }
}
class Truck extends Vehicle implements Insurable {
    Truck(String vehicleNumber, String brand, double baseRate) {

        super(vehicleNumber, brand, baseRate);
    }
    @Override
    double calculateRentalCost(int days) {
        return (baseRate + 500) * days;
    }
    @Override
    public double getInsuranceCost(int days) {

        return 300 * days;
    }
}
class RentalAgency {
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    void generateBill(String vehicleNumber, int days) {
        Vehicle selectedVehicle = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.vehicleNumber.equals(vehicleNumber)) {
                selectedVehicle = vehicle;
                break;
            }
        }
        if (selectedVehicle == null) {
            System.out.println(
                "Vehicle " + vehicleNumber + " not found."
            );
            return;
        }
        double rentalCost =
                selectedVehicle.calculateRentalCost(days);
        double insuranceCost = 0;

        if (selectedVehicle instanceof Insurable) {
            Insurable insurableVehicle =
                    (Insurable) selectedVehicle;

            insuranceCost =
                    insurableVehicle.getInsuranceCost(days);
        }
        double total =
                rentalCost + insuranceCost;
        System.out.println("VEHICLE RENTAL BILL");

        selectedVehicle.displayDetails();

        System.out.println("Rental Days    : " + days);
        System.out.println("Rental Cost    : ₹" + rentalCost);
        System.out.println("Insurance Cost : ₹" + insuranceCost);
        System.out.println("Total Bill     : ₹" + total);
    }
}
public class vehicle {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        Car car = new Car(
            "CAR101",
            "Toyota",
            2000
        );

        Bike bike = new Bike(
            "BIKE101",
            "Honda",
            800
        );

        Truck truck = new Truck(
            "TRUCK101",
            "Tata",
            3000
        );
        agency.addVehicle(car);
        agency.addVehicle(bike);
        agency.addVehicle(truck);
        System.out.println("\n***** CAR RENTAL *****");
        agency.generateBill(
            "CAR101",
            3
        );
        System.out.println("\n***** BIKE RENTAL *****");

        agency.generateBill(
            "BIKE101",
            3
        );
        System.out.println("\n***** TRUCK RENTAL *****");

        agency.generateBill(
            "TRUCK101",
            3
        );
    }
}
