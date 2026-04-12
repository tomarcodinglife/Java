package threadState;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        ThreadState thread1 = new ThreadState();

        System.out.printf("\nCreate the thread %s", thread1.getState()); 

        thread1.start(); // thread1 is now in runnable state
        thread1.join(); // main thread will wait until thread1 finishes its execution

        System.out.printf("Thread state after completion %s", thread1.getState());


    }

    
}
