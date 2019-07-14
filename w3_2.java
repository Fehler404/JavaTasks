//Write a Java program to print the sum of two numbers. 

// A. The simplest solution, but the less rational one.

public class Basic {

    public static void main(String[] args) {
            int sum = 74+36;
            System.out.println(sum);
    }
    
}

// B. A more interactive solution with a scanner & a built-in sum method.

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        int x, y, sum;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter x");
        x = scan.nextInt();
        System.out.println("Enter y");
        y = scan.nextInt();
      
        System.out.println("The answer is " + Integer.sum(x, y));
    }

}

// C. An interactive solution with a scanner and a self-written sum method, which is being used by an object.
// The sum method is not static, therefore you need to create an object to use it.

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        int x, y, sum;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter x");
        x = scan.nextInt();
        System.out.println("Enter y");
        y = scan.nextInt();
        
        Basic basic = new Basic();
        System.out.println(basic.sum(x,y));
    }


    public int sum(int x, int y) {
        return x+y;
    }
}

// D. An interactive solution with a scanner and a self-written static sum method, which is being used directly,
// aka without an object, because the method is static.

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        int x, y, sum;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x");
        x = scan.nextInt();
        System.out.println("Enter y");
        y = scan.nextInt();

        sum(x,y);
    }

    private static void sum(int x, int y) {
        System.out.println(x+y);
    }
}
    
