package join;

public class JoinTest {


    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread('*');
        MyThread thread2 = new MyThread('#');
        MyThread thread3 = new MyThread('$');

        thread1.start();
        thread2.join(); // Wait for thread2 to finish before starting thread3
        thread3.start();

    };
    
};
