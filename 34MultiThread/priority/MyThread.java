package priority;

public class MyThread extends Thread {
    private final char targetChar;

    public MyThread(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.printf("%d%c", i, targetChar);  
        }
        System.out.printf("\n %s %c Thread is task completed", Thread.currentThread().getName(), targetChar);
    }
    
}
