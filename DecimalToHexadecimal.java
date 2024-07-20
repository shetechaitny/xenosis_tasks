import java.util.Scanner;

public class DecimalToHexadecimal {
    public static String decimalToHex(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder hexString = new StringBuilder();
        char[] hexDigits = "0123456789ABCDEF".toCharArray();
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexString.insert(0, hexDigits[remainder]);
            decimal = decimal / 16;
        }
        return hexString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String hex = decimalToHex(decimal);
        System.out.println("Hexadecimal representation: " + hex);
        scanner.close();
    }
}
