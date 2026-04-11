package threadCommunication;

public class Sleep {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("Thread is going to sleep for 3 seconds...");

        Thread.sleep(3000); 
        
        System.out.println("Thread woke up after sleeping!");
        
        /* 
        Sleep method kya karta h ? 
        Sleep Method ek static method hai jo Thread class ka part hai, aur iska use current thread ko specified time ke liye sleep mode me daalne ke liye kiya jata hai. Jab koi thread sleep mode me hota hai, to wo CPU se apna control chhod deta hai aur dusre threads ko execute hone ka mauka deta hai. Sleep method ke andar diya gaya time milliseconds me hota hai, to agar hum 3000 milliseconds dete hain to thread 3 seconds ke liye sleep mode me chala jayega. Sleep method InterruptedException throw kar sakta hai, isliye hume is exception ko handle karna padta hai ya phir method signature me throws InterruptedException likhna padta hai.
        */


        
        
    }
    
}
