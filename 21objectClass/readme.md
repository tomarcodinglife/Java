# ☕ Java Lesson – Objects, Predefined Objects, super, toString, import & package

Is lesson me hum seekhenge:

- Java Objects
- Predefined Objects
- `super` keyword usage
- `toString()` method override
- `import` & `package` usage
- Examples ke saath implementation

---

# 1️⃣ Java Objects

- **Object** = real-world entity ka representation  
- Java me **class** blueprint hoti hai, **object** class ka instance  
- Object me **state (variables)** aur **behavior (methods)** hota hai  

### Syntax – Object Creation

```java
class Car {
    String model;
    int price;

    void display(){
        System.out.println("Model: " + model + ", Price: " + price);
    }
}

public class ObjectExample {
    public static void main(String[] args){
        Car c1 = new Car(); // Object creation
        c1.model = "Honda City";
        c1.price = 1200000;
        c1.display();
    }
}
```

Output:

```
Model: Honda City, Price: 1200000
```

---

# 2️⃣ Predefined Objects in Java

- Java me kuch **predefined objects** available hote hain  
- Common predefined objects:

| Object | Package       | Use                                         |
|--------|---------------|---------------------------------------------|
| `System` | java.lang   | Standard input, output, error               |
| `Scanner` | java.util  | User input                                  |
| `Math`  | java.lang    | Mathematical operations                     |
| `String`| java.lang    | Text handling                               |

### Example – Predefined Object

```java
import java.util.Scanner;

public class PredefinedObjectExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // predefined object
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hi " + name);
    }
}
```

---

# 3️⃣ `super` Keyword

- `super` = parent class ka reference  
- Use:
  - Parent class ka **variable access**
  - Parent class ka **method call**
  - Parent class ka **constructor call**

### Example – super with method

```java
class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat(){
        System.out.println("Dog is eating");
    }

    void show(){
        eat();       // Dog's eat()
        super.eat(); // Animal's eat()
    }
}

public class SuperExample {
    public static void main(String[] args){
        Dog d = new Dog();
        d.show();
    }
}
```

Output:

```
Dog is eating
Animal is eating
```

---

# 4️⃣ `toString()` Method Override

- `toString()` → object ka **string representation return karta hai**  
- Default `toString()` → className + hashcode  
- Custom class me override karke meaningful output de sakte hain

### Example – toString() Override

```java
class Student {
    String name;
    int age;

    Student(String n, int a){
        name = n;
        age = a;
    }

    @Override
    public String toString(){
        return "Student Name: " + name + ", Age: " + age;
    }
}

public class ToStringExample {
    public static void main(String[] args){
        Student s = new Student("Sujit", 22);
        System.out.println(s); // Automatically calls toString()
    }
}
```

Output:

```
Student Name: Sujit, Age: 22
```

---

# 5️⃣ Import & Package Usage

- **Package** = folder of classes  
- **Import** = dusre package ki classes use karne ke liye  

### Example – Package & Import

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

- **Object** → class ka instance  
- **Predefined Objects** → Scanner, System, Math, String  
- **`super` keyword** → parent class ka reference  
- **`toString()`** → object representation, override for custom output  
- **Package** → organize classes, **import** → access classes from package  

---

# 🎯 Interview Questions

1️⃣ Object aur Class me difference kya hai?  
2️⃣ Predefined objects ka example de sakte ho?  
3️⃣ `super` keyword ka use kaise hota hai?  
4️⃣ `toString()` method override ka importance kya hai?  
5️⃣ Java me package aur import ka use kyu karte hain?  

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Java Objects aur unke creation  
✔ Predefined objects jaise System, Scanner, Math  
✔ `super` keyword usage (methods, variables, constructors)  
✔ `toString()` override for custom object output  
✔ Package aur import ke examples aur syntax  

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Polymorphism  
- Compile-time (Method Overloading)  
- Runtime (Method Overriding)  
- Abstract class & Interface