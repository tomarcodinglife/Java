package priority;

public class PriorityTest {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread('*');
        MyThread thread2 = new MyThread('#');
        MyThread thread3 = new MyThread('$');

        // Set different priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        thread1.start();
        thread2.start();
        thread3.start();
        
    }
    
}
