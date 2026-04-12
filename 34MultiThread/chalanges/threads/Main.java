package threads;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Threads thread1 = new Threads(1);
        Threads thread2 = new Threads(2);
        Threads thread3 = new Threads(3);

        thread1.start();
        thread1.join(); // main thread will wait until thread1 finishes its execution
        thread2.start();
        thread2.join(); // main thread will wait until thread2 finishes its execution
        thread3.start();




    }

    
}
