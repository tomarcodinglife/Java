package map;
import java.util.HashMap;
import java.util.Map;



public class MapTest {
    
    public static void main(String[] args) {

        Map <String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);  
        map.put("Three", 3);
        map.put("One", 11); // This will overwrite the previous value for key "One"

        System.out.println("Value for key 'One': " + map.get("One"));

        System.out.println("Value for key 'Two': " + map.get("Two"));

        System.out.println("Value for key 'Three': " + map.get("Three"));

        System.out.println(map.size() + " key-value pairs in the map." );   

        System.out.println("Does the map contain key 'One'? " + map.containsKey("One"));    
        System.out.println("Does the map contain key 'Four'? " + map.containsKey("Four"));

        map.put("Four", 4);
        System.out.println("Added key 'Four' with value: " + map.get("Four"));

        System.out.println("Removed key 'Two' with value: " + map.remove("Two") + " from the map.");    
        System.out.println("Does the map contain key 'Two'? " + map.containsKey("Two"));
        System.out.println("Current size of the map: " + map.size() + " key-value pairs." );    


        // iterate through the map entries
        System.out.println("Iterating through the map entries:");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }


        

    // 



    }

}
