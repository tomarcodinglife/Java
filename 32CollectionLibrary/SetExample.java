import java.util.HashSet;
import java.util.Set;


public class SetExample {


    public static void main(String[] args) {
        
        Set <String> set = new HashSet<String>();
        
        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("First"); // Duplicate element, will not be added to the set
        set.add(null); // Null element, will be added to the set

        System.out.println("Set: " + set);
        System.out.println(set.size()); // Size of the set
        System.out.println(set.contains("Second")); // Check if the set contains "Second"
        set.remove("Third"); // Remove "Third" from the set
        System.out.println("Set after removing 'Third': " + set);
        System.out.println(set.isEmpty()); // Check if the set is empty

        // Set Methods:
        // 1. add(E e): This method adds an element to the set. If the element already exists in the set, it will not be added again and the method will return false.
        // 2. remove(Object o): This method removes the specified element from the set if it is present. It returns true if the element was removed, and false if the element was not found in the set.
        // 3. contains(Object o): This method checks if the set contains the specified element. It returns true if the element is present in the set, and false otherwise.
        // 4. size(): This method returns the number of elements in the set.
        // 5. clear(): This method removes all elements from the set, leaving it empty
        // 6. isEmpty(): This method returns true if the set is empty, and false otherwise.
        // 7. iterator(): This method returns an iterator over the elements in the set, which can be used to traverse the set. 
        // 8. toArray(): This method returns an array containing all the elements in the set. The order of the elements in the array is not guaranteed to be the same as the order of the elements in the set.
        // 9. addAll(Collection<? extends E> c): This method adds all the elements from the specified collection to the set. If any of the elements in the collection already exist in the set, they will not be added again.
        // 10. removeAll(Collection<?> c): This method removes all the elements in the set that are also contained in the specified collection. It returns true if the set was modified as a result of this operation, and false otherwise.     





    }

    
}
