# ☕ Java Lesson – Synchronization in Multithreading

Is lesson me hum seekhenge:

- Synchronization kya hota hai
- Race condition kya hota hai
- synchronized keyword ka use
- Method aur block synchronization
- Real examples

---

# 1️⃣ Synchronization Kya Hota Hai?

Synchronization ka matlab:

```
multiple threads ko ek shared resource ko safe tarike se access karne dena
```

---

# 2️⃣ Problem – Race Condition

Jab multiple threads ek hi data ko modify karte hain:

```
unexpected result milta hai
```

Example:

```
Bank balance update
```

---

# 3️⃣ Without Synchronization (Problem)

```java
class Counter {

    int count = 0;

    void increment(){
        count++;
    }
}
```

Multiple threads call kare:

```
result incorrect ho sakta hai
```

---

# 4️⃣ With Synchronization

```java
class Counter {

    int count = 0;

    synchronized void increment(){
        count++;
    }
}
```

✔ ek time par ek thread hi access karega

---

# 5️⃣ Synchronized Method

```java
synchronized void methodName(){
}
```

---

# 6️⃣ Synchronized Block

```java
void method(){

    synchronized(this){
        // critical section
    }
}
```

✔ better performance (poora method lock nahi hota)

---

# 7️⃣ Example – Thread Safe Counter

```java
class Counter {

    int count = 0;

    synchronized void increment(){
        count++;
    }
}

class Test {

    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
```

Output:

```
2000 (correct)
```

---

# 8️⃣ Without Synchronization Output

```
random value (like 1700, 1800)
```

---

# 9️⃣ Static Synchronization

```java
static synchronized void method(){
}
```

✔ class-level lock

---

# 🔟 Important Concepts

## 🔸 Critical Section

```
code ka wo part jahan shared resource access hota hai
```

## 🔸 Lock

```
ek thread lock le leta hai → dusre wait karte hain
```

---

# 1️⃣1️⃣ Advantages

✔ data consistency  
✔ thread safety  
✔ race condition avoid  

---

# 1️⃣2️⃣ Disadvantages

❌ performance slow ho sakta hai  
❌ deadlock ka risk  

---

# 1️⃣3️⃣ Real-Life Analogy

```
ATM machine
```

Ek time par ek hi person use karta hai.

---

# 🎯 Interview Questions

1. Synchronization kya hota hai?
2. Race condition kya hota hai?
3. synchronized method vs block?
4. deadlock kya hota hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Synchronization concept  
✔ Race condition problem  
✔ synchronized keyword  
✔ method aur block synchronization  
✔ thread safety  

Synchronization Java me **multi-threaded environment me safe data handling** ke liye use hota hai.