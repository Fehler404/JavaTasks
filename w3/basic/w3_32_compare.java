import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = scan.nextInt();

        System.out.println("Enter b:");
        int b = scan.nextInt();

        compare2(a, b);

    }

    public static void compare1(int a, int b){

        if(a > b){
            System.out.println(a + " is bigger than " + b);
        } else {
            System.out.println(a + " is less than " + b);
        }
    }

    public static void compare2(int a, int b){

        if(a == b){
            System.out.println(a + " = " + b);
        } else {
            System.out.println(a + " != " + b);
        }

        if(a > b){
            System.out.println(a + " > " + b);
        } else {
            System.out.println(a + " < " + b);
        }

    }
}
