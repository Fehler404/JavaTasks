A.

public class Basic {

    public static void main(String[] args) {
            int sum = 74+36;
            System.out.println(sum);
    }
    
}

B. 

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

C. 

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

