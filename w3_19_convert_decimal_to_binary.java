// A.
import java.util.*;

public class Convert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter a:");
        int a = scanner.nextInt();

        System.out.println(Integer.toString(a,2));

    }
}

// B.

import java.util.Scanner;
public class Convert {

    public static void main(String args[])
    {
        int a, whole, i = 1, j;
        int b[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextInt();

        whole = a;

        while(whole >= 1)
        {
            b[i++] = whole % 2;
            whole = whole / 2;
        }

        System.out.print("Output: ");
        for(j = i - 1; j > 0; j--)
        {
            System.out.print(b[j]);
        }
        System.out.print("\n");
    }
}


