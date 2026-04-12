# ☕ Java Lesson – Thread Priority in Java

Is lesson me hum seekhenge:

- Thread priority kya hota hai
- Priority ka use kyun hota hai
- setPriority() aur getPriority()
- Priority constants
- Real examples aur behavior

---

# 1️⃣ Thread Priority Kya Hota Hai?

Thread priority ka matlab:

```
thread ko execution ke liye kitni importance di gayi hai
```

Higher priority:

```
CPU scheduling me jyada chance milta hai
```

---

# 2️⃣ Priority Range

Java me thread priority range:

```
1 to 10
```

| Constant | Value |
|----------|------|
| MIN_PRIORITY | 1 |
| NORM_PRIORITY | 5 |
| MAX_PRIORITY | 10 |

---

# 3️⃣ Default Priority

```
har thread ki default priority = 5 (NORM_PRIORITY)
```

---

# 4️⃣ setPriority() Method

```java
thread.setPriority(value);
```

Example:

```java
t1.setPriority(10); // high priority
t2.setPriority(1);  // low priority
```

---

# 5️⃣ getPriority() Method

```java
System.out.println(t1.getPriority());
```

---

# 6️⃣ Basic Example

```java
class Test extends Thread {

    public void run(){
        System.out.println(Thread.currentThread().getName() + 
                           " Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args){

        Test t1 = new Test();
        Test t2 = new Test();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
```

---

# 7️⃣ Important Note ⚠

```
Thread priority execution guarantee nahi deta
```

Matlab:

```
high priority thread pehle run kare ye zaruri nahi
```

Ye depend karta hai:

```
OS scheduler
```

---

# 8️⃣ Real-Life Analogy

```
Hospital me emergency patient → high priority
normal patient → low priority
```

---

# 9️⃣ Example – Multiple Threads

```java
class Test extends Thread {

    public void run(){
        for(int i = 1; i <= 3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args){

        Test t1 = new Test();
        Test t2 = new Test();

        t1.setPriority(8);
        t2.setPriority(3);

        t1.start();
        t2.start();
    }
}
```

---

# 🔟 Priority Inheritance

```
child thread parent ki priority inherit karta hai
```

---

# 1️⃣1️⃣ Important Points

✔ Priority range 1–10 hoti hai  
✔ default priority = 5  
✔ OS scheduler decide karta hai execution  
✔ priority sirf hint hota hai  

---

# 1️⃣2️⃣ Common Mistakes

❌ Priority ko guaranteed execution samajhna  
❌ logic ko priority par depend banana  

---

# 🎯 Interview Questions

1. Thread priority kya hota hai?
2. MAX_PRIORITY ki value kya hoti hai?
3. Kya priority execution guarantee karta hai?
4. Default priority kya hoti hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Thread priority concept  
✔ setPriority() aur getPriority()  
✔ constants (MIN, MAX, NORM)  
✔ real behavior  

Thread priority Java me **execution preference dene ke liye use hota hai, lekin ye guaranteed nahi hota**.