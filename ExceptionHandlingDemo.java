import java.util.Scanner;
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fixedNumber = 10;
        try {
            System.out.print("Enter a number to divide " + fixedNumber + " by: ");
            int userNumber = scanner.nextInt();
            int result = fixedNumber / userNumber;
            System.out.println("Result: " + fixedNumber + " / " + userNumber + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        } finally {
            System.out.println("Operation completed. Cleaning up resources...");
            scanner.close();
        }
    }
}
