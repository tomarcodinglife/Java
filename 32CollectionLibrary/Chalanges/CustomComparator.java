import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomComparator {

    public static void StringSort(List<String> list) {
        Collections.sort(list); // Sort the list in ascending order
    }   

    public static void reverseStringSort(List<String> list) {
        Collections.reverse(list); // Sort the list in descending order
    }
 
    public static void main(String[] args) {
        // Arrays.asList() se jo list banti hai wo fixed-size list hoti hai. Iska matlab hai ki aap is list me elements ko add ya remove nahi kar sakte, lekin aap existing elements ko modify kar sakte hain. Agar aapko ek mutable list ki zarurat hai jisme aap elements ko add ya remove kar sake, to aap ArrayList ka use kar sakte hain.
        List <String> myList = Arrays.asList("Rohan", "Ankit", "Satyam", "Rahul", "Amit");

        // Esa code me humne Arrays.asList() ka use karke ek list banayi hai, jisme humne kuch string elements add kiye hain. Ye list fixed-size list hai, isliye hum isme elements ko add ya remove nahi kar sakte, lekin hum existing elements ko modify kar sakte hain. Agar aapko ek mutable list ki zarurat hai jisme aap elements ko add ya remove kar sake, to aap ArrayList ka use kar sakte hain, jaise ki niche diya gaya hai:
        List <String> myNewList = new ArrayList<>(Arrays.asList("Rohan", "Ankit", "Satyam", "Rahul", "Amit"));

        System.out.println(myList); // Output: [Rohan, Ankit, Satyam, Rahul, Amit]
        StringSort(myList);
        System.out.println(myList); // Output: [Amit, Rohan, Ankit, Rahul, Satyam]

        /*

        myList.add("New Element"); // This will throw UnsupportedOperationException because myList is a fixed-size list created by     Arrays.asList()
        System.out.println(myList); // This line will not be executed due to the exception thrown in the previous line

         */
        myNewList.add("New Element"); // This will work because myNewList is a mutable list created by ArrayList
        StringSort(myNewList); // Sort the new list in ascending order
        System.out.println(myNewList); // Output: [Rohan, Ankit, Satyam, Rahul, Amit, New Element]
        reverseStringSort(myNewList); // Sort the new list in descending order
        System.out.println(myNewList); // Output: [Rohan, Ankit, Satyam, Rahul, Amit, New Element]



    }


    
}