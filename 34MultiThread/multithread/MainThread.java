package multithread;
import multithread.FirstTask;
import multithread.SecondTask;
import multithread.ThirdTask;

public class MainThread {

    public static void main(String[] args) {
        

        FirstTask firstTask = new FirstTask();
        SecondTask secondTask = new SecondTask();
        ThirdTask thirdTask = new ThirdTask();
    

        // Direct call to the run method will not create a new thread, it will execute in the main thread.
        // .run() will execute the code in the current thread (main thread) and will not create a new thread of execution.
        // .run method me call karne se new thread create nahi hota, ye code ko current thread (main thread) me execute karega.


        // .start() method will create a new thread and execute the run method in that new thread.
        // .start() method new thread create karega aur run method ko us new thread me execute karega.
        firstTask.start();
        secondTask.start();
        thirdTask.start();

        //


    }


}
