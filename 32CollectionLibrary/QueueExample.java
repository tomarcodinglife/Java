
public class QueueExample {
    public static void main(String[] args) {

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
    }


}