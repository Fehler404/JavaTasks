import java.util.Arrays;
import java.util.Collections;

public class Shuffle {

    public static void main(String[] args) {
        Integer[] arr = new Integer[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

    }
}
