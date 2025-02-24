import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
        sc.close();
    }
}
