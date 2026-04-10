package runnable;
import java.lang.Thread;

public class Test {

    public static void main(String[] args) {

        //Create three RunnableTest instances with different target characters
        RunnableTest runnableTest1 = new RunnableTest('*');
        RunnableTest runnableTest2 = new RunnableTest('#');
        RunnableTest runnableTest3 = new RunnableTest('$');

        // Create three threads, each executing a different RunnableTest instance
        Thread thread1 = new Thread(runnableTest1, "Thread-1");
        Thread thread2 = new Thread(runnableTest2, "Thread-2");
        Thread thread3 = new Thread(runnableTest3, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
    
}
