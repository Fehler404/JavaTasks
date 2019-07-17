import java.util.ArrayList;
import java.util.List;

public class firstOccurance {

    public static void main(String[] args) {

        List list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).equals(20)){
                System.out.println("First occurance of this element is on position nr. " + (i + 1));
            }

        }

    }
}
