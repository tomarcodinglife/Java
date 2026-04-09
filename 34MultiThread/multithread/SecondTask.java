package multithread;
import multithread.Methods;

public class SecondTask extends Methods {

    @Override
    public void run() {
        printLoop(1, 100, "#");
    }
    
}
