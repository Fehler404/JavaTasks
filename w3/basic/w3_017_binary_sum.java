import java.util.Locale;
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter a:");
        int a = scaner.nextInt();

        System.out.println("Enter b:");
        int b = scaner.nextInt();

        areBinary(a, b);

    }

    public static void binarySum(long a, long b) {


        int i = 0;
        int rem = 0;
        int[] sum = new int[2000];

        while (a != 0 || b != 0) {
            sum[i++] = (int) ((a % 10 + b % 10 + rem) % 2);
            rem = (int) ((a % 10 + b % 10 + rem) / 2);
            a = a / 10;
            b = b / 10;

            /*
            a % 10 gives us the last digit of the binary number.
            For instance, 101 mod 10 = 1.

            b % 10 gives us the last digit of the binary number as well.
            For instance, 001 mod 10 = 1.

            The remainder is 0 for the first iteration by default, but we will add it in another ones,
            so we have to store its value in a variable.

            1 + 1 = 2, but in binary we only have 0 and 1, so we must use remainder here.
            It is just like if we were adding 10 to 1 - we have to make a step left, add 1 there and make no changes
            in the last digit of the number.

            This is the reason why we need "% 2" to determine whether we have a remainder or not.
            If we have it, it will always be 1. And if we used modulus in the first operation to find the sum,
            it is only logical to use the opposite operation (division) to find the remainder.

            We need to do it a few times, that is why we use an array [sum]. Each time we go left by one,
            so we divide both a and b by 10. When you do a modulo 10 on a number,
            this operation returns the right-most / last digit.

             */
        }

        if (rem != 0) {
            sum[i++] = rem;

            /*
            If remainder is not equal to 0, it means we had to make a step left and add 1 to sum[i].
            This operation means that the next sum[i] will initially be the remainder itself.
            So next time we calculate the sum, i.e. when we calculate sum[i++], the remainder has to be taken care of.
             */
        }


        --i;

        System.out.print("Output: ");

        while (i >= 0) {
            System.out.print(sum[i--]);
        }

    }

    public static void areBinary(int a, int b) {
        while(a != 0 && b != 0) {
            if (((a % 10) > 1) && ((b % 10) > 1)) {

                //If the remainder is greater than 1 in a digit, then it cannot be a 0 or 1.

                System.out.println("These numbers are not binary!");
                break;
            } else
            { binarySum(a,b); }
            a = a / 10;
            b = b / 10;


            //However, we have to check it for every digit, so we divide by 10 until both a and b are equal to 0.

        }
    }
}

           // 101 is 5 and 001 is 1, so we know that 5+1 = 6 and 6 is 110. But how do we get it? Simple.
