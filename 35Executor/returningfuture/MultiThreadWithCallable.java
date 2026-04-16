package returningfuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadWithCallable implements Callable<String> {

   private final String name;

    public MultiThreadWithCallable (String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Task is executing in thread: " + Thread.currentThread().getName());
        Thread.sleep(5000);
        return "Hello, " + name + "!";
    }


    
    
}
