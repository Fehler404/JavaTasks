// Write a Java program that takes three (or more) numbers as input to calculate and print the average of the numbers.
import java.util.Locale;
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter a:");
        double a = scan.nextDouble();

        System.out.println("Enter b:");
        double b = scan.nextDouble();

        System.out.println("Enter c:");
        double c = scan.nextDouble();

        mean(a, b, c);

    }

    public static void mean(double... a) {

        double sum = 0;

        for (int i = 0; i < a.length; i++) {

            sum += a[i];

        }

        System.out.println("The mean is" + Math.round((sum / a.length) * 100.00) / 100.00 + ".");
    }
}
