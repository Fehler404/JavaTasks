/*

// Calculate the average using a new object, not a static method

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        int n1, n2;
        System.out.println("Enter two numbers you'd like to be averaged.");
        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();

        Example avg = new Example();
        System.out.println("The average is: " + avg.average(n1, n2));
    }

    public static double average(int n1, int n2) {

        return (n1 + n2) / 2.0;

    }
}*/

/* // LOOPS, LOOPS EVERYWHERE

import java.util.Scanner;

public class Example{

    public static void main(String args[]){

        Example count = new Example();
        int int1 = 1;
        int int2 = 10;
        //countToTen(int1);
        //oddUpTo20(int1);
        //tenSquares(int1);
        //fourRandomNums(int1);
        //evenNumbers(int1, int2);
        //powersOfTwo(int1, int2);
        //areWeThereYet();
        //triangle(int1, int2);
        multiplicationTable(int2);

    }

    public static void countToTen(int x){
        for (int i = x; i < x + 10; i++){
            System.out.println(i);
        }
    }

    public static void oddUpTo20(int x){
        for (int i = x; i <= 20; i += 2){
            System.out.println(i);
        }
    }

    public static void tenSquares(int x){
        for (int i = x; i <= 10; i += 1){
            System.out.println(i*i);
        }
    }

    public static void fourRandomNums(int x){
        for (int i = x; i <= 4; i++){
            System.out.println((int)(Math.random() * 10));
        }
    }

   public static void evenNumbers(int x, int y) {

       if (x % 2 == 0) {

           for (int i = x; i <= y; i += 2) {

               System.out.println(i);

           }

       } else {

           for (int i = x + 1; i <= y; i += 2) {

               System.out.println(i);

           }
       }
   }

   public static void powersOfTwo(int x, int y){
        for (int i = x; i <= y; i++){
            System.out.println((int)(Math.pow(2,i)));
        }
   }

   public static void  areWeThereYet(){

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Are we there yet?");
        } while (!scan.nextLine().equals("Yes")); // пока не равняется Yes, спрашиваем снова и снова
        System.out.println("Good!"); // как только будет Yes, перестаем спрашивать, выдаем "Good!" и loop кончается

    }

    public static void triangle(int x, int y){

        for (int i = x; i <= y; i++){

            for (int j = x; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public static void multiplicationTable(int y){
        for(int i = 1; i<=y; i++){
            for(int j = 1; j<=y; j++){
                System.out.print("|"+ i*j +"\t");
            }
            System.out.println("|");
        }
    }
}

*/

import java.util.*;

public class Example {

    public static void main(String args[]) {

        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String[] classroom = {"Stacey", "Denisa", "Denisa", "Stacey"};
        String[] classroom2 = {"Stacey", "Denisa", "Lol", "Denisa", "Stacey"};
        String[] classroom3 = {"Stacey", "Denisa", "Mom", "Dad", "Denisa", "Stacey"};
        String[] workers = {"Workers", "of", "all", "world", "unite!"};
        String sample = "Hello World";
        String nope = "I am not what you need";
        String emptiness = null;

        Example one = new Example();
        //one.printArray(breakfast);
        //one.lastElement(breakfast);
        //one.lastButOneElement(breakfast);
        //one.isPalindrome(breakfast);
        //one.isPalindrome(classroom);
        //one.isPalindrome(classroom2);
        //one.isPalindrome(classroom3);
        //one.isPalindrome(workers);

        ArrayList<String> list = new ArrayList<String>();

        list.add("1");
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("7");
        list.add("8");
        list.add("8");
        list.add("8");
        list.add("8");
        list.add("9");

        //one.removeConsecutiveDuplicates(list);

        char [] letters = { 'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'd', 'd', 'd', 'd', 'd', 'd', 'e', 'f', 'f' };

        //one.packConsecutiveDuplicates(letters);

        String sentence = "I have never seen  a purple  cow in my  life";

        //System.out.println(one.countWords(sentence));

        System.out.println(one.isThisHelloWorld(sample));
        System.out.println(one.isThisHelloWorld(nope));
        System.out.println(one.isThisHelloWorld(null));


    }

    void printArray(String[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + ".");
            }
        }
    }

    void lastElement(String[] array) {
        System.out.println(array[array.length - 1] + ".");
    }

    void lastButOneElement(String[] array) {
        System.out.println(array[array.length - 2] + ".");
    }

    void reverseArray(String[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

    }

    void isPalindrome(String[] array) {

        int half = array.length / 2;
        int iterations[] = new int[array.length];
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i <= half; i++) {
            iterations[i] = i + 1;
        }

        for (int i = 0; i <= half; i++) {

            if (array[array.length - i - 1] == array[0 + i]) {
                //System.out.println("Pair " + iterations[i] + " is true");
                map.put(i, true);
            } else {
                //System.out.println("Pair " + iterations[i] +  " is false");
                map.put(i, false);
                break;
            }

        }

        if (map.containsValue(false)) {
            System.out.println("This is not a palindrome.");
        } else {
            System.out.println("This is a palindrome! c:");
        }

        //System.out.println(Arrays.asList(map));

    }

    void removeConsecutiveDuplicates(ArrayList<String> list) {

        int last = list.size() - 1;

        for (int i = 0; i < last; i++) {

            if (list.get(last - i) == list.get(last - i - 1)){
                list.remove(last - i - 1);
            }

        }

        System.out.println(Arrays.deepToString(list.toArray()));

    }

    void packConsecutiveDuplicates(char[] array){

        String s = Character.toString(array[0]);
        for(int i = 1; i<array.length; i++)
        {
            if(array[i] == array [i-1])
            {
                s = s + array[i];
            }
            else
            {
                System.out.print(s+ ", ");
                s = Character.toString(array[i]);
            }
        }
        System.out.println(s);
    }

    int countWords(String s){

        String [] words = s.split("\\s+"); //matches one or many whitespaces
        return words.length;
    }

    public boolean isThisHelloWorld (String str){
        if("Hello World".equals(str)){

            return true;

        } else{

            return false;
        }
    }
}

