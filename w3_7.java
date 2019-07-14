//Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = scan.nextInt();

        for (int i = 0; i < 10; i++) {

            System.out.println(number + " * " + i + " = " + number * i);

        }

    }

}
