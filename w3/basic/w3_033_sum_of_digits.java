import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        int number;

        List digits = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = scan.nextInt();

        findDigits(digits, number);
        sum(digits);

    }

    public static void findDigits(List<Integer> list, int number){

        while (number > 0) {

            list.add(number % 10);
            number = number / 10;
        }
    }

    public static void sum(List<Integer> list){
        
        int sum = 0;

        for (int i : list) {

            sum += i;
            
        }

        System.out.println(sum);

    }
}
