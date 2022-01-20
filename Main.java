import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Driver();
    }
    public static void Driver()
    {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();
        Calculator calc4 = new Calculator();
        System.out.println("Input two numbers in the calculator!");
        System.out.print("First number: ");
        Scanner kb = new Scanner(System.in);
         double userFirstNumber = kb.nextDouble();
        System.out.print("Second number: ");
        kb.nextLine();
        double userSecondNumber = kb.nextDouble();
        calc1.add(userFirstNumber, userSecondNumber);
        calc2.multiply(userFirstNumber, userSecondNumber);
        calc3.subtract(calc2.getResult(),calc1.getResult());
        calc4.square(calc3.getResult());
        System.out.println("Your result: " + calc4.getResult());
    }
}
