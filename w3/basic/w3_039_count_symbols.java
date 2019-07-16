import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stringCount {

    public static void main(String[] args) {

        List spaces = new ArrayList<Character>();
        List letters = new ArrayList<Character>();
        List numbers = new ArrayList<Character>();
        List otherCharacters = new ArrayList<Character>();

        List allTheSymbols = new ArrayList<Character>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        char[] entered = scan.nextLine().toCharArray();


        for (char i : entered) {

            allTheSymbols.add(i);

        }

        System.out.println("Symbols: " + howManySymbols(allTheSymbols));
        System.out.println("Spaces: " + howManySpaces(allTheSymbols));
        System.out.println("Symbols of a kind: " + howManySOAK(allTheSymbols, 'a'));

    }

    public static int howManySymbols(List list) {

        int howManySymbols = 0;

        for (int i = 0; i < list.size(); i++) {

            howManySymbols++;

        }

        return howManySymbols;
    }


    public static int howManySpaces(List list) {

        int howManySpaces = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(' ')) {
                howManySpaces++;
            }

        }

        return howManySpaces;
    }

    public static int howManySOAK(List list, char c) {

        int howManySOAK = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(c)) {
                howManySOAK++;
            }

        }

        return howManySOAK;
    }
}
