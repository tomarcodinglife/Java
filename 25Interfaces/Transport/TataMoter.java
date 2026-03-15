package Transport;

public class TataMoter extends Car {
    private String model;

    public TataMoter(String vehicleType, String manufacturer, int manufacturingYear, int numberOfWheels, String color, String model) {
        super(vehicleType, manufacturer, manufacturingYear, numberOfWheels, color);
        this.model = model;
    }

    public static void main(String[] args) {
        TataMoter Safari = new TataMoter("SUV", "Tata Motors", 2022, 4, "White", "Safari");
        Safari.start();
        Safari.accelerate();
        Safari.brake();
        Safari.stop();

    }
    
}
