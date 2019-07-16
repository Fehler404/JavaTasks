import java.util.Scanner;

public class ReversedString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        char[] letters = scan.nextLine().toCharArray();

        reverse(letters);
        
    }
    
    public static void reverse(char[] characters){
        for (int i = characters.length - 1; i >=0 ; i--) {

            System.out.print(characters[i]);
            
        }
    }
}
