# ☕ Java Lesson – Interface, Implements, Extend & Abstract Class

Is lesson me hum seekhenge:

- Interface kya hota hai
- Interface me method declaration
- Subclass me method body implement karna
- implements keyword
- extends keyword
- Interface aur Abstract Class ka relation
- Interface + Abstract Class example

---

# 1️⃣ Interface Kya Hota Hai?

Interface ek **fully abstract blueprint** hota hai.

Iska use hota hai:

```
100% abstraction achieve karne ke liye
```

Interface me normally hota hai:

```
method declaration
constants
```

Interface me methods by default:

```
public abstract
```

---

# 2️⃣ Interface Syntax

```java
interface Animal {

    void sound();

}
```

Ye actually internally hota hai:

```java
interface Animal {

    public abstract void sound();

}
```

---

# 3️⃣ Method Declaration in Interface

Interface me method **sirf declare hota hai**, body nahi hoti.

Example

```java
interface Vehicle {

    void start();

    void stop();

}
```

Yahan:

```
start()
stop()
```

sirf declare hue hain.

---

# 4️⃣ Sub Class me Method Body

Interface ko **implement karne wali class** me methods ki body likhni padti hai.

Example

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound(){
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

# 5️⃣ implements Keyword

`implements` keyword use hota hai:

```
interface ko implement karne ke liye
```

Example

```java
class Dog implements Animal
```

Matlab:

```
Dog class Animal interface ke methods implement karegi
```

---

# 6️⃣ extend Keyword (Interface)

Interface bhi **dusre interface ko extend kar sakta hai**.

Example

```java
interface Animal {

    void eat();

}

interface Dog extends Animal {

    void bark();

}
```

Ab Dog interface me:

```
eat()
bark()
```

dono methods honge.

---

# 7️⃣ Abstract Class + Interface

Abstract class aur interface **saath me use ho sakte hain**.

Example

```
Interface → method rules define karta hai
Abstract class → partial implementation deta hai
Subclass → final implementation deta hai
```

---

# 8️⃣ Interface + Abstract Class Example

Example

```java
interface Vehicle {

    void start();

}

abstract class Car implements Vehicle {

    void fuelType(){
        System.out.println("Petrol Car");
    }
}

class BMW extends Car {

    public void start(){
        System.out.println("BMW Starting");
    }

}

public class Test {

    public static void main(String[] args){

        BMW car = new BMW();

        car.start();
        car.fuelType();

    }
}
```

Output

```
BMW Starting
Petrol Car
```

Explanation:

```
Interface → start() declare
Abstract Class → fuelType() implement
Subclass → start() implement
```

---

# 9️⃣ Interface Rules

✔ Interface ka object directly nahi bana sakte

❌

```
Vehicle v = new Vehicle(); // error
```

✔ Interface methods by default:

```
public abstract
```

✔ Interface variables by default:

```
public static final
```

Example

```java
interface Test {

    int number = 10;

}
```

---

# 🔟 Interface Structure

General structure:

```
interface InterfaceName {

    method declaration

}

abstract class Parent implements InterfaceName {

}

class Child extends Parent {

    method implementation

}
```

---

# 🎯 Interview Questions

1️⃣ Interface kya hota hai?  
2️⃣ Interface aur abstract class me difference kya hai?  
3️⃣ implements keyword ka use kya hai?  
4️⃣ Interface method body kaha likhte hain?  
5️⃣ Interface interface ko kaise extend karta hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Interface concept  
✔ Interface method declaration  
✔ Subclass me method implementation  
✔ implements keyword  
✔ extends keyword  
✔ Interface + Abstract class relation  

Interface Java me **loose coupling aur abstraction achieve karne ke liye bahut important concept hai**.