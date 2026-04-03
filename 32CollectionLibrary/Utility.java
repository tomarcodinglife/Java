import java.util.Collection;

public class Utility {


    public static <E> void CollectionLibraryPrint(Collection<E> library) { 
        for(E item : library) { 
            System.out.print(item + " ");
        }
        System.out.println(); // Print a newline after printing all elements
    }

    // What is <E> ?
    /* <E> is a generic type parameter that allows this method to work with any type of collection. You can replace E with any other letter or word, but E is commonly used to represent "Element" in collections. */

    /* <E> ek generic type parameter hai jo is method ko kisi bhi type ke collection ke sath kaam karne ki suvidha deta hai. Aap E ko kisi bhi aur letter ya word se replace kar sakte hain, lekin E commonly "Element" ko represent karne ke liye use kiya jata hai collections me.
    
    */


    public static void main(String[] args) {
        System.out.println("Welcome to the Utility class! This class can be used to store common utility methods that can be used across different classes in your project. You can add methods for tasks like string manipulation, date formatting, or any other reusable code that you want to share across your application.");
    }

    
}
