# ☕ Java Lesson – Functional Interface in Java

Is lesson me hum seekhenge:

- Functional Interface kya hota hai
- Lambda ke saath relation
- @FunctionalInterface annotation
- Built-in Functional Interfaces
- Real examples

---

# 1️⃣ Functional Interface Kya Hota Hai?

Functional Interface ka matlab:

```
aise interface jisme sirf ek abstract method hota hai
```

---

# 2️⃣ Example

```java
interface MyInterface {
    void show();
}
```

✔ sirf ek abstract method → valid functional interface  

---

# 3️⃣ Lambda se Relation

Functional interface ko use karte hain:

```
lambda expression ke saath
```

Example:

```java
MyInterface obj = () -> {
    System.out.println("Hello");
};

obj.show();
```

---

# 4️⃣ @FunctionalInterface Annotation

```java
@FunctionalInterface
interface MyInterface {
    void show();
}
```

✔ compile-time check karta hai  
✔ ensure karta hai sirf 1 abstract method ho  

---

# 5️⃣ Invalid Example ❌

```java
interface Test {
    void m1();
    void m2(); // error
}
```

---

# 6️⃣ Default & Static Methods Allowed

```java
interface Test {

    void show(); // abstract

    default void display(){
        System.out.println("Default method");
    }

    static void print(){
        System.out.println("Static method");
    }
}
```

✔ allowed hai  
✔ count nahi hote abstract methods me  

---

# 7️⃣ Built-in Functional Interfaces

Java me already ready interfaces hote hain:

---

## 🔸 Predicate

```java
Predicate<Integer> isEven = n -> n % 2 == 0;

System.out.println(isEven.test(4));
```

---

## 🔸 Function

```java
Function<Integer, Integer> square = x -> x * x;

System.out.println(square.apply(5));
```

---

## 🔸 Consumer

```java
Consumer<String> print = s -> System.out.println(s);

print.accept("Hello");
```

---

## 🔸 Supplier

```java
Supplier<Integer> random = () -> 100;

System.out.println(random.get());
```

---

# 8️⃣ Custom Functional Interface Example

```java
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
```

Use:

```java
Calculator c = (a, b) -> a + b;

System.out.println(c.add(10, 20));
```

---

# 9️⃣ Real-Life Example

```
Button click listener
event handling
```

---

# 🔟 Important Rules

✔ sirf ek abstract method hona chahiye  
✔ lambda ke saath use hota hai  
✔ default & static allowed  

---

# 1️⃣1️⃣ Advantages

✔ code short hota hai  
✔ readable hota hai  
✔ functional programming support  

---

# 🎯 Interview Questions

1. Functional interface kya hota hai?
2. @FunctionalInterface annotation ka use kya hai?
3. kya multiple methods allowed hain?
4. lambda ka relation kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Functional Interface concept  
✔ Lambda relation  
✔ Built-in interfaces  
✔ Custom examples  

Functional Interface Java me **lambda expressions ka backbone** hota hai.