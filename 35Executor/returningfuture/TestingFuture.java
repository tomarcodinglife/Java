package returningfuture;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TestingFuture {

    
    public static void main(String[] args) throws Exception {

        /*
        Yaha par humne ExecutorService ka use kiya hai jisme humne 3 threads ka pool banaya hai. Humne MultiThreadWithCallable class ke 4 objects banaye hain, jisme se har ek object ek alag thread me execute hoga. Humne Future<String> ka use kiya hai jisse hum future me return hone wale result ko handle kar sakte hain. Jab hum service.submit(task) karte hain, to ye task ko execute karta hai aur uska result future object me store karta hai. Hum future.get() method ka use karke result ko retrieve kar sakte hain jab task complete ho jata hai.
        */
        ExecutorService service = Executors.newFixedThreadPool(3); 
        MultiThreadWithCallable task1 = new MultiThreadWithCallable("Sujit");
        MultiThreadWithCallable task2 = new MultiThreadWithCallable("Amit");
        MultiThreadWithCallable task3 = new MultiThreadWithCallable("Sohan");
        MultiThreadWithCallable task4 = new MultiThreadWithCallable("Raman");

        /*
        Yaha par humne 4 tasks ko submit kiya hai, lekin humne sirf 3 threads ka pool banaya hai. Iska matlab hai ki pehle 3 tasks execute honge aur jab koi ek task complete hoga tabhi chautha task execute hoga. Future object ke through hum ye dekh sakte hain ki kaunsa task complete hua hai aur uska result kya hai. Jab hum future.get() method call karenge, to ye method block ho jayega jab tak task complete nahi hota. Jab task complete ho jata hai, to future.get() method uska result return karta hai.

        yaha Future ka use isliye kiya gaya hai kyunki Callable interface ke methods return type hota hai, aur Future interface ke methods se hum us return value ko handle kar sakte hain. Future ke through hum task ke status ko bhi check kar sakte hain, jaise ki isDone() method se pata chal sakta hai ki task complete hua hai ya nahi. Future ka use karke hum asynchronous programming kar sakte hain, jisme hum tasks ko background me execute kar sakte hain aur main thread ko block nahi karte hain.
        */

        Future<String> future1 = service.submit(task1);
        Future<String> future2 = service.submit(task2);
        Future<String> future3 = service.submit(task3);
        Future<String> future4 = service.submit(task4);

        /*
        Future kya hai ?
        Future ek interface hai jo java.util.concurrent package me available hai. Future ka use asynchronous programming me hota hai, jisme hum tasks ko background me execute karte hain aur main thread ko block nahi karte hain. Future ke through hum task ke status ko check kar sakte hain, jaise ki isDone() method se pata chal sakta hai ki task complete hua hai ya nahi. Future ke through hum task ke result ko bhi retrieve kar sakte hain jab task complete ho jata hai. Future ka use karke hum efficient aur responsive applications bana sakte hain.
        
        */

        // future1.isDone();
        // future1.get();

        // Print

        System.out.printf("Full Name is %s\n", future1.get());
        System.out.printf("Full Name is %s\n", future2.get());
        System.out.printf("Full Name is %s\n", future3.get());
        System.out.printf("Full Name is %s\n", future4.get());

        service.shutdown();

    }

     
    
    
    
}
