package Java_Practice.Thursday;
import java.util.Scanner;

class InvalidMarkException extends RuntimeException {
    public InvalidMarkException(String msg) {
        super(msg);
    }
}

class InsufficientMarkException extends RuntimeException {
    public InsufficientMarkException(String msg) {
        super(msg);
    }
}

public class UD_exception_p2 {

    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter number of subjects: ");
            int n = s.nextInt();

            if (n <= 0) {
                System.out.println("Number of subjects must be greater than 0.");
                return;
            }

            int[] marks = new int[n];
            int sum = 0;
            
            System.out.println("Enter the marks:");
            for (int i = 0; i < n; i++) {
                marks[i] = s.nextInt();
                
                if (marks[i] > 100) {
                    throw new InvalidMarkException("Mark should not be above 100");
                } 
                else if (marks[i] < 0) {
                    throw new InsufficientMarkException("Mark should not be negative");
                } 
                else {
                    sum += marks[i];
                }
            }
          
            double average = (double) sum / n;
            System.out.println("Average mark = " + average);
        }
    }
}
