package Java_Task.Monday;
import java.util.*;

class Student {

    int id;
    String name;
    int mark1, mark2, mark3, mark4, mark5;
    int total;
    double average;
    char grade;

    void acceptDetails(Scanner sc) {

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter marks in 5 subjects: ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
        mark4 = sc.nextInt();
        mark5 = sc.nextInt();
    }

    void calculateTotalAverage() {

        total = mark1 + mark2 + mark3 + mark4 + mark5;
        average = total / 5.0;
    }

    void calculateGrade() {

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    void displayResult() {
        System.out.println("Student ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Subject 1  : " + mark1);
        System.out.println("Subject 2  : " + mark2);
        System.out.println("Subject 3  : " + mark3);
        System.out.println("Subject 4  : " + mark4);
        System.out.println("Subject 5  : " + mark5);
        System.out.println("Total      : " + total);
        System.out.println("Average    : " + average);
        System.out.println("Grade      : " + grade + "\n");
    }
}

public class student_p {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.acceptDetails(sc);
        s1.calculateTotalAverage();
        s1.calculateGrade();

        s2.acceptDetails(sc);
        s2.calculateTotalAverage();
        s2.calculateGrade();

        s3.acceptDetails(sc);
        s3.calculateTotalAverage();
        s3.calculateGrade();

        s4.acceptDetails(sc);
        s4.calculateTotalAverage();
        s4.calculateGrade();

        s5.acceptDetails(sc);
        s5.calculateTotalAverage();
        s5.calculateGrade();

        s1.displayResult();
        s2.displayResult();
        s3.displayResult();
        s4.displayResult();
        s5.displayResult();

        Student highest = s1;
        Student lowest = s1;

        if (s2.total > highest.total)
            highest = s2;
        if (s3.total > highest.total)
            highest = s3;
        if (s4.total > highest.total)
            highest = s4;
        if (s5.total > highest.total)
            highest = s5;

        if (s2.total < lowest.total)
            lowest = s2;
        if (s3.total < lowest.total)
            lowest = s3;
        if (s4.total < lowest.total)
            lowest = s4;
        if (s5.total < lowest.total)
            lowest = s5;

        double classAverage =
                (s1.average + s2.average + s3.average
                + s4.average + s5.average) / 5.0;

        System.out.println("\nHighest Total:");
        System.out.println(highest.name + " - " + highest.total);

        System.out.println("\nLowest Total:");
        System.out.println(lowest.name + " - " + lowest.total);

        System.out.println("\nClass Average: " + classAverage);
    }
}