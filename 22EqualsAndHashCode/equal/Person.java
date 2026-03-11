package 22EqualsAndHashCode.equal.Person;

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


}
