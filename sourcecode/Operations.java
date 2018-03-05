import java.lang.Math;

public class Operations
{
    public static void total(int a, int b)
    {
        int sum = a + b;
        System.out.println ("Total is : " + sum);
    }

    public static void minus(int c, int d)
    {
        int diff = c - d;
        System.out.println ("Difference is : " + diff);
    }
    public static void multiply (int e, int f)
    {
        int mul = e*f;
        System.out.println("Multiplication is : " + mul);
    }
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        total(2,2);
        minus(20,5);
        multiply(2,5);
    }
}