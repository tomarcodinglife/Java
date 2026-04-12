# ☕ Java Lesson – Thread Communication in Java

Is lesson me hum seekhenge:

- Thread Communication kya hota hai
- wait(), notify(), notifyAll()
- Producer-Consumer problem
- Important rules aur examples

---

# 1️⃣ Thread Communication Kya Hota Hai?

Thread communication ka matlab:

```
multiple threads ka ek dusre ke saath coordinate karna
```

Example:

```
ek thread wait kare jab tak dusra kaam complete na kare
```

---

# 2️⃣ Problem – Without Communication

Agar threads coordinate na kare:

```
data inconsistency ya wrong execution ho sakta hai
```

---

# 3️⃣ Important Methods

Java me communication ke liye 3 methods:

```
wait()
notify()
notifyAll()
```

Ye methods:

```
Object class ke hote hain
```

---

# 4️⃣ wait() Method

```
thread ko wait state me bhej deta hai
```

```java
wait();
```

✔ lock release karta hai  
✔ dusra thread ka wait karta hai  

---

# 5️⃣ notify() Method

```
ek waiting thread ko jagata hai
```

```java
notify();
```

---

# 6️⃣ notifyAll() Method

```
sab waiting threads ko jagata hai
```

```java
notifyAll();
```

---

# 7️⃣ Important Rule ⚠

✔ wait(), notify(), notifyAll() sirf:

```
synchronized block ya method ke andar use hote hain
```

---

# 8️⃣ Producer-Consumer Problem

Real example:

```
Producer → data banata hai  
Consumer → data use karta hai
```

---

# 9️⃣ Example – Thread Communication

```java
class Shared {

    int data;
    boolean available = false;

    synchronized void produce(int value) throws Exception {

        if(available){
            wait();
        }

        data = value;
        available = true;

        System.out.println("Produced: " + data);

        notify();
    }

    synchronized void consume() throws Exception {

        if(!available){
            wait();
        }

        System.out.println("Consumed: " + data);

        available = false;

        notify();
    }
}
```

---

# 🔟 Main Class

```java
class Test {

    public static void main(String[] args){

        Shared s = new Shared();

        Thread producer = new Thread(() -> {
            try {
                for(int i = 1; i <= 5; i++){
                    s.produce(i);
                }
            } catch(Exception e){}
        });

        Thread consumer = new Thread(() -> {
            try {
                for(int i = 1; i <= 5; i++){
                    s.consume();
                }
            } catch(Exception e){}
        });

        producer.start();
        consumer.start();
    }
}
```

---

# 1️⃣1️⃣ Flow

```
Producer produce karega → notify  
Consumer consume karega → notify  
```

---

# 1️⃣2️⃣ Real-Life Analogy

```
Restaurant:
Chef (producer) → food banata hai  
Customer (consumer) → food khata hai  
```

---

# 1️⃣3️⃣ Important Points

✔ wait() lock release karta hai  
✔ notify() ek thread ko jagata hai  
✔ notifyAll() sabko jagata hai  
✔ synchronized required hai  

---

# 1️⃣4️⃣ Common Mistakes

❌ wait() outside synchronized  
❌ notify() without condition check  

---

# 🎯 Interview Questions

1. Thread communication kya hota hai?
2. wait() aur sleep() me difference?
3. notify() vs notifyAll()?
4. Producer-Consumer problem kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Thread communication concept  
✔ wait(), notify(), notifyAll()  
✔ Producer-Consumer example  
✔ synchronization rules  

Thread communication Java me **threads ke beech coordination aur synchronization** ke liye use hota hai.