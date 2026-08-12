package Java_Practice.Wednesday;

import java.util.Scanner;
public class exception_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = null;
        try
        {
            System.out.println("Result: " + (a / b));
        }catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        try
        {
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: String is null.");
        }
        }
    }
