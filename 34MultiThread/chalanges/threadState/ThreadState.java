package threadState;

public class ThreadState extends Thread {

    // yaha par try catch ka use karna zaruri hai kyunki sleep method InterruptedException throw karta hai

    /* 
    run() method me throws InterruptedException isliye nahi likh sakte kyunki ye method Runnable interface se aata hai jisme koi checked exception declare nahi hai. Java ke override rules ke hisaab se hum new checked exception add nahi kar sakte, isliye hume Thread.sleep() ko try-catch block me handle karna padta hai.
    */


    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.printf("\nThread %s is running %n", Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);  
        }

    }
    
    

    
}
