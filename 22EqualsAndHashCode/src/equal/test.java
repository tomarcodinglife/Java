package equal;

// import java.time.Period;

public class test {
    
    public static void main(String[] args) {
        Person firstPerson = new Person("Amit", 24, 1252);
        Person secondPerson = new Person("Amit", 24, 1252);


        System.out.println(firstPerson);
        System.out.println(secondPerson);

        // This will print different because both the objects are different in memory
        if (firstPerson == secondPerson) {
            System.out.println("Both the objects are same");
        }else{
            System.out.println("Both the objects are different");
        }

        // Now this will print same because we have overridden the equals method in Person class to compare the values of the objects instead of their memory addresses
        if (firstPerson.equals(secondPerson)) {
            System.out.println("Both the objects are same");
        }else{
            System.out.println("Both the objects are different");
        }   

        

    }


}
