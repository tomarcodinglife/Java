# ☕ Java Lesson – join() in Multithreading

Is lesson me hum seekhenge:

- Multithreading basics
- join() method kya hota hai
- join() ka use kyun hota hai
- join() ka working
- Real examples

---

# 1️⃣ Multithreading Kya Hota Hai?

Multithreading ka matlab:

```
ek program me multiple threads ka parallel execution
```

Example:

```
music play + download + UI response same time
```

---

# 2️⃣ Thread Class

Java me thread banane ke 2 tarike:

```
1. Thread class extend karke
2. Runnable interface implement karke
```

---

# 3️⃣ join() Method Kya Hota Hai?

`join()` method ka use hota hai:

```
ek thread ko wait karne ke liye jab tak dusra thread complete na ho jaye
```

---

# 4️⃣ Syntax

```java
thread.join();
```

---

# 5️⃣ Basic Example

```java
class Test extends Thread {

    public void run(){
        for(int i = 1; i <= 3; i++){
            System.out.println("Thread running: " + i);
        }
    }

    public static void main(String[] args) throws Exception {

        Test t1 = new Test();

        t1.start();

        t1.join(); // main thread wait karega

        System.out.println("Main thread finished");
    }
}
```

---

# 6️⃣ Without join()

```java
t1.start();

System.out.println("Main thread finished");
```

Output unpredictable hoga:

```
Main thread pehle print ho sakta hai
```

---

# 7️⃣ With join()

```java
t1.start();
t1.join();
```

Output:

```
thread complete hone ke baad hi next line execute hogi
```

---

# 8️⃣ Multiple Threads Example

```java
class Test extends Thread {

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws Exception {

        Test t1 = new Test();
        Test t2 = new Test();

        t1.start();
        t1.join(); // t1 complete

        t2.start(); // fir t2 start
    }
}
```

---

# 9️⃣ join() Variants

```java
t1.join();          // complete hone tak wait
t1.join(1000);      // max 1 second wait
t1.join(1000, 500); // nanoseconds bhi
```

---

# 🔟 Real-Life Analogy

```
Project me:
Task A complete hone ke baad hi Task B start ho
```

---

# 1️⃣1️⃣ Important Points

✔ join() thread coordination ke liye use hota hai  
✔ InterruptedException handle karna padta hai  
✔ execution order control kar sakte hain  

---

# 1️⃣2️⃣ join() vs sleep()

| Feature | join() | sleep() |
|--------|--------|---------|
| Purpose | wait for another thread | pause current thread |
| Dependency | dusre thread par | khud par |

---

# 🎯 Interview Questions

1. join() method kya hota hai?
2. join() aur sleep() me difference?
3. kya join() multiple threads me use hota hai?
4. join() bina try-catch kyun nahi chal sakta?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Multithreading basics  
✔ join() method  
✔ execution control  
✔ practical examples  

join() Java me **thread synchronization aur execution order control** ke liye use hota hai.