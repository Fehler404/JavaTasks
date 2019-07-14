import java.util.*;

public class Convert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter a:");
        int a = scanner.nextInt();

        List<Integer> digits = new ArrayList<Integer>();
        List<Integer> remainders = new ArrayList<Integer>();
        
        // using List instead of ArrayList is better for the architecture.
        // if I decided to swtich ArrayList to LinkedList, it will be much easier to change the code.

        while (a > 0) {

            double digit = a % 10;
            a = a / 10;
            int whole = (int) digit / 2;
            int rem = (int) digit % 2;

            digits.add(whole);
            remainders.add(rem);
        }

        Collections.reverse(digits);
        Collections.reverse(remainders);

        for (int i = 0; i < digits.size() ; i++) {

            System.out.println(digits.get(i) * Math.pow(2, i));

        }

//        for (int i = 0; i < digits.size(); i++) {
//
//            System.out.println(digits.get(i));
//
//        }
//
//        for (int i = 0; i < remainders.size(); i++) {
//
//            System.out.println(remainders.get(i));
//
//        }

        System.out.println("Whole part of division: " + Arrays.deepToString(digits.toArray()));
        System.out.println("Remainders: " + Arrays.deepToString(remainders.toArray()));
    }
}


