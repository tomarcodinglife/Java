package createthread;

public class Main {

    public static void main(String[] args) {
        HelloThread thread1 = new HelloThread(1);
        HelloThread thread2 = new HelloThread(2);   
        HelloThread thread3 = new HelloThread(3);   

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.run();
        thread2.run();
        thread3.run();


    }

    
}
