package chalanges.map;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map <String, String> map = new HashMap<>();
        map.put("India", "Delhi");
        map.put("USA", "Washington D.C.");
        map.put("France", "Paris");
        map.put("China", "Beijing");
        map.put("France", "Lyon"); // This will overwrite the previous value for key "France"

        System.out.println("Capital of India: " + map.get("India"));
        System.out.println("Capital of USA: " + map.get("USA"));
        System.out.println("Capital of Bangladeh: " + map.get("Bangladeh")); // This will return null since the key "Bangladeh" does not exist  

        // iterate through the map entries
        System.out.println("Iterating through the map entries:");
        for (String key : map.keySet()) {
            System.out.println("Country: " + key + ", Capital: " + map.get(key));
        }

    }
    
}
