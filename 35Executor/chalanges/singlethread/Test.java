package chalanges.singlethread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test  {

    public static void main(String[] args) {

        // 1st without try-catch block
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintTask printTask1 = new PrintTask('*');
        PrintTask printTask2 = new PrintTask('$');
        PrintTask printTask3 = new PrintTask('#');

        service.submit(printTask1);
        service.submit(printTask2);
        service.submit(printTask3);

        service.shutdown();

        // 2nd with try-catch block
        try(ExecutorService myservice = Executors.newSingleThreadExecutor()) {
            PrintTask mypint1 = new PrintTask('S');
            PrintTask mypint2 = new PrintTask('U');
            PrintTask mypint3 = new PrintTask('J');

            myservice.submit(mypint1);
            myservice.submit(mypint2);
            myservice.submit(mypint3);

        }
            

        
    }
    
}
