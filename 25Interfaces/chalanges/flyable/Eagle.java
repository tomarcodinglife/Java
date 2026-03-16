package flyable;

public class Eagle extends Bird {

    public Eagle(String breed) {
        super(breed);
    }
    

    @Override
    public void fly() {
        System.out.println("The eagle is flying high in the sky!");
    }



    
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Bald Eagle");
        System.out.println("The breed of the eagle is: " + eagle.getBreed());
        eagle.fly();



    }
    
}
