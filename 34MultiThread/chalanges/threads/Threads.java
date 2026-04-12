package threads;

public class Threads extends Thread {

    private final int threadNumber;
    
    //This is constructor of the thread class which takes thread number as argument and assigns it to the threadNumber variable. This will help us to identify which thread is running when we print the thread number in the run method.
    public Threads(int threadNumber) {
        this.threadNumber = threadNumber;
    }


    @Override
    public void run() {

        System.out.printf("\nThread No. %d is Starting %n", this.threadNumber);
        
        try{

            Thread.sleep(1000);

        } catch (InterruptedException e) {  

            throw new RuntimeException(e);

        }

        System.out.printf("\nThread %d is completed %n", this.threadNumber, this.getState());

    }


    
}