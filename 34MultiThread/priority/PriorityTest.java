package priority;

public class PriorityTest {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread('*');
        MyThread thread2 = new MyThread('#');
        MyThread thread3 = new MyThread('$');

        /*
        Priority kiu use karte hain? 
        Priority ka use hum isliye karte hain taaki hum ye control kar sakein ki kaunsa thread pehle execute hoga. Java mein har thread ko ek priority di ja sakti hai, jo ki 1 se 10 ke beech hoti hai. Higher priority wale thread ko scheduler zyada preference deta hai, lekin ye guarantee nahi hota ki higher priority wala thread hamesha pehle execute hoga, kyunki ye operating system ke thread scheduling algorithm par depend karta hai.
        
        */

        // Set different priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        thread1.start();
        thread2.start();
        thread3.start();
        
    }
    
}
