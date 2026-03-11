# ☕ Java Lesson – Getter & Setter Methods

Is lesson me hum seekhenge:

- Getter aur Setter kya hote hain
- Encapsulation ka use
- Syntax aur implementation
- Examples ke saath practical usage

---

# 📌 Encapsulation

- **Encapsulation** = Object ke data ko protect karna  
- Variables ko **private** banate hain aur access ke liye **public methods** use karte hain  
- Getter = variable ka value return karne ke liye  
- Setter = variable ka value set/update karne ke liye  

---

# 📌 Syntax

```java
class ClassName {
    private dataType variable;

    // Getter
    public dataType getVariable(){
        return variable;
    }

    // Setter
    public void setVariable(dataType variable){
        this.variable = variable;
    }
}
```

---

# 📌 Example – Basic Getter & Setter

```java
public class Student {

    private String name;
    private int age;

    // Getter for name
    public String getName(){
        return name;
    }

    // Setter for name
    public void setName(String name){
        this.name = name;
    }

    // Getter for age
    public int getAge(){
        return age;
    }

    // Setter for age
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args){
        Student s = new Student();

        // Setting values using setter
        s.setName("Sujit");
        s.setAge(22);

        // Getting values using getter
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
```

Output:

```
Name: Sujit
Age: 22
```

---

# 📌 Example – Validation using Setter

```java
public class Employee {

    private int salary;

    // Getter
    public int getSalary(){
        return salary;
    }

    // Setter with validation
    public void setSalary(int salary){
        if(salary > 0){
            this.salary = salary;
        } else{
            System.out.println("Invalid salary value");
        }
    }

    public static void main(String[] args){
        Employee e = new Employee();

        e.setSalary(50000); // valid
        System.out.println("Salary: " + e.getSalary());

        e.setSalary(-2000); // invalid
        System.out.println("Salary: " + e.getSalary());
    }
}
```

Output:

```
Salary: 50000
Invalid salary value
Salary: 50000
```

---

# ⚡ Important Points

- **Getter** → variable ka value read karne ke liye  
- **Setter** → variable ka value set/update karne ke liye  
- Encapsulation → **data hiding + validation**  
- Variables ko **private**, methods ko **public** banate hain  
- `this` keyword → current object ka reference  

---

# 🎯 Interview Questions

1️⃣ Getter aur Setter kya hote hain?  
2️⃣ Encapsulation ka purpose kya hai?  
3️⃣ `this` keyword ka use setter me kyun hota hai?  
4️⃣ Validation ke liye setter kaise use karenge?  
5️⃣ Private variable ka direct access kyun nahi hota?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Encapsulation kya hota hai  
✔ Getter aur Setter ka syntax aur usage  
✔ Data hiding aur validation ka implementation  
✔ Practical examples ke saath object data access  

Getter & Setter **Java me secure aur controlled access provide karte hain aur OOP ka fundamental concept hai**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Static Keyword  
- Static Variables, Methods, Blocks  
- Final Keyword revisited  
- Constant and shared resources