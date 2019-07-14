import java.util.*;

public class Convert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter a:");
        int a = scanner.nextInt();

        System.out.println(Integer.toString(a,2));

    }
}


