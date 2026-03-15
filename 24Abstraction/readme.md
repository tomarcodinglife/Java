# ☕ Java Lesson – Abstraction, Abstract Class & Abstract Method

Is lesson me hum seekhenge:

- Abstraction kya hota hai
- Abstract class kya hoti hai
- Abstract method kya hoti hai
- Abstract method declaration
- Abstract method subclass me implement kaise hota hai
- extend keyword
- super constructor

---

# 1️⃣ Abstraction Kya Hai?

Abstraction ka matlab hota hai:

```
Important cheezein dikhana
aur implementation details hide karna
```

Real life example:

```
Car drive karte waqt aapko sirf steering,
brake aur accelerator pata hota hai.

Engine andar kaise kaam karta hai
ye hide hota hai.
```

Java me abstraction achieve hota hai:

```
1. Abstract Class
2. Interface
```

Is lesson me hum **Abstract Class** par focus karenge.

---

# 2️⃣ Abstract Class Kya Hoti Hai?

Abstract class wo class hoti hai:

```
jise object bana kar directly use nahi kar sakte
```

Iska purpose hota hai:

```
base class provide karna
jise subclasses extend kar sake
```

### Syntax

```java
abstract class Animal {

}
```

Example

```java
abstract class Animal {

    void eat(){
        System.out.println("Animal is eating");
    }
}
```

---

# 3️⃣ Abstract Method Kya Hoti Hai?

Abstract method:

```
method jiska body nahi hota
sirf declaration hota hai
```

### Syntax

```java
abstract returnType methodName();
```

Example

```java
abstract class Animal {

    abstract void makeSound();

}
```

Yahan `makeSound()` ka implementation nahi hai.

---

# 4️⃣ Abstract Method Declaration

Example:

```java
abstract class Vehicle {

    abstract void startEngine();

}
```

Yahan sirf method declare hua hai:

```
abstract void startEngine();
```

Implementation subclass karegi.

---

# 5️⃣ Abstract Method Implementation by Subclass

Jo class **abstract class ko extend karegi** usse abstract methods implement karne padte hain.

Example

```java
abstract class Animal {

    abstract void sound();

}

class Dog extends Animal {

    void sound(){
        System.out.println("Dog barks");
    }
}

public class Test {

    public static void main(String[] args){

        Dog d = new Dog();
        d.sound();
    }
}
```

Output

```
Dog barks
```

---

# 6️⃣ extend Keyword

`extends` keyword use hota hai:

```
inheritance ke liye
```

Example

```java
class Dog extends Animal {

}
```

Matlab:

```
Dog class Animal class ke properties inherit karegi
```

---

# 7️⃣ Super Constructor

`super` keyword use hota hai:

```
parent class constructor call karne ke liye
```

Example

```java
class Animal {

    Animal(){
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {

    Dog(){
        super();
        System.out.println("Dog Constructor");
    }
}

public class Test {

    public static void main(String[] args){

        Dog d = new Dog();

    }
}
```

Output

```
Animal Constructor
Dog Constructor
```

---

# 8️⃣ Abstract Class + Constructor Example

Abstract class me constructor ho sakta hai.

Example

```java
abstract class Vehicle {

    Vehicle(){
        System.out.println("Vehicle Constructor");
    }

    abstract void start();
}

class Car extends Vehicle {

    void start(){
        System.out.println("Car starting");
    }
}

public class Test {

    public static void main(String[] args){

        Car c = new Car();
        c.start();
    }
}
```

Output

```
Vehicle Constructor
Car starting
```

---

# 9️⃣ Important Rules of Abstract Class

✔ Abstract class ka object nahi bana sakte  

❌

```
Animal a = new Animal();  // error
```

✔ Abstract class me:

```
abstract methods
normal methods
variables
constructors
```

sab ho sakte hain.

✔ Agar class abstract method declare karti hai to class ko bhi **abstract** declare karna padega.

---

# 10️⃣ Abstract Class Structure

General structure:

```
abstract class Parent {

    constructor

    abstract method

    normal method
}

class Child extends Parent {

    abstract method implementation
}
```

---

# 🎯 Interview Questions

1️⃣ Abstraction kya hota hai?  
2️⃣ Abstract class aur interface me difference kya hai?  
3️⃣ Abstract method kya hoti hai?  
4️⃣ Abstract class ka object kyun nahi bana sakte?  
5️⃣ super keyword ka use kya hai?  
6️⃣ extends keyword ka use kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Abstraction concept  
✔ Abstract class  
✔ Abstract method  
✔ Abstract method declaration  
✔ Subclass me abstract method implementation  
✔ extends keyword  
✔ super constructor  

Abstraction Java me **code design aur flexibility improve karta hai** aur large software systems me bahut important concept hai.