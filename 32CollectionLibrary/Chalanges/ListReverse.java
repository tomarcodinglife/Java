package Chalanges;
import java.util.*;

public class ListReverse {

    public static void reverseList(List<Integer> list) {
        Collections.reverse(list); // Reverse the order of the elements in the list
    }

    public static void myReverseList(List<Integer> list) {
        // This method reverses the list without using Collections.reverse() method
        int left = 0; // Initialize left pointer
        int right = list.size() - 1; // Initialize right pointer    
        while (left < right) { // Loop until the pointers meet
            int temp = list.get(left); // Store the element at left pointer in a temporary variable
            list.set(left, list.get(right)); // Set the element at left pointer to the element at right pointer
            list.set(right, temp); // Set the element at right pointer to the value stored in the temporary variable
            left++; // Move the left pointer to the right
            right--; // Move the right pointer to the left
        }

    }


    public static void main(String[] args) {
        
        List <Integer> myList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(myList); // Output: [1, 2, 3, 4, 5]

        reverseList(myList);
        System.out.println(myList); // Output: [5, 4, 3, 2, 1]


        // without using Collections.reverse() method
        List <Integer> myNewList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(myNewList); // Output: [1, 2, 3, 4, 5]

        myReverseList(myNewList);
        System.out.println(myNewList); // Output: [5, 4, 3, 2, 1]

        List <Integer> myAnotherList = new ArrayList<>(Arrays.asList(25, 28, 35, 45, 65, 14));
        System.out.println(myAnotherList); // Output: [25, 28, 35, 45, 65, 14]
        myReverseList(myAnotherList);
        System.out.println(myAnotherList); // Output: [14, 65, 45, 35, 28, 25]

    }
    
}
