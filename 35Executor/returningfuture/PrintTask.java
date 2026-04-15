package returningfuture;


public class PrintTask implements Runnable {

    private char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
    

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
    }






 }

