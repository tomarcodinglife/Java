package runnable;

public class RunnableTest implements Runnable {
    private final char targetChar;

    /* 
    Runnable aur thread me kya farak hai?
    Runnable ek interface hai jisme run() method hota hai, jabki Thread ek class hai jo Runnable interface ko implement karti hai. Runnable ko use karne se hum apne thread ke logic ko alag rakh sakte hain, jabki Thread class me hum directly thread ke logic ko define karte hain. 
    */

    /* 
    Runnable aur thread me kya similarity hai?
    Dono Runnable aur Thread me hum thread ke logic ko define kar sakte hain, aur dono me hum thread ko start kar sakte hain. Runnable ko use karne se hum apne thread ke logic ko alag rakh sakte hain, jabki Thread class me hum directly thread ke logic ko define karte hain. 
    */

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.printf("%d%c", i, targetChar);  
        }
        System.out.printf("\n %s %c Thread is task completed", Thread.currentThread().getName(), targetChar);
    }
 
    public RunnableTest(char targetChar) {
        this.targetChar = targetChar;
    }

    
}
