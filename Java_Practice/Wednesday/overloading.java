package Java_Practice.Wednesday;
import java.util.Scanner;
class shapes
{
    void area()
    {
        System.out.println("Area of the shapes");
    }
    void area(int a)
    {
         System.out.println("Area of Square = "+a*a);
    }
    void area(int l, int b)
    {
         System.out.println("Area of Rectangle = "+l*b);
    }
    void area(float p,int h1,int h2)
    {
         System.out.println("Area of Triangle = "+(p*h1*h2));
    }
    void area(double pi,int r)
    {
         System.out.println("Area of Circle = "+pi*r*r);
    }
}
public class overloading
{
    static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        shapes s = new shapes();
        s.area();
        int a = scan.nextInt();
        s.area(a);
        int l = scan.nextInt();
        int b = scan.nextInt();
        s.area(l,b);
        float p = scan.nextFloat();
        int h1 = scan.nextInt();
        int h2 = scan.nextInt();
        s.area(p,h1,h2);
        double pi = scan.nextDouble();
        int r = scan.nextInt();
        s.area(pi,r);
    }
}