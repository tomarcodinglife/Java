package synchronize;

public class Counter {

    private int count = 1;

    // Increment method to increase the count

    /* 
    
    Synchronized maine isliye use kiya kyoki Synchronized method ke andar ek time pe sirf ek thread hi access kar sakta hai
    ye isliye important hai kyoki agar multiple threads ek hi time pe increment method ko access karenge to count variable ka value galat ho sakta hai 
    
    */

    public synchronized void increment() { 
        
        count++;
    }

    // Method to get the current count value
    public int getCount() {
        return count;
    }

    // 

    
}
