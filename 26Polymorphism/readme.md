# ☕ Java Lesson – Polymorphism (Compile-Time & Run-Time)

Is lesson me hum seekhenge:

- Polymorphism kya hota hai
- Method Overloading
- Method Overriding
- Compile-time polymorphism
- Run-time polymorphism
- Upcasting ka role polymorphism me

---

# 1️⃣ Polymorphism Kya Hota Hai?

Polymorphism ka matlab:

```
Ek hi cheez ka multiple forms me behave karna
```

Java me:

```
Ek method alag-alag situations me different behavior dikha sakta hai
```

Real life example:

```
Ek aadmi:
Student bhi ho sakta hai
Teacher bhi
Employee bhi

Same person → multiple roles
```

---

# 2️⃣ Java me Polymorphism ke Types

Java me polymorphism 2 tarah ka hota hai:

```
1. Compile-time Polymorphism
2. Run-time Polymorphism
```

---

# 3️⃣ Compile-Time Polymorphism

Isse kehte hain:

```
Method Overloading
```

Yahan method ka decision **compile time par** hota hai.

---

# 4️⃣ Method Overloading

Jab ek hi class me same method name ho lekin:

```
parameters different ho
```

Example:

```java
class MathUtils {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}
```

Usage:

```java
public class Test {

    public static void main(String[] args){

        MathUtils m = new MathUtils();

        System.out.println(m.add(2,3));
        System.out.println(m.add(2,3,4));
    }
}
```

Output

```
5
9
```

---

# 5️⃣ Run-Time Polymorphism

Isse kehte hain:

```
Method Overriding
```

Yahan decision **run time par** hota hai.

---

# 6️⃣ Method Overriding

Jab child class parent class ke method ko same signature ke saath redefine kare.

Example:

```java
class Animal {

    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void sound(){
        System.out.println("Dog barks");
    }
}
```

---

# 7️⃣ Runtime Polymorphism Example

```java
public class Test {

    public static void main(String[] args){

        Animal a = new Dog(); // upcasting

        a.sound(); // run-time decision
    }
}
```

Output

```
Dog barks
```

Yahan:

```
reference → Animal
object → Dog
```

Phir bhi Dog ka method call hua.

Isko kehte hain:

```
Dynamic Method Dispatch
```

---

# 8️⃣ Compile-time vs Run-time Polymorphism

| Feature | Compile-time | Run-time |
|--------|--------------|----------|
| Concept | Overloading | Overriding |
| Decision time | Compile time | Run time |
| Inheritance required | ❌ No | ✔ Yes |
| Performance | Fast | Slightly slow |

---

# 9️⃣ Rules of Method Overriding

✔ Method name same hona chahiye  
✔ Parameters same hone chahiye  
✔ Return type same ya covariant hona chahiye  
✔ Access modifier same ya more public hona chahiye  

---

# 🔟 Example – Overloading vs Overriding

```java
class Shape {

    void draw(){
        System.out.println("Drawing shape");
    }

    void draw(String color){
        System.out.println("Drawing shape in " + color);
    }
}

class Circle extends Shape {

    @Override
    void draw(){
        System.out.println("Drawing circle");
    }
}
```

---

# 1️⃣1️⃣ Polymorphism + Object Array Example

```java
class Animal {

    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    void sound(){
        System.out.println("Cat meows");
    }
}

public class Test {

    public static void main(String[] args){

        Animal[] animals = {
            new Dog(),
            new Cat()
        };

        for(Animal a : animals){
            a.sound();
        }
    }
}
```

Output

```
Dog barks
Cat meows
```

---

# 1️⃣2️⃣ Polymorphism Ka Real Use """

Use hota hai:

```
framework design
collections
dynamic behavior
clean architecture
```

Example:

```
List list = new ArrayList();
List list = new LinkedList();
```

Same reference → different implementation.

---

# 🎯 Interview Questions

1️⃣ Polymorphism kya hota hai?  
2️⃣ Compile-time aur run-time polymorphism me difference kya hai?  
3️⃣ Method overloading aur overriding me difference kya hai?  
4️⃣ Dynamic method dispatch kya hota hai?  
5️⃣ Upcasting polymorphism me kaise help karta hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Polymorphism concept  
✔ Compile-time polymorphism (Overloading)  
✔ Run-time polymorphism (Overriding)  
✔ Dynamic method dispatch  
✔ Real-world usage  

Polymorphism Java OOP ka sabse powerful feature hai jo **flexible aur extensible code** likhne me help karta hai.