package Java_Practice.Thursday;
import java.util.Scanner;

class InvalidAgeException extends RuntimeException{

    public InvalidAgeException(String message) {
        super(message);
    }
}
public class UD_exception_p1 {
    public static void main(){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = s.nextInt();

            if(age>=18)
            {
                System.out.println("You are eligible to vote.");
            }
            else
            {
                throw new InvalidAgeException("You are not eligible to vote.");
            }
            /*try
            {
                if(age>=18)
                {
                    System.out.println("You are eligible to vote.");
                }
                else
                {
                    throw new InvalidAgeException("You are not eligible to vote.");
                }
            }
            catch(InvalidAgeException e)
            {
                System.out.println("Error: " + e.getMessage());
            }*/

    }

}
