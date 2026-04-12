package trafficsignal;

public class TrafficLight extends Thread {
    
    private final String signalColor;

    public TrafficLight(String signalColor) {
        this.signalColor = signalColor;
    }

    @Override
    public void run(){
        System.out.printf("%s light is ON%n", signalColor );
        try {
            Thread.sleep(SignalColor.valueOf(signalColor).getDuration()); // Simulate the duration of the traffic light

        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
        System.out.printf("%s light is OFF%n", signalColor );
    }


    
}
