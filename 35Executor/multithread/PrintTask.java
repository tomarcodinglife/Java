package multithread;

public class PrintTask implements Runnable {

    private final char targetChar;

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

           try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.printf("%d%c", i, targetChar);  
        }
        System.out.printf("\n %s %c Thread is task completed", Thread.currentThread().getName(), targetChar);

    }

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }


    
}
