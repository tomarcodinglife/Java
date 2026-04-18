package chalanges.multithread;
import javax.management.RuntimeErrorException;

public class SleepTask implements Runnable {

   
    @Override
    public void run(){

        Thread current = Thread.currentThread();
        System.out.printf("\n Started Current Thread : %s", current.getName());
        
        try{
            Thread.sleep(getRandom()*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.printf("\n Ended Current Thread : %s", current.getName());

    }
    
    private int getRandom(){
        double num = Math.random() * 5 + 1;
        return (int) num;
    }
    
}
