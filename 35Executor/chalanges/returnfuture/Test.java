    package chalanges.returnfuture;

    import java.util.List;
    import java.util.concurrent.ExecutionException;
    import java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;
    import java.util.concurrent.Future;
    import java.util.ArrayList;
    import java.util.concurrent.TimeUnit;

    public class Test {

        public static void main(String[] args) {
            try(ExecutorService service = Executors.newFixedThreadPool(3);){

                List<Future<Integer>> futures = new ArrayList<>();

                for (int i = 0; i <= 10; i++) {
                    FactorialCalculator task = new FactorialCalculator(i);
                    futures.add(service.submit(task));
                }

                for(Future<Integer> future : futures){
                    System.out.println(future.get());
                }

                // service.shutdown();

                if (service.awaitTermination(10, TimeUnit.SECONDS)) {
                    System.out.println("All tasks completed successfully.");
                    service.shutdown();
                }

            }catch(InterruptedException | ExecutionException e){
                throw new RuntimeException(e);
            }

        }
        
    }
