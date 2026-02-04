
public class TestClasses {
    // instense 
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    // method

    public void drive(){
        System.out.print("Car is Driving");
    }

    public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    }

    public float getCurrectFuelLevel(){
        return currentFuelInLiters; 
    }
    
}