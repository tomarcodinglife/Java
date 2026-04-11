package join;

public class JoinTest {


    public static void main(String[] args) throws InterruptedException { // InterruptedException maine isliye add kiya hai kyunki join method InterruptedException throw kar sakta hai
        MyThread thread1 = new MyThread('*');
        MyThread thread2 = new MyThread('#');
        MyThread thread3 = new MyThread('$');

        thread1.start();
        thread2.join(); // thread2.join() ka matlab hai ki main thread (jo ki main method hai) thread2 ke complete hone ka wait karega, uske baad hi thread3 start hoga
        thread3.start();

    };
    
};
