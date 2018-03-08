import org.junit.Test;

import java.lang.*;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;


public class Operations
{
    public static void total(int a, int b)
    {
        int sum = a + b;
        System.out.println ("Total is : " + sum);
    }
    @Test
    public void minus()
    {
        String str ="Hello World";
        Assert.assertEquals("Hello World", str);
        int c = 20;
        int d = 5;
        int diff = c - d;
        System.out.println ("Difference is : " + diff);
        Assert.assertEquals(15, diff);
    }
    public static void multiply (int e, int f)
    {
        int mul = e * f;
        System.out.println("Multiplication is : " + mul);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        total(2,2);
        //minus();
        multiply(2,5);
    }
}

