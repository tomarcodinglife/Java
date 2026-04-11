package synchronize;

import java.lang.management.ClassLoadingMXBean;

public class TestSynchronize {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Counter myCounter = new Counter();


        UpdaterThread CounterThread1 = new UpdaterThread(myCounter);
        UpdaterThread CounterThread2 = new UpdaterThread(myCounter);

        CounterThread1.start();
        CounterThread2.start();


        try {

            CounterThread1.join();
            CounterThread2.join();

        } catch (Exception e) {
            System.out.println("Thread interrupted: " + e.getMessage());
            // TODO: handle exception
        }

    

        long endTime = System.currentTimeMillis();

        System.out.printf("Final count is %d and time taken is %d ms \n", myCounter.getCount(), endTime - startTime);



    }

    
}
