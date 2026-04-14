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

        service.submit(printTask1);
        service.submit(printTask2);
        service.submit(printTask3);

        service.shutdown();
        System.out.println("All tasks submitted.");

        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("Time out. Forcing shutdown...");
            service.shutdownNow();
        }

    }
}
