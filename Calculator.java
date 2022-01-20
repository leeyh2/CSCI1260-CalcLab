public class Calculator
{
    private double result = 0;

    public double getResult()
    {
        return result;
    }
    public void add(double number1 , double number2)
    {
        result = number1 + number2;
    }
    public void subtract(double number1, double number2)
    {
        result = number1 - number2;
    }
    public void multiply(double number1, double number2)
    {
        result = number1 * number2;
    }
    public void square(double number1)
    {
        result = number1 * number1;
    }
    public void clear()
    {
        result = 0;
    }
}
