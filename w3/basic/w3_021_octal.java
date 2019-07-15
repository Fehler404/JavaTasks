import java.util.*;

public class Octal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int decimal = scan.nextInt();

        List<String> list = new ArrayList<String>();


        while (decimal >= 1) {

            list.add(Integer.toString(decimal % 8));

            decimal = decimal / 8;

        }

        Collections.reverse(list);
        System.out.println(list);

    }
}
