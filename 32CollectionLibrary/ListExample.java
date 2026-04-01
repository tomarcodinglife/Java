import java.util.ArrayList;
import java.util.List;

public class ListExample {

    // List is a collection that can hold multiple elements. It is an ordered collection, which means that the elements are stored in a specific order and can be accessed by their index. In Java, the List interface is part of the java.util package and is implemented by classes such as ArrayList, LinkedList, and Vector.

    // List use kahte hain jab aapko ek aise collection ki zarurat hoti hai jisme duplicate elements allowed hote hain aur order maintain hota hai. List ke elements ko index ke through access kiya ja sakta hai, aur List me elements ko add, remove, aur modify kiya ja sakta hai.

    // List Rules:
    // 1. List can contain duplicate elements.
    // 2. List maintains the order of elements.
    // 3. List allows null elements (depending on the implementation).
    // 4. List provides methods to manipulate the elements, such as add(), remove(), get(), set(), etc.
    // 5. List is an interface, so you cannot instantiate it directly. You need to use a class that implements the List interface, such as ArrayList or LinkedList.
    // 6. List can be of any type, including custom objects, as long as they are of the same type (generics).
    // 7. List can be acess by index, which means you can retrieve, update, or remove elements based on their position in the list.
    // 8. List is not synchronized, which means it is not thread-safe. If  you need a thread-safe version of List, you can use Collections.synchronizedList() or use a concurrent collection like CopyOnWriteArrayList.
    // 9. List maintain insertion order, which means that the elements are stored in the order they were added to the list. This is different from other collections like Set, which do not maintain insertion order.
    // 10 List Offers fast random access to elements, which means that you can retrieve elements based on their index in constant time (O(1)). This is because List uses an array-based implementation, which allows for efficient access to elements.
    // 11. List grow automatically as you add elements to it. You do not need to worry about the size of the list, as it will resize itself as needed to accommodate new elements.
    // 12. List Collection is preferred when you need to maintain the order of elements and allow duplicates in your collection. It is also useful when you need to access elements by their index or when you need to perform operations that require random access to elements.


    // Example of using List in Java:
    public static void main(String[] args) {

        List ListDemo = new ArrayList(); // You can also define this type but in this list you can any type store data like String, Integer, Double etc. but if you want to store only one type of data then you can use generics like List<String> or List<Integer>.
        // ListDemo.add("Hello");
        // ListDemo.add(123);

        // So this is the example of using List without generics, where you can store any type of data in the list. However, it is generally recommended to use generics when working with collections in Java, as it provides type safety and helps to avoid runtime errors.

        // Object of List Interface with Generics Like String, Integer, Double etc.
        // This is actual Industry Standard for using List in Java, where you specify the type of data that the list will hold using generics. This helps to ensure type safety and makes your code more readable and maintainable.
        List <String> ListFirst = new ArrayList<String>();
        ListFirst.add("Hello");
        ListFirst.add("World");
        ListFirst.add("Hello"); // Duplicate element
        System.out.println(ListFirst); // Output: [Hello, World, Hello]

        // All Method of List Interface
        System.out.println("Size of List: " + ListFirst.size()); // Output: Size of List: 3
        System.out.println("Element at index 1: " + ListFirst.get(1)); // Output: Element at index 1: World
        ListFirst.set(1, "Java"); // Update element at index 1  
        System.out.println("Updated List: " + ListFirst); // Output: Updated List: [Hello, Java, Hello]
        ListFirst.remove(0); // Remove element at index 0   
        System.out.println("List after removal: " + ListFirst); // Output: List after removal: [Java, Hello]
        System.out.println("Does the List contain 'Hello'? " + ListFirst.contains("Hello")); // Output: Does the List contain 'Hello'? true
        System.out.println("Is the List empty? " + ListFirst.isEmpty()); // Output: Is the List empty? false
        ListFirst.clear(); // Clear all elements from the List  
        System.out.println("List after clearing: " + ListFirst); // Output: List after clearing: []

        // Object of List Interface
        List <Integer> ListSecond = new ArrayList<Integer>();
        ListSecond.add(1);
        ListSecond.add(2);
        ListSecond.add(3);
        System.out.println(ListSecond); // Output: [1, 2, 3]    

        // Remove Object from List
        ListSecond.remove(Integer.valueOf(2)); // Remove element with value 2
        //Contain Object in List
        System.out.println("Does the List contain 2? " + ListSecond.contains(2)); // Output: Does the List contain 2? false
        // Index of Object in List
        System.out.println("Index of 3: " + ListSecond.indexOf(3)); // Output: Index of 3: 1

        

        
    }


    
}
