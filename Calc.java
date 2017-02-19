/**
 * Created by PC5 Progen 19341 on 2/19/2017.
 */
public class Calc {
    public void add (int a, int b)
    {
        int total = a + b;

        System.out.println("Sum of " + a + " and " + b + " = "  + total);
    }
    public void diff (int a, int b)
    {
        int total = a - b;

        System.out.println("Diff of " + a + " and " + b + " = "  + total);
    }
    public void multiply (int a, int b)
    {
        int total = a * b;

        System.out.println("Product of " + a + " and " + b + " = "  + total);
    }
    public void divide (int a, int b)
    {
        int total = a / b;

        System.out.println("Quotient of " + a + " and " + b + " = "  + total);
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.add(1,2);
        calc.add(12477,77933);
        calc.diff(12321321,1323232131);
        calc.multiply(3,2);
        calc.divide(3,3);

    }
}
