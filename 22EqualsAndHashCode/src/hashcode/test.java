package hashcode;

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

        /*
        This will print same because both the objects have same hashcode because we have overridden the hashcode method in Person class to generate the hashcode based on the values of the object instead of their memory addresses
        */ 

        if (firstPerson.hashCode() == secondPerson.hashCode()) {
            System.out.println("Both the objects have same hashcode");  
        }else{
            System.out.println("Both the objects have different hashcode");
        }

        /* 
        why we need to override both equals and hashcode method?
        If we only override the equals method and not the hashcode method, then the hashcode of both the objects will be different because the default hashcode method generates the hashcode based on the memory address of the object. So even if both the objects are equal according to the equals method, they will have different hashcodes and this can lead to unexpected behavior when we use these objects in collections like HashSet or HashMap which rely on hashcodes to store and retrieve objects efficiently.

        
        why we need to check hashcode before equals method?
        If we check the equals method before checking the hashcode, then it can lead to performance issues because the equals method can be expensive to execute, especially if the objects being compared have a lot of fields. By checking the hashcode first, we can quickly determine if the objects are not equal without having to execute the equals method, which can save time and improve performance. If the hashcodes are different, we can immediately conclude that the objects are not equal without needing to compare their fields.
        
        */

        // if hashcode is same then equals should return true because we have overridden the equals method to compare the values of the objects instead of their memory addresses
        if (firstPerson.hashCode() == secondPerson.hashCode() && firstPerson.equals(secondPerson)) {
            System.out.println("Both the objects are same and have same hashcode");
        }else{
            System.out.println("Both the objects are different or have different hashcode");
        }

    }

}
