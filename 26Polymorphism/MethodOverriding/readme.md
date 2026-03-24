# ☕ Java Lesson – Method Overriding (Run-Time Polymorphism)

Is lesson me hum seekhenge:

- Method overriding kya hota hai
- Overriding ke rules
- Run-time polymorphism ka role
- super keyword ka use overriding me
- Overriding vs Overloading difference

---

# 1️⃣ Method Overriding Kya Hota Hai?

Jab child class parent class ke method ko:

```
same name + same parameters ke saath
```

redefine kare, use **Method Overriding** kehte hain.

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

# 2️⃣ Runtime Behavior

```java
public class Test {

    public static void main(String[] args){

        Animal a = new Dog(); // upcasting

        a.sound();
    }
}
```

Output

```
Dog barks
```

Yahan method call decide hota hai:

```
run time par
```

Isliye ise kehte hain:

```
Run-Time Polymorphism
```

---

# 3️⃣ Rules of Method Overriding

✔ Method name same hona chahiye  
✔ Parameters same hone chahiye  
✔ Return type same ya covariant hona chahiye  
✔ Access modifier same ya more public hona chahiye  

---

# 4️⃣ Access Modifier Rules

| Parent Method | Child Method Allowed |
|---------------|---------------------|
| public | public |
| protected | protected / public |
| default | default / protected / public |
| private | override nahi hota |

Example:

```java
class A {
    protected void show(){}
}

class B extends A {
    public void show(){}
}
```

---

# 5️⃣ super Keyword in Overriding

Agar child class parent method ko bhi call karna chahe:

```
super.methodName()
```

Example:

```java
class Animal {

    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void sound(){
        super.sound();
        System.out.println("Dog barks");
    }
}
```

Output

```
Animal sound
Dog barks
```

---

# 6️⃣ Overriding with Constructors

Constructors override nahi hote:

```
constructors inherit nahi hote
```

---

# 7️⃣ Overriding and final Keyword

Agar parent method final hai:

```
override nahi kar sakte
```

Example:

```java
class Animal {

    final void sound(){}
}

class Dog extends Animal {

    // void sound() {} ❌ error
}
```

---

# 8️⃣ @Override Annotation

`@Override` compiler ko batata hai ki:

```
ye method parent ko override kar raha hai
```

Example:

```java
class Dog extends Animal {

    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
```

Benefit:

```
compile-time error detection
```

---

# 9️⃣ Overriding vs Overloading

| Feature | Overriding | Overloading |
|--------|------------|------------|
| Location | Parent + Child | Same class |
| Parameters | Same | Different |
| Polymorphism | Run-time | Compile-time |

---

# 🔟 Real-Life Example

```java
class Shape {

    void draw(){
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {

    @Override
    void draw(){
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {

    @Override
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
```

Usage:

```java
Shape s1 = new Circle();
Shape s2 = new Rectangle();

s1.draw();
s2.draw();
```

---

# 1️⃣1️⃣ Dynamic Method Dispatch

Jab parent reference child object ko refer karta hai:

```
method call run-time par decide hota hai
```

Is process ko kehte hain:

```
Dynamic Method Dispatch
```

---

# 🎯 Interview Questions

1️⃣ Method overriding kya hota hai?  
2️⃣ Overriding aur overloading me difference kya hai?  
3️⃣ super keyword overriding me kaise use hota hai?  
4️⃣ final method override kyun nahi hoti?  
5️⃣ @Override annotation ka use kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Method overriding concept  
✔ Rules of overriding  
✔ Runtime polymorphism  
✔ super keyword use  
✔ @Override annotation  
✔ Overriding vs overloading  

Method overriding Java me **dynamic behavior aur extensibility** provide karta hai, jo OOP ka core concept hai.