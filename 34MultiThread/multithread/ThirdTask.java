package multithread;
import multithread.Methods;

public class ThirdTask extends Methods {

    @Override
    public void run() {
        printLoop(1, 100, "@");
    }
    
}
