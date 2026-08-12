package Java_Practice.Tuesday;

abstract class vehicle
{
    abstract void engine();
    void light()
    {
        System.out.println("Lights on");
    }
}
class car extends vehicle
{
    @Override
    void engine()
    {
        System.out.println("Engine starts");
    }
}
class bike extends vehicle
{
    @Override
    void engine()
    {
        System.out.println("Engine starts");
    }
}

public class abstraction_p {
    public static void main(String[] args)
    {
        car c = new car();
        c.engine();
        c.light();
        bike b = new bike();
        b.engine();
        b.light();
    }
}
