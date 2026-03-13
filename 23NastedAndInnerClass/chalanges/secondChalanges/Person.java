package secondChalanges;

public class Person {
    protected String name;
    protected int age;

    public Person (String name, int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString(){
        final StringBuilder str = new StringBuilder();
        str.append("Name : ").append(name).append("\n");
        str.append("Age : ").append(age).append("\n");
        return str.toString();
    }

    // Implementing equals and hashCode based on name and age only

    /* 
    what i am doing here and why ?
    In the equals method, I am checking if the object is an instance of Person and then comparing the name and age fields to determine equality. I am not including the id field in the equality check because it is not relevant for determining if two Person objects are considered equal in this context.  
    */

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Person)) {
            return false;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return name.equals(person.name) && age == person.age ;
    }

    /*
    what i am doing here and why ?
    In the hashCode method, I am generating a hash code based on the name and age fields only. I am not including the id field in the hash code calculation because it is not relevant for determining the hash code of a Person object in this context. By using only the name and age fields, I ensure that two Person objects that are considered equal according to the equals method will also have the same hash code, which is important for maintaining the contract between equals and hashCode.   
    */

    @Override
    public int hashCode(){
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }




}
