# ☕ Java Lesson – Executor in Multithreading (Thread Pool)

Is lesson me hum seekhenge:

- Executor ka role multithreading me
- Thread Pool kya hota hai
- Multiple threads ka use
- Practical examples
- Performance benefits

---

# 1️⃣ Executor in Multithreading Kya Hota Hai?

Executor ka use hota hai:

```
multiple threads ko efficiently manage karne ke liye
```

Instead of:

```
har baar new Thread create karna ❌
```

Use:

```
thread pool reuse ✔
```

---

# 2️⃣ Thread Pool Kya Hota Hai?

Thread Pool:

```
threads ka ek group hota hai jo tasks execute karta hai
```

✔ thread reuse hota hai  
✔ performance better hoti hai  

---

# 3️⃣ Fixed Thread Pool (Most Common)

```java
ExecutorService executor = Executors.newFixedThreadPool(3);
```

✔ max 3 threads ek time par run honge  

---

# 4️⃣ Multi-thread Execution Example

```java
import java.util.concurrent.*;

class Test {

    public static void main(String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i = 1; i <= 6; i++){

            int taskId = i;

            executor.execute(() -> {
                System.out.println("Task " + taskId +
                    " running on " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
```

---

# 5️⃣ Output Behavior

```
3 threads ek time par kaam karenge
baaki tasks queue me wait karenge
```

---

# 6️⃣ Thread Pool Working

```
Tasks → Queue → Available Thread → Execution
```

---

# 7️⃣ Cached Thread Pool

```java
ExecutorService executor = Executors.newCachedThreadPool();
```

✔ dynamic threads create karta hai  
✔ fast but risky (too many threads)

---

# 8️⃣ Scheduled Thread Pool

```java
ExecutorService executor = Executors.newScheduledThreadPool(2);
```

✔ delay ya periodic tasks ke liye  

---

# 9️⃣ Example – Delay Execution

```java
ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

executor.schedule(() -> {
    System.out.println("Task after 2 sec");
}, 2, TimeUnit.SECONDS);
```

---

# 🔟 Runnable Task Example

```java
Runnable task = () -> {
    System.out.println("Task running");
};

executor.execute(task);
```

---

# 1️⃣1️⃣ Callable + Future (Multithread)

```java
Callable<Integer> task = () -> {
    return 100;
};

Future<Integer> result = executor.submit(task);

System.out.println(result.get());
```

---

# 1️⃣2️⃣ Advantages of Executor in Multithreading

✔ thread reuse  
✔ better CPU utilization  
✔ scalable system  
✔ less memory overhead  

---

# 1️⃣3️⃣ Important Points

✔ Thread creation expensive hota hai  
✔ Executor reuse karta hai threads  
✔ always shutdown executor  

---

# 1️⃣4️⃣ Real-Life Analogy

```
Restaurant kitchen:
Chefs (threads) fix hain
Orders (tasks) queue me aate hain
```

---

# 🎯 Interview Questions

1. Thread pool kya hota hai?
2. Fixed thread pool ka use kya hai?
3. Executor vs Thread difference?
4. Cached thread pool kab use karte hain?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Executor in multithreading  
✔ Thread pool concept  
✔ Fixed, cached, scheduled pools  
✔ Practical execution  

Executor multithreading me **efficient, scalable aur optimized execution** provide karta hai.