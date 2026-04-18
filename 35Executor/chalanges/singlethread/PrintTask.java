package chalanges.singlethread;

public class PrintTask implements Runnable {

    private char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
    

    @Override
    public void run() {
        
        for (int i = 1; i <= 10; i++) {
            
           try {
                Thread.sleep(100); // 100 milliseconds ke liye thread ko sleep karna, jisse ki output thoda slow ho jaye aur hum easily dekh sake ki kaunse character print ho raha hai.
            } catch (InterruptedException e) { // InterruptedException handle karna, jo ki thread sleep ke dauran interrupt hone par throw hota hai.
                e.printStackTrace(); // agar thread interrupt hota hai to stack trace print karna, jisse ki error ka pata chal sake.
            }

            System.out.printf("%d%c", i, targetChar);  
        }
    }
    
}
