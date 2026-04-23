# ☕ Java Lesson – Executor Returning Future in Java

Is lesson me hum seekhenge:

- Future kya hota hai
- Executor ka result kaise return hota hai
- Callable vs Runnable
- Future methods
- Practical examples

---

# 1️⃣ Problem – Runnable Limitation

Runnable me:

```
return value nahi hoti ❌
```

Example:

```java
Runnable task = () -> {
    System.out.println("Task done");
};
```

👉 result return nahi hota

---

# 2️⃣ Solution – Callable

Callable use karte hain:

```
jab result return karna ho ✔
```

---

# 3️⃣ Callable Interface

```java
Callable<Integer> task = () -> {
    return 10 + 20;
};
```

✔ return value hoti hai  
✔ exception throw kar sakta hai  

---

# 4️⃣ Future Kya Hota Hai?

Future ek object hai jo:

```
future result ko represent karta hai
```

👉 matlab:

```
result baad me milega
```

---

# 5️⃣ Basic Example (Executor + Future)

```java
import java.util.concurrent.*;

class Test {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 50;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Task submitted...");

        int result = future.get(); // wait karega

        System.out.println("Result: " + result);

        executor.shutdown();
    }
}
```

---

# 6️⃣ Flow Samjho

```
submit() → Future milega
Future → get() → result milega
```

---

# 7️⃣ Future Important Methods

| Method | Use |
|-------|-----|
| get() | result lena |
| isDone() | check complete |
| cancel() | task cancel |
| isCancelled() | cancel check |

---

# 8️⃣ Non-Blocking Check Example

```java
while(!future.isDone()){
    System.out.println("Waiting...");
}

System.out.println(future.get());
```

---

# 9️⃣ Multiple Tasks Example

```java
ExecutorService executor = Executors.newFixedThreadPool(2);

Callable<Integer> task1 = () -> 10;
Callable<Integer> task2 = () -> 20;

Future<Integer> f1 = executor.submit(task1);
Future<Integer> f2 = executor.submit(task2);

System.out.println(f1.get() + f2.get());

executor.shutdown();
```

---

# 🔟 Difference – Runnable vs Callable

| Feature | Runnable | Callable |
|--------|---------|----------|
| Return | ❌ No | ✔ Yes |
| Exception | ❌ No | ✔ Yes |
| Use | execute() | submit() |

---

# 1️⃣1️⃣ Blocking Nature ⚠

```java
future.get();
```

✔ wait karta hai jab tak result ready na ho  

---

# 1️⃣2️⃣ Real-Life Analogy

```
Food order:
order diya → Future
food ready → get()
```

---

# 1️⃣3️⃣ Important Points

✔ Callable result return karta hai  
✔ Future async result handle karta hai  
✔ get() blocking hota hai  
✔ always executor shutdown karo  

---

# 🎯 Interview Questions

1. Future kya hota hai?
2. Runnable vs Callable difference?
3. future.get() blocking kyun hota hai?
4. Future cancel kaise karte hain?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Future concept  
✔ Callable usage  
✔ Executor + Future flow  
✔ Async result handling  

Executor + Future Java me **asynchronous programming ka powerful combination** hai.