# ☕ Java Lesson – Lambda Expression in Java

Is lesson me hum seekhenge:

- Lambda Expression kya hota hai
- Syntax aur structure
- Functional Interface ke saath use
- Real examples
- Advantages

---

# 1️⃣ Lambda Expression Kya Hota Hai?

Lambda Expression ek:

```
anonymous function (naam ke bina function)
```

Use hota hai:

```
short aur clean code likhne ke liye
```

---

# 2️⃣ Syntax

```java
(parameters) -> expression
```

---

# 3️⃣ Basic Example

```java
(a, b) -> a + b
```

---

# 4️⃣ Without Lambda (Old Way)

```java
interface MyInterface {
    void show();
}

class Test {

    public static void main(String[] args){

        MyInterface obj = new MyInterface() {
            public void show(){
                System.out.println("Hello");
            }
        };

        obj.show();
    }
}
```

---

# 5️⃣ With Lambda (Modern Way)

```java
MyInterface obj = () -> {
    System.out.println("Hello");
};

obj.show();
```

✔ short  
✔ clean  

---

# 6️⃣ Functional Interface Required

✔ Lambda sirf tab use hota hai jab:

```
interface me ek hi abstract method ho
```

---

# 7️⃣ Parameter Variations

### No Parameter

```java
() -> System.out.println("Hello");
```

### Single Parameter

```java
x -> x * x
```

### Multiple Parameters

```java
(a, b) -> a + b
```

---

# 8️⃣ With Return

```java
(a, b) -> {
    return a + b;
}
```

---

# 9️⃣ With Single Line (Implicit Return)

```java
(a, b) -> a + b
```

---

# 🔟 Lambda with Collection

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4);

        list.forEach(n -> System.out.println(n));
    }
}
```

---

# 1️⃣1️⃣ Lambda with Comparator

```java
Collections.sort(list, (a, b) -> b - a);
```

---

# 1️⃣2️⃣ Lambda with Thread

```java
Thread t = new Thread(() -> {
    System.out.println("Thread running");
});

t.start();
```

---

# 1️⃣3️⃣ Advantages

✔ less code  
✔ readable code  
✔ functional programming support  
✔ no boilerplate code  

---

# 1️⃣4️⃣ Limitations

❌ multiple methods wale interface me use nahi hota  
❌ complex logic me readability kam ho sakti hai  

---

# 1️⃣5️⃣ Real-Life Example

```
event handling
sorting
filtering data
```

---

# 1️⃣6️⃣ Important Points

✔ Java 8 me introduce hua  
✔ functional interface ke saath use hota hai  
✔ method reference ka base hai  

---

# 🎯 Interview Questions

1. Lambda expression kya hota hai?
2. Functional interface kya hota hai?
3. Lambda vs anonymous class?
4. lambda ka syntax kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Lambda Expression concept  
✔ syntax aur usage  
✔ functional interface relation  
✔ real examples  

Lambda Expression Java me **modern aur concise coding style** provide karta hai.