package trafficsignal;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        // Create and start threads for each traffic light color
        Thread redLight = new TrafficLight(SignalColor.RED.name());
        Thread yellowLight = new TrafficLight(SignalColor.YELLOW.name());
        Thread greenLight = new TrafficLight(SignalColor.GREEN.name());

        redLight.start();
        redLight.join(); // Wait for the red light to finish before starting the yellow light
        yellowLight.start();
        yellowLight.join(); // Wait for the yellow light to finish before starting the green light
        greenLight.start();

        
    }
    
}
