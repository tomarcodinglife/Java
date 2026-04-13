package singlethread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSignleThread {

    public static void main (String[] args) {
        
       ExecutorService service =  Executors.newSingleThreadExecutor();
        PrintTask printTask1 = new PrintTask('*');
        PrintTask printTask2 = new PrintTask('$');
        PrintTask printTask3 = new PrintTask('#');

        service.submit(printTask1);
        service.submit(printTask2);
        service.submit(printTask3);
        
        service.shutdown();




    }
    
}
