package flyable;

public abstract class Bird implements Flyable {

    private final String Breed;

    public Bird(String breed) {
        this.Breed = breed;
    }

    public String getBreed(){
        return Breed;
    }

    // Setter method is not needed since Breed is final and cannot be changed after initialization

    // public void setBreed(String breed){
    //     this.Breed = breed;
    // }
    
}
