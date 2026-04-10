package threadclass;


public class MainThread {

    public static void main(String[] args) {
        

        FirstTask firstTask1 = new FirstTask();
        FirstTask firstTask2 = new FirstTask();
        FirstTask firstTask3 = new FirstTask();
        

        SecondTask secondTask1 = new SecondTask();
        SecondTask secondTask2 = new SecondTask();
        SecondTask secondTask3 = new SecondTask();



        ThirdTask thirdTask1 = new ThirdTask();
        ThirdTask thirdTask2 = new ThirdTask();
        ThirdTask thirdTask3 = new ThirdTask();

        
    

        // Direct call to the run method will not create a new thread, it will execute in the main thread.
        // .run() will execute the code in the current thread (main thread) and will not create a new thread of execution.
        // .run method me call karne se new thread create nahi hota, ye code ko current thread (main thread) me execute karega.


        // .start() method will create a new thread and execute the run method in that new thread.
        // .start() method new thread create karega aur run method ko us new thread me execute karega.
        firstTask1.start();
        firstTask2.start();
        firstTask3.start();

        secondTask1.start();
        secondTask2.start();
        secondTask3.start();
        
        thirdTask1.start();
        thirdTask2.start();
        thirdTask3.start();
        //


    }


}
