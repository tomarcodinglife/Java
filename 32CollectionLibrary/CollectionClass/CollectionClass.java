package CollectionClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

    public static void main(String[] args) {
        
        List <Integer> myList = new ArrayList<Integer>();

        myList.add(1);
        myList.add(5);
        myList.add(18);
        myList.add(3);
        myList.add(9);

        System.out.println("Original List: " + myList);
        Collections.sort(myList); // Sort the list in ascending order
        System.out.println("Sorted List: " + myList);
        Collections.reverse(myList); // Reverse the order of the list
        System.out.println("Reversed List: " + myList);
        Collections.shuffle(myList); // Shuffle the list randomly
        System.out.println("Shuffled List: " + myList);
        int max = Collections.max(myList); // Get the maximum element in the list
        int min = Collections.min(myList); // Get the minimum element in the list
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);





    }



}