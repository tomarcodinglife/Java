    package chalanges.returnfuture;

    import java.util.List;
    import java.util.concurrent.ExecutionException;
    import java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;
    import java.util.concurrent.Future;

    import Chalanges.Calculator.calculator;

    public class Test {

        public static void main(String[] args) {
            try(ExecutorService service = Executors.newSingleThreadExecutor();){

                List<Future<Integer>> futures = new ArrayList<>();

                for (int i = 0; i <= 10; i++) {
                    FactorialCalculator task = new FactorialCalculator(i);
                    futures.add(service.submit(task));
                }

                for(Future<Integer> future : futures){
                    System.out.println(future.get());
                }
            }catch(ExecutionException e){
                throw new RuntimeException();
            }catch(InterruptedException e){
                throw new RuntimeException();
            }

        }
        
    }
