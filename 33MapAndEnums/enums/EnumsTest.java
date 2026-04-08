package enums;
import enums.TrafficLight;


public class EnumsTest {
    
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;

        System.out.println("Current traffic light color: " + color);
        System.out.println("Action for " + color + ": " + color.getAction());


        System.out.println("-----------------------ValueOf and Values-----------------------");
        
        // Value of enum can be changed by assigning a different constant
        TrafficLight TLight = TrafficLight.valueOf("GREEN");

            for (TrafficLight light : TrafficLight.values()) {
                System.out.println("Traffic Light: " + light + ", Action: " + light.getAction());
            }


    }
    
}
