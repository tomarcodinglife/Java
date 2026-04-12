# ☕ Java Lesson – Thread Class in Multithreading

Is lesson me hum seekhenge:

- Thread kya hota hai
- Thread class kya hai
- Thread kaise create karte hain
- run() vs start()
- Important methods

---

# 1️⃣ Thread Kya Hota Hai?

Thread ka matlab:

```
program ka ek independent execution unit
```

Example:

```
ek app me music + download + UI ek saath chalna
```

---

# 2️⃣ Multithreading Kya Hota Hai?

```
multiple threads ka parallel execution
```

---

# 3️⃣ Thread Class

Java me Thread class:

```
java.lang.Thread
```

Is class ko extend karke thread create karte hain.

---

# 4️⃣ Thread Create Karna (Extend Thread)

```java
class MyThread extends Thread {

    public void run(){
        System.out.println("Thread running...");
    }

    public static void main(String[] args){

        MyThread t1 = new MyThread();

        t1.start(); // thread start
    }
}
```

---

# 5️⃣ run() vs start()

| Method | Use |
|--------|-----|
| run() | normal method call |
| start() | new thread create karta hai |

❌ Wrong:

```java
t1.run();
```

✔ Correct:

```java
t1.start();
```

---

# 6️⃣ Multiple Threads Example

```java
class MyThread extends Thread {

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args){

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
```

---

# 7️⃣ Important Thread Methods

| Method | Use |
|-------|-----|
| start() | thread start |
| run() | logic define |
| sleep() | pause |
| join() | wait |
| setPriority() | priority set |
| getName() | thread name |

---

# 8️⃣ sleep() Example

```java
try {
    Thread.sleep(1000); // 1 second
} catch(Exception e){}
```

---

# 9️⃣ Thread Naming

```java
t1.setName("Worker Thread");

System.out.println(t1.getName());
```

---

# 🔟 Thread Lifecycle

```
New → Runnable → Running → Waiting → Terminated
```

---

# 1️⃣1️⃣ Example – Loop Thread

```java
class MyThread extends Thread {

    public void run(){

        for(int i = 1; i <= 3; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){

        MyThread t = new MyThread();
        t.start();
    }
}
```

---

# 1️⃣2️⃣ Important Points

✔ Thread class extend karke thread banate hain  
✔ run() me logic likhte hain  
✔ start() se new thread create hota hai  

---

# 🎯 Interview Questions

1. Thread kya hota hai?
2. run() aur start() me difference?
3. Thread ka lifecycle kya hai?
4. sleep() aur join() me difference?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Thread concept  
✔ Thread class  
✔ run() vs start()  
✔ important methods  
✔ lifecycle  

Thread class Java me **basic multithreading implementation** provide karta hai.