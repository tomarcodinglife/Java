# ☕ Java Lesson – Single Thread Executor in Java

Is lesson me hum seekhenge:

- Single Thread Executor kya hota hai
- Kaise kaam karta hai
- Sequential execution
- Examples with Runnable & Callable
- Use cases

---

# 1️⃣ Single Thread Executor Kya Hota Hai?

Single Thread Executor:

```
sirf ek hi thread use karta hai sabhi tasks execute karne ke liye
```

---

# 2️⃣ Creation

```java
ExecutorService executor = Executors.newSingleThreadExecutor();
```

---

# 3️⃣ Working

```
Tasks → Queue → Single Thread → Execution (one by one)
```

✔ ek time par ek hi task run karega  
✔ next task wait karega  

---

# 4️⃣ Basic Example (Runnable)

```java
import java.util.concurrent.*;

class Test {

    public static void main(String[] args){

        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> {
            System.out.println("Task 1");
        });

        executor.execute(() -> {
            System.out.println("Task 2");
        });

        executor.execute(() -> {
            System.out.println("Task 3");
        });

        executor.shutdown();
    }
}
```

Output:

```
Task 1
Task 2
Task 3
```

---

# 5️⃣ Important Behavior

✔ tasks order maintain hota hai  
✔ FIFO follow hota hai  

---

# 6️⃣ Example with Delay

```java
executor.execute(() -> {
    try {
        Thread.sleep(1000);
    } catch(Exception e){}

    System.out.println("Delayed Task");
});
```

---

# 7️⃣ Callable + Future Example

```java
import java.util.concurrent.*;

class Test {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            return 100;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println(future.get());

        executor.shutdown();
    }
}
```

---

# 8️⃣ Why Use Single Thread Executor?

✔ thread creation avoid karta hai  
✔ sequential processing  
✔ thread safety without synchronization  

---

# 9️⃣ Real-Life Use Case

```
Database operations
File writing
Logging system
```

👉 jahan order important ho

---

# 🔟 Advantages

✔ simple aur predictable  
✔ race condition avoid hoti hai  
✔ easy debugging  

---

# 1️⃣1️⃣ Disadvantages

❌ parallel execution nahi hota  
❌ slow for heavy tasks  

---

# 1️⃣2️⃣ Important Points

✔ ek hi thread reuse hota hai  
✔ tasks queue me wait karte hain  
✔ always shutdown executor  

---

# 🎯 Interview Questions

1. Single Thread Executor kya hota hai?
2. kya ye FIFO follow karta hai?
3. isme race condition kyun nahi hoti?
4. kab use karte hain?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Single Thread Executor concept  
✔ Sequential execution  
✔ Runnable & Callable usage  
✔ Advantages aur use cases  

Single Thread Executor Java me **safe aur ordered task execution** ke liye best hai.