package Animal;

public class GunDogs extends Dog {


    public GunDogs(String name, int age, String breed, String color) {
        super(name, age, breed, color);
    }


    public static void main(String[] args) {
        GunDogs officeDog = new GunDogs ("Buddy", 3, "German Shepherd", "Brown");
        Dog homeDog = new Dog("Sheru", 5, "Labrador Retriever", "Yellow");

        // This line will cause an error because we cannot instantiate an abstract class
        // Animal dogAnimal = new Animal("Generic Animal", 3, 4); 

        officeDog.makeSound("hun nun nun");
        homeDog.makeSound("woof woof");
        // dogAnimal.makeSound("hunnn.......hunnnnnn....");

        officeDog.runAnimal();
        homeDog.runAnimal();

        

    }
    

}
