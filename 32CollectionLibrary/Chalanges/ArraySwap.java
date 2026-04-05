package Chalanges;
import java.util.*;

public class ArraySwap {

    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i); // Store the element at index i in a temporary variable
        list.set(i, list.get(j)); // Set the element at index i to the element at index j
        list.set(j, temp); // Set the element at index j to the value stored in the temporary variable
    }

    public static void main(String[] args) {
        // Array List 
        List <Integer> myList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(myList); // Output: [1, 2, 3, 4, 5]

        System.out.println(myList.get(0)); // Output: 1
        System.out.println(myList.get(4)); // Output: 5

        swap(myList, 1, 2);

        System.out.println(myList);
        
    }

    
}
