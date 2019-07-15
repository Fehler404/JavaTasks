import java.util.Scanner;

public class ToDecimal {

    public static void main(String[] args) {

        long decimal = 0, remainder = 0, j = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter binary number:");
        long binary = scan.nextInt();

        while(binary > 0){

            remainder = binary % 10;
            decimal = decimal + remainder * j;
            j = j * 2;
            binary = binary / 10;

        }

        System.out.println(decimal);

    }
}
