package enums;
import enums.TrafficLight;


public class EnumsTest {
    
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;

        System.out.println("Current traffic light color: " + color);
        System.out.println("Action for " + color + ": " + color.getAction());


    }
    
}
