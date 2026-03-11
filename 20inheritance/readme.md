# ☕ Java Lesson – Inheritance

Is lesson me hum seekhenge:

- Inheritance kya hai
- Types of inheritance
- Syntax aur keywords
- Superclass aur Subclass
- Method overriding
- Example programs

---

# 📌 Inheritance Kya Hai?

- Inheritance = **ek class ka dusre class se properties aur methods inherit karna**  
- Reusability aur maintainability improve hoti hai  
- Parent class = **Superclass**, Child class = **Subclass**  

### Syntax

```java
class SuperClass {
    // members
}

class SubClass extends SuperClass {
    // members of SubClass + inherited members
}
```

---

# 📌 Types of Inheritance in Java

1. **Single Inheritance** – Ek parent aur ek child class  
2. **Multilevel Inheritance** – Chain of classes  
3. **Hierarchical Inheritance** – Ek parent multiple child classes  
4. **Multiple Inheritance** – Java me **class ke liye direct multiple inheritance nahi hota**, interface se possible  

---

# 1️⃣ Example – Single Inheritance

```java
class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();  // inherited method
        d.bark(); // own method
    }
}
```

Output:

```
Animal is eating
Dog is barking
```

---

# 2️⃣ Example – Multilevel Inheritance

```java
class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void weep(){
        System.out.println("Puppy is weeping");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args){
        Puppy p = new Puppy();
        p.eat();  // inherited from Animal
        p.bark(); // inherited from Dog
        p.weep(); // own method
    }
}
```

Output:

```
Animal is eating
Dog is barking
Puppy is weeping
```

---

# 3️⃣ Example – Hierarchical Inheritance

```java
class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow(){
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
```

Output:

```
Animal is eating
Dog is barking
Animal is eating
Cat is meowing
```

---

# 4️⃣ Super Keyword

- `super` → parent class ka reference  
- Use: access parent class **members/methods/constructor**  

### Example – Super Keyword

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

# 5️⃣ Method Overriding

- Subclass me **parent class method ko redefine** karna  
- Same method name, same parameters  

### Example – Method Overriding

```java
class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args){
        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();
    }
}
```

Output:

```
Animal makes sound
Dog barks
```

---

# ⚡ Important Points

- **Inheritance** = code reuse aur hierarchical relationship  
- **`extends` keyword** = class inheritance  
- **`super` keyword** = parent class reference  
- **Method overriding** = runtime polymorphism  
- Multiple inheritance with **classes nahi, interfaces ke saath possible**  

---

# 🎯 Interview Questions

1️⃣ Inheritance kya hai aur use kyun karte hain?  
2️⃣ Java me multiple inheritance kaise possible hai?  
3️⃣ `super` keyword ka use kya hai?  
4️⃣ Method overriding aur overloading me difference kya hai?  
5️⃣ Single, Multilevel, Hierarchical inheritance ka example de sakte hain?  

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Inheritance ka concept aur importance  
✔ Single, Multilevel, Hierarchical inheritance  
✔ `super` keyword ka use  
✔ Method overriding ka example  
✔ OOP me code reusability aur hierarchy  

Inheritance **Java me OOP ka fundamental pillar hai** aur large programs me structure aur maintainability improve karta hai.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Polymorphism  
- Compile-time & Runtime Polymorphism  
- Method Overloading  
- Method Overriding detailed  
- Constructor Overloading