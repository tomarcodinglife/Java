package EqualsAndHashCode.equal;

public class Equal {
    private String name;
    private int age;
    private int id;

    public Equal (String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;

    }

    public getName(){
        return name;
    }

    public getAge(){
        return age;
    }

    public getId(){
        return id
    }

    public setName(String name){
        this.name = name;
    }

    public setAge(int age){
        this.age = age;
    }

    public setId(int id){
        this.id = id;
    }

    @override
    public String toString(){
        final StringBuilder str = StringBuilder();
        str.append("Name : ").append(name).append("\n");
        str.append("Age : ").append(age).append("\n");
        str.append("ID : ").append(id).append("\n");
        return str.toString();
    }


}
