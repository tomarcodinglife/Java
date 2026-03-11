# ☕ Java Lesson – Java Objects, Predefined Methods, super, toString, import & package

Is lesson me hum seekhenge:

- Java Objects aur Object class
- Predefined Object Methods: `getClass()`, `hashCode()`, `wait()`, `notify()`, `notifyAll()`, `clone()`, `equals()`, `finalize()`, `toString()`
- `super` keyword usage
- `toString()` method override
- Import & Package usage
- Examples ke saath

---

# 1️⃣ Java Object Class

- Java me **har class Object class se inherit hoti hai**  
- Object class me kuch **predefined methods** hote hain jo sabhi objects ke liye available hain

### Common Object Methods

| Method          | Description |
|-----------------|------------|
| `getClass()`     | Object ka class info return karta hai |
| `hashCode()`     | Object ka hash code return karta hai |
| `toString()`     | Object ka string representation return karta hai |
| `equals(Object o)` | Object comparison (content based) |
| `clone()`        | Object ka shallow copy banata hai |
| `finalize()`     | Garbage collection se pehle call hota hai |
| `wait()`         | Thread ko wait state me dalta hai |
| `notify()`       | Waiting thread ko notify karta hai |
| `notifyAll()`    | Sab waiting threads ko notify karta hai |

---

# 2️⃣ Predefined Object Methods Example

```java
class Student implements Cloneable {
    String name;
    int age;

    Student(String n, int a){
        name = n;
        age = a;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " object is destroyed by GC");
    }
}

public class ObjectMethodsExample {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Sujit", 22);
        Student s2 = new Student("Rahul", 25);

        System.out.println(s1.toString());      // custom toString()
        System.out.println("s1 HashCode: " + s1.hashCode());
        System.out.println("s2 HashCode: " + s2.hashCode());
        System.out.println("s1 Class: " + s1.getClass());

        System.out.println("s1 equals s2? " + s1.equals(s2));

        Student s3 = (Student) s1.clone();     // clone()
        System.out.println("Cloned s3: " + s3);

        s1 = null;
        s2 = null;
        s3 = null;

        System.gc(); // finalize() call try
    }
}
```

Output (example, finalize may vary):

```
Name: Sujit, Age: 22
s1 HashCode: 366712642
s2 HashCode: 1829164700
s1 Class: class Student
s1 equals s2? false
Cloned s3: Name: Sujit, Age: 22
Sujit object is destroyed by GC
Rahul object is destroyed by GC
```

---

# 3️⃣ `super` Keyword Usage

- `super` = parent class ka reference  
- Parent class **variables**, **methods**, aur **constructor** access karne ke liye use hota hai  

```java
class Animal {
    String color = "White";
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    String color = "Black";

    void display(){
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);
        eat();
        super.eat();
    }
}

public class SuperKeywordExample {
    public static void main(String[] args){
        Dog d = new Dog();
        d.display();
    }
}
```

Output:

```
Dog color: Black
Animal color: White
Dog is eating
Animal is eating
```

---

# 4️⃣ `toString()` Method Override

- Object class ka `toString()` **default representation return karta hai**  
- Custom class me override karke meaningful string output create karte hain  

```java
class Employee {
    String name;
    int salary;

    Employee(String n, int s){
        name = n;
        salary = s;
    }

    @Override
    public String toString(){
        return "Employee: " + name + ", Salary: " + salary;
    }
}

public class ToStringOverrideExample {
    public static void main(String[] args){
        Employee e = new Employee("Sujit", 50000);
        System.out.println(e); // automatically calls toString()
    }
}
```

Output:

```
Employee: Sujit, Salary: 50000
```

---

# 5️⃣ Import & Package Usage

- **Package** → classes organize karne ke liye  
- **Import** → dusre package ki classes use karne ke liye  

### Example – User-defined Package

**File:** `mypackage/Hello.java`

```java
package mypackage;

public class Hello {
    public void show(){
        System.out.println("Hello from mypackage");
    }
}
```

**File:** `Main.java`

```java
import mypackage.Hello;

public class Main {
    public static void main(String[] args){
        Hello h = new Hello();
        h.show();
    }
}
```

Output:

```
Hello from mypackage
```

---

# ⚡ Important Points

- Object class ke **predefined methods** → getClass(), hashCode(), equals(), clone(), toString(), finalize(), wait(), notify(), notifyAll()  
- **super keyword** → parent class ka reference  
- **toString() override** → meaningful object representation  
- **import & package** → classes ka organization aur reuse  

---

# 🎯 Interview Questions

1️⃣ Object class ke common methods kya hain?  
2️⃣ `super` keyword ka use aur example batao  
3️⃣ `toString()` method override kyun karte hain?  
4️⃣ `clone()` aur `equals()` me difference kya hai?  
5️⃣ `finalize()` method kab call hota hai?  
6️⃣ `wait()`, `notify()`, `notifyAll()` ka basic use kya hai?  
7️⃣ Package aur import ka purpose kya hai?  

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Java Object class aur predefined methods  
✔ `getClass()`, `hashCode()`, `equals()`, `clone()`, `finalize()`, `toString()`, `wait()`, `notify()`, `notifyAll()`  
✔ `super` keyword usage  
✔ `toString()` method override  
✔ Import & Package usage  

Ye lesson **Java me OOP fundamentals, object methods aur package organization** ka complete reference hai.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Polymorphism  
- Compile-time & Runtime Polymorphism  
- Method Overloading & Overriding  
- Abstract Classes & Interface