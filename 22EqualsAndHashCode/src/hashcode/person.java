package hashcode;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person (String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        final StringBuilder str = new StringBuilder();
        str.append("Name : ").append(name).append("\n");
        str.append("Age : ").append(age).append("\n");
        str.append("ID : ").append(id).append("\n");
        return str.toString();
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Person)) {
            return false;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return name.equals(person.name) && age == person.age && id == person.id ;
    }


}
