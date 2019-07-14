// Write a Java program to swap two variables.

import java.util.Locale;
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter a:");
        double a = scan.nextDouble();

        System.out.println("Enter b:");
        double b = scan.nextDouble();

        swap(a, b);

    }

    public static void swap(double a, double b) {

        System.out.println("Before swapping: " + a + " " + b + ".");

        double temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: " + a + " " + b + ".");
    }
}
