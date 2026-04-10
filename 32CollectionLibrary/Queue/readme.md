# ☕ Java Lesson – Queue in Java (Collection Framework)

Is lesson me hum seekhenge:

- Queue kya hota hai
- FIFO concept
- Queue interface aur implementations
- Important methods
- PriorityQueue vs Queue difference

---

# 1️⃣ Queue Kya Hota Hai?

Queue ek data structure hai jo follow karta hai:

```
FIFO (First In First Out)
```

Matlab:

```
jo element pehle aata hai, wo pehle nikalta hai
```

---

# 2️⃣ Real-Life Example

```
Line me khade log
```

Jo pehle line me aaya:

```
wo pehle service lega
```

---

# 3️⃣ Queue Interface

Package:

```
java.util.Queue
```

---

# 4️⃣ Queue Implementations

Java me common Queue implementations:

```
LinkedList
PriorityQueue
ArrayDeque
```

---

# 5️⃣ Basic Queue Example (LinkedList)

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);

        System.out.println(q.poll()); // remove first
        System.out.println(q.peek()); // first element
    }
}
```

---

# 6️⃣ Important Methods

| Method | Use |
|-------|-----|
| add() | element insert |
| offer() | safe insert |
| poll() | remove element |
| peek() | front element |
| remove() | remove (exception if empty) |

---

# 7️⃣ add() vs offer()

| Method | Behavior |
|--------|----------|
| add() | error throw karega |
| offer() | false return karega |

---

# 8️⃣ poll() vs remove()

| Method | Behavior |
|--------|----------|
| poll() | null return karega |
| remove() | exception throw karega |

---

# 9️⃣ peek() vs element()

| Method | Behavior |
|--------|----------|
| peek() | null return |
| element() | exception throw |

---

# 🔟 Queue with ArrayDeque

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        Queue<String> q = new ArrayDeque<>();

        q.offer("A");
        q.offer("B");
        q.offer("C");

        System.out.println(q.poll());
    }
}
```

---

# 1️⃣1️⃣ Queue vs PriorityQueue

| Feature | Queue | PriorityQueue |
|--------|------|---------------|
| Order | FIFO | Priority-based |
| Structure | Linear | Heap |

---

# 1️⃣2️⃣ When to Use Queue?

Use Queue jab:

```
order maintain karna ho
processing sequence important ho
```

Example:

```
task scheduling
printer queue
CPU scheduling
```

---

# 1️⃣3️⃣ Important Points

✔ Queue interface directly instantiate nahi hota  
✔ LinkedList aur ArrayDeque commonly use hote hain  
✔ null values avoid karna chahiye  

---

# 🎯 Interview Questions

1. Queue kya hota hai?
2. add() aur offer() me difference?
3. poll() aur remove() me difference?
4. Queue aur PriorityQueue me difference?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Queue concept (FIFO)  
✔ Implementations (LinkedList, ArrayDeque)  
✔ Important methods  
✔ Differences aur use cases  

Queue Java me **sequential processing aur task management** ke liye use hota hai.