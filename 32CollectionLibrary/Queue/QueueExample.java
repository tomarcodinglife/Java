package Queue;
import java.util.LinkedList;
import java.util.Queue;

import Utility;



public class QueueExample {
    public static void main(String[] args) {

        // Queue Rules:
        // 1. Queue is a collection that follows the First-In-First-Out (FIFO) principle, which means that the first element added to the queue will be the first one to be removed.
        // 2. Queue allows duplicate elements, which means that you can add the same element multiple times to the queue.
        // 3. Queue does not allow null elements, which means that you cannot add null to the queue.
        // 4. Queue provides methods to manipulate the elements, such as add(), remove(), peek(), poll(), etc.
        // 5. Queue is an interface, so you cannot instantiate it directly. You need to use a class that implements the Queue interface, such as LinkedList or PriorityQueue.
        // 6. Queue can be of any type, including custom objects, as long as they are of the same type (generics).
        // 7. Queue is not synchronized, which means it is not thread-safe. If you need a thread-safe version of Queue, you can use ConcurrentLinkedQueue or use "Collections.synchronizedCollection(new LinkedList<>())".
        // 8. Queue is used when you need to maintain the order of elements and want to process them in a first-in-first-out manner. It is commonly used in scenarios such as task scheduling, breadth-first search algorithms, and handling requests in a server.

        // Queue Rule in Hindi:
        // 1. Queue ek collection hai jo First-In-First-Out (FIFO) principle ko follow karta hai, iska matlab hai ki queue me pehle add kiya gaya element pehle remove hoga.
        // 2. Queue duplicate elements ko allow karta hai, iska matlab hai ki aap same element ko multiple times queue me add kar sakte hain.
        // 3. Queue null elements ko allow nahi karta, iska matlab hai ki aap queue me null add nahi kar sakte hain.
        // 4. Queue elements ko manipulate karne ke liye methods provide karta hai, jaise add(), remove(), peek(), poll(), etc.
        // 5. Queue ek interface hai, isliye aap ise directly instantiate nahi kar sakte. Aapko Queue interface ko implement karne wale class ka use karna hoga, jaise LinkedList ya PriorityQueue.
        // 6. Queue kisi bhi type ka ho sakta hai, including custom objects, jab tak ki wo same type ke ho (generics).
        // 7. Queue synchronized nahi hai, iska matlab hai ki ye thread-safe nahi hai agar aapko thread-safe version of Queue ki zarurat hai, to aap ConcurrentLinkedQueue ka use kar sakte hain ya "Collections.synchronizedCollection(new LinkedList<>())" ka use kar sakte hain.
        // 8. Queue tab use ki jati hai jab aapko elements ke order ko maintain karna ho aur unhe first-in-first-out manner me process karna ho. Ye commonly task scheduling, breadth-first search algorithms, aur server me requests handle karne jaise scenarios me use ki jati hai.



        Queue<String> queue = new LinkedList<String>();

        // Adding elements to the queue
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Displaying the front element of the queue
        System.out.println("Front of the queue: " + queue.peek());

        // Removing elements from the queue
        System.out.println("Removed from the queue: " + queue.poll());
        System.out.println("Front of the queue after removal: " + queue.peek());

        // Adding another element to the queue
        queue.add("Fourth");
        System.out.println("Front of the queue after adding Fourth: " + queue.peek());

        // Displaying the size of the queue
        System.out.println("Size of the queue: " + queue.size());

        Utility.CollectionLibraryPrint(queue); // Using the utility method to print the queue elements

        // Queue Methods:
        // 1. add(E e): This method adds an element to the end of the queue. If the queue is full, it throws an IllegalStateException.
        // 2. offer(E e): This method also adds an element to the end of the queue, but it returns false if the queue is full instead of throwing an exception.
        // 3. remove(): This method removes and returns the head of the queue. If the queue is empty, it throws a NoSuchElementException.
        // 4. poll(): This method removes and returns the head of the queue, but it returns null if the queue is empty instead of throwing an exception.
        // 5. peek(): This method returns the head of the queue without removing it. If the queue is empty, it returns null.
        // 6. element(): This method returns the head of the queue without removing it. If the queue is empty, it throws a NoSuchElementException.
        // 7. size(): This method returns the number of elements in the queue.                      
        // 8. isEmpty(): This method returns true if the queue is empty, and false otherwise.
        // 9. clear(): This method removes all elements from the queue, leaving it empty    

        // Queue Methods in Hindi:
        // 1. add(E e): Ye method queue ke end me ek element add karta hai. Agar queue full hai, to ye IllegalStateException throw karta hai.
        // 2. offer(E e): Ye method bhi queue ke end me ek element add karta hai, lekin agar queue full hai to ye false return karta hai instead of throwing an exception.
        // 3. remove(): Ye method queue ke head ko remove karta hai aur return karta hai. Agar queue empty hai, to ye NoSuchElementException throw karta hai.
        // 4. poll(): Ye method queue ke head ko remove karta hai aur return karta hai, lekin agar queue empty hai to ye null return karta hai instead of throwing an exception.
        // 5. peek(): Ye method queue ke head ko return karta hai bina usse remove kiye. Agar queue empty hai, to ye null return karta hai.
        // 6. element(): Ye method queue ke head ko return karta hai bina usse  remove kiye. Agar queue empty hai, to ye NoSuchElementException throw karta hai.
        // 7. size(): Ye method queue me elements ki sankhya return karta hai.
        // 8. isEmpty(): Ye method true return karta hai agar queue empty hai, aur false otherwise.
        // 9. clear(): Ye method queue se sabhi elements ko remove karta hai, jisse queue empty ho jata hai..    
        
        

        
    }


}