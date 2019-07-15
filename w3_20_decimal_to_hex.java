import java.util.*;

public class Hex {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int decimal = scan.nextInt();

        List<String> list = new ArrayList<String>();


        while (decimal >= 1) {

            list.add(Integer.toString(decimal % 16));

            decimal = decimal / 16;


            for (int i = 0; i < list.size(); i++) {


                if (list.get(i).equals("10")) {
                    list.set(i, "A");
                }

                if (list.get(i).equals("11")) {
                    list.set(i, "B");
                }

                if (list.get(i).equals("12")) {
                    list.set(i, "C");
                }

                if (list.get(i).equals("13")) {
                    list.set(i, "D");
                }

                if (list.get(i).equals("14")) {
                    list.set(i, "E");
                }

                if (list.get(i).equals("15")) {
                    list.set(i, "F");
                }

            }

        }

        Collections.reverse(list);
        System.out.println(list);

    }
}
