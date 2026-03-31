

public class List {

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
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("Hello"); // Duplicate element
        System.out.println(myList); // Output: [Hello, World, Hello]
    }


    
}
