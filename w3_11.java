// Write a Java program to print the area and perimeter of a circle.

import java.util.Locale;
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Enter the radius");
    double radius = scan.nextDouble();
    perimiter(radius);
    area(radius);

    }

    public static void perimiter(double radius){

        System.out.println("The perimeter is " + Math.round((2 * Math.PI * radius) * 100.00) / 100.00 + ".");

    }

    public static void area(double radius){

        System.out.println("The area is " + Math.round((Math.PI * Math.pow(radius,2)) * 100.00) / 100.00 + ".");

    }


}
