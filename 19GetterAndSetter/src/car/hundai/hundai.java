package car.hundai;
import car.carMethod.*;

public class hundai {
    
    public static void main(String[] args) {
        
        // // Obeject Create with Private in different package not working
        // CarMethodPrivate Creta = new CarMethodPrivate("Creta E", "Hundai", 2023, 7);
        // System.out.println(Creta);

        // // Object Create with Default in different package not working
        // CarMethodDefault Verna = new CarMethodDefault("Verna X", "Hunadi", 2023, 5);
        // System.out.println(Verna);

        //Object Create with public in different package its working
        CarMethodPublic Volkswagen = new CarMethodPublic("Taigun Comfortline",  "Hundai",   2025, 5);
        System.out.println(Volkswagen);
    }


}
