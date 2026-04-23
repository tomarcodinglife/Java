# ☕ Java Lesson – Executor Framework in Java

Is lesson me hum seekhenge:

- Executor kya hota hai
- Executor vs Thread
- Single Thread Executor
- Multi Thread Executor (Thread Pool)
- Future (result return)
- Complete workflow

---

# 1️⃣ Executor Kya Hota Hai?

Executor ek framework hai jo:

```
thread creation aur management ko simplify karta hai
```

Package:

```
java.util.concurrent
```

---

# 2️⃣ Executor Kyun Use Karte Hain?

Problem with Thread:

❌ manually thread manage karna padta hai  
❌ performance issue  
❌ scalability problem  

Solution:

✔ Executor framework use karo  

---

# 3️⃣ Executor Interface

```java
Executor executor = Executors.newSingleThreadExecutor();
```

---

# 4️⃣ Types of Executors

```
1. Single Thread Executor
2. Fixed Thread Pool
3. Cached Thread Pool
```

---

# 5️⃣ Single Thread Executor

✔ ek hi thread use hota hai  
✔ tasks sequentially execute hote hain  

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

        executor.shutdown();
    }
}
```

---

# 6️⃣ Multi Thread Executor (Thread Pool)

```java
ExecutorService executor = Executors.newFixedThreadPool(3);
```

✔ 3 threads ek saath kaam karenge  

```java
for(int i = 1; i <= 5; i++){

    int num = i;

    executor.execute(() -> {
        System.out.println("Task " + num + 
            " by " + Thread.currentThread().getName());
    });
}
```

---

# 7️⃣ Cached Thread Pool

```java
ExecutorService executor = Executors.newCachedThreadPool();
```

✔ dynamic threads create karta hai  

---

# 8️⃣ Runnable vs Callable

| Feature | Runnable | Callable |
|--------|---------|----------|
| Return | ❌ No | ✔ Yes |
| Exception | ❌ No | ✔ Yes |

---

# 9️⃣ Future Kya Hota Hai?

Future ek object hai jo:

```
future result ko represent karta hai
```

---

# 🔟 Callable + Future Example

```java
import java.util.concurrent.*;

class Test {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            return 10 + 20;
        };

        Future<Integer> result = executor.submit(task);

        System.out.println(result.get()); // wait and get result

        executor.shutdown();
    }
}
```

---

# 1️⃣1️⃣ Future Methods

| Method | Use |
|-------|-----|
| get() | result lena |
| isDone() | task complete check |
| cancel() | cancel task |

---

# 1️⃣2️⃣ execute() vs submit()

| Method | Use |
|--------|-----|
| execute() | Runnable |
| submit() | Runnable + Callable |

---

# 1️⃣3️⃣ Executor Lifecycle

```
1. create executor
2. submit task
3. execute task
4. shutdown
```

---

# 1️⃣4️⃣ Shutdown Methods

```java
executor.shutdown();       // graceful shutdown
executor.shutdownNow();    // immediate stop
```

---

# 1️⃣5️⃣ Real-Life Analogy

```
Office me manager (Executor)
workers (threads)
tasks assign karta hai
```

---

# 1️⃣6️⃣ Advantages

✔ better performance  
✔ thread reuse (thread pool)  
✔ scalable  
✔ easy management  

---

# 1️⃣7️⃣ Important Points

✔ ExecutorService use karna best practice hai  
✔ always shutdown executor  
✔ Future async result handle karta hai  

---

# 🎯 Interview Questions

1. Executor framework kya hota hai?
2. Runnable vs Callable difference?
3. Future kya hota hai?
4. Fixed thread pool kya hota hai?
5. execute() vs submit()?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Executor framework concept  
✔ Single thread executor  
✔ Multi-thread (thread pool)  
✔ Callable & Future  
✔ Task management  

Executor framework Java me **modern aur efficient multithreading solution** provide karta hai.