# ☕ Java Lesson – Runnable Interface in Multithreading

Is lesson me hum seekhenge:

- Runnable kya hota hai
- Runnable vs Thread class
- Runnable ka use kyun karte hain
- Implementation aur examples
- Best practices

---

# 1️⃣ Runnable Kya Hota Hai?

Runnable ek interface hai:

```
jo thread ka task define karta hai
```

Package:

```
java.lang.Runnable
```

---

# 2️⃣ Runnable Ka Method

```java
public void run();
```

Ye method:

```
thread ka actual work define karta hai
```

---

# 3️⃣ Runnable Ka Use Kyun?

Thread banane ke 2 tarike:

```
1. Thread class extend karke
2. Runnable implement karke
```

Runnable better hai kyunki:

✔ multiple inheritance possible hai  
✔ clean design hota hai  

---

# 4️⃣ Basic Example

```java
class MyTask implements Runnable {

    public void run(){

        for(int i = 1; i <= 3; i++){
            System.out.println("Running: " + i);
        }
    }

    public static void main(String[] args){

        MyTask task = new MyTask();

        Thread t1 = new Thread(task);

        t1.start();
    }
}
```

---

# 5️⃣ Runnable Flow

```
Runnable object → Thread object → start() → run()
```

---

# 6️⃣ Multiple Threads Example

```java
class MyTask implements Runnable {

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args){

        MyTask task = new MyTask();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
```

---

# 7️⃣ Runnable with Lambda (Modern Way)

```java
public class Test {

    public static void main(String[] args){

        Runnable task = () -> {
            System.out.println("Thread running");
        };

        Thread t = new Thread(task);
        t.start();
    }
}
```

---

# 8️⃣ Runnable vs Thread

| Feature | Runnable | Thread |
|--------|---------|--------|
| Type | Interface | Class |
| Inheritance | possible | not possible |
| Flexibility | high | low |

---

# 9️⃣ Common Mistake ⚠

❌ Direct run() call:

```java
task.run(); // wrong
```

✔ Correct:

```java
t.start();
```

---

# 🔟 Real-Life Example

```
Task define alag, execution alag
```

Jaise:

```
chef (task) + worker (thread)
```

---

# 1️⃣1️⃣ Important Points

✔ Runnable preferred approach hai  
✔ run() method me logic likhte hain  
✔ Thread object se execute hota hai  

---

# 🎯 Interview Questions

1. Runnable kya hota hai?
2. Runnable aur Thread me difference?
3. run() aur start() me difference?
4. Runnable better kyun hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Runnable interface  
✔ Thread creation using Runnable  
✔ Lambda usage  
✔ Runnable vs Thread  

Runnable Java me **clean aur flexible multithreading approach** provide karta hai.