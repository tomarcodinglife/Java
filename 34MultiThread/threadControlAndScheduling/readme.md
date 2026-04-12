# ☕ Java Lesson – Thread Control & Scheduling in Java

Is lesson me hum seekhenge:

- Thread control methods
- Thread scheduling kya hota hai
- Scheduler ka role
- Important methods (sleep, yield, join)
- Real examples

---

# 1️⃣ Thread Control Kya Hota Hai?

Thread control ka matlab:

```
thread ke execution ko manage aur control karna
```

---

# 2️⃣ Thread Scheduling Kya Hota Hai?

Thread scheduling ka matlab:

```
CPU decide karta hai kaunsa thread kab execute hoga
```

---

# 3️⃣ Scheduler Ka Role

```
OS scheduler threads ko manage karta hai
```

✔ kaunsa thread run karega  
✔ kitni der tak run karega  

---

# 4️⃣ Scheduling Types

## 🔸 Preemptive Scheduling

```
high priority thread → low priority ko interrupt kar sakta hai
```

## 🔸 Time Slicing

```
har thread ko thoda-thoda CPU time milta hai
```

---

# 5️⃣ Important Thread Control Methods

| Method | Use |
|-------|-----|
| sleep() | pause thread |
| yield() | give chance to other thread |
| join() | wait for another thread |

---

# 6️⃣ sleep() Method

```java
Thread.sleep(1000); // 1 second pause
```

✔ current thread pause hota hai  
✔ InterruptedException handle karna padta hai  

---

# 7️⃣ yield() Method

```java
Thread.yield();
```

✔ current thread CPU chhod deta hai  
✔ dusre threads ko chance deta hai  

⚠ guarantee nahi hoti execution ki  

---

# 8️⃣ join() Method

```java
t1.join();
```

✔ current thread wait karta hai jab tak t1 complete na ho  

---

# 9️⃣ Example – sleep()

```java
class Test extends Thread {

    public void run(){

        for(int i = 1; i <= 3; i++){

            try {
                Thread.sleep(1000);
            } catch(Exception e){}

            System.out.println(i);
        }
    }

    public static void main(String[] args){

        Test t = new Test();
        t.start();
    }
}
```

---

# 🔟 Example – yield()

```java
class Test extends Thread {

    public void run(){
        System.out.println(Thread.currentThread().getName());
        Thread.yield();
    }

    public static void main(String[] args){

        Test t1 = new Test();
        Test t2 = new Test();

        t1.start();
        t2.start();
    }
}
```

---

# 1️⃣1️⃣ Example – join()

```java
class Test extends Thread {

    public void run(){
        System.out.println("Thread running");
    }

    public static void main(String[] args) throws Exception {

        Test t1 = new Test();

        t1.start();
        t1.join();

        System.out.println("Main thread finished");
    }
}
```

---

# 1️⃣2️⃣ Thread States (Lifecycle)

```
New → Runnable → Running → Waiting → Terminated
```

---

# 1️⃣3️⃣ Important Points

✔ scheduler OS dependent hota hai  
✔ priority sirf hint hoti hai  
✔ yield guaranteed nahi hai  
✔ join execution order control karta hai  

---

# 1️⃣4️⃣ Real-Life Analogy

```
Teacher class me students ko chance deta hai bolne ka
```

Scheduler decide karta hai kaun kab bolega.

---

# 🎯 Interview Questions

1. Thread scheduling kya hota hai?
2. sleep(), yield(), join() me difference?
3. scheduler ka role kya hai?
4. time slicing kya hota hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Thread control methods  
✔ Scheduling concepts  
✔ sleep(), yield(), join()  
✔ Thread lifecycle  

Thread control aur scheduling Java me **efficient execution aur resource sharing** ke liye important hai.