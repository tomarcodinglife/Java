package multithread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.concurrent.TimeUnit;

public class TestMultiThread {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);
        PrintTask printTask1 = new PrintTask('*');
        PrintTask printTask2 = new PrintTask('$');
        PrintTask printTask3 = new PrintTask('#');

        /* 

        Yah Runnable interface ke object ko submit kar raha hai, jiska run method execute hoga thread ke dwara.
        Yaha par ham Callable interface ka use nahi kar rahe hain, kyunki hume return value ki zarurat nahi hai, sirf task ko execute karna hai.
        
        */
        service.submit(printTask1);
        service.submit(printTask2);
        service.submit(printTask3);
        

        service.shutdown();
        System.out.println("All tasks submitted.");

    
        /* 
        Wait for all tasks to complete or timeout after 10 seconds
        awaitTermination ke dwara hum check kar sakte hain ki sabhi tasks complete ho gaye hain ya nahi, agar nahi hue to hum forcefully shutdown kar sakte hain.

        */

        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("Time out. Forcing shutdown...");
            service.shutdownNow();
        }

    }
}
