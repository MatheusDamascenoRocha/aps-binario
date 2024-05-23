import java.util.Scanner;
public class dec {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int decimalNumber;
        System.out.printf("digite um numero decimal: ");
        decimalNumber = ler.nextInt();

        String octalNumber = convertDecimalToOctal(decimalNumber);
        System.out.println("O nmero decimal " + decimalNumber + " em octal é " + octalNumber);
    }

    public static String convertDecimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }
}
