# ☕ Java Lesson – Priority Queue in Java

Is lesson me hum seekhenge:

- Priority Queue kya hota hai
- Kaise kaam karta hai (Heap concept)
- Default behavior (Min-Heap)
- Custom comparator ke saath use
- Important methods aur examples

---

# 1️⃣ Priority Queue Kya Hota Hai?

Priority Queue ek queue hai jisme:

```
elements priority ke basis par process hote hain
```

FIFO (First In First Out) follow nahi karta.

---

# 2️⃣ Java me PriorityQueue

Class:

```java
java.util.PriorityQueue
```

---

# 3️⃣ Internal Working

PriorityQueue internally use karta hai:

```
Heap (Binary Heap)
```

Default:

```
Min Heap
```

Matlab:

```
smallest element pehle niklega
```

---

# 4️⃣ Basic Example

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
```

Output:

```
10
20
30
```

---

# 5️⃣ Important Methods

| Method | Use |
|-------|-----|
| add() | insert element |
| offer() | insert (safe) |
| peek() | top element |
| poll() | remove top |
| remove() | delete |

---

# 6️⃣ Min Heap vs Max Heap

Default:

```
Min Heap → smallest first
```

Max Heap banane ke liye:

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
```

---

# 7️⃣ Max Heap Example

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

pq.add(10);
pq.add(30);
pq.add(20);

while(!pq.isEmpty()){
    System.out.println(pq.poll());
}
```

Output:

```
30
20
10
```

---

# 8️⃣ Custom Comparator

```java
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
```

---

# 9️⃣ Custom Object Example

```java
class Student {
    int marks;

    Student(int marks){
        this.marks = marks;
    }
}
```

Use:

```java
PriorityQueue<Student> pq = new PriorityQueue<>(
    (s1, s2) -> s2.marks - s1.marks
);

pq.add(new Student(80));
pq.add(new Student(90));
pq.add(new Student(70));

while(!pq.isEmpty()){
    System.out.println(pq.poll().marks);
}
```

---

# 🔟 Priority Queue Properties

✔ elements sorted nahi dikhte  
✔ head element highest priority hota hai  
✔ duplicate allowed  

---

# 1️⃣1️⃣ Use Cases

```
Dijkstra Algorithm
CPU Scheduling
Task Scheduling
Top K elements problems
```

---

# 1️⃣2️⃣ Difference from Queue

| Feature | Queue | PriorityQueue |
|--------|------|---------------|
| Order | FIFO | Priority based |
| Structure | Linear | Heap |

---

# 1️⃣3️⃣ Important Points

✔ PriorityQueue thread-safe nahi hota  
✔ null values allow nahi  
✔ internal structure heap hota hai  

---

# 🎯 Interview Questions

1. PriorityQueue ka internal structure kya hai?
2. Min heap aur max heap me difference?
3. PriorityQueue me sorting kaise hoti hai?
4. Custom comparator ka use kaise karte hain?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Priority Queue concept  
✔ Heap working (Min/Max)  
✔ Important methods  
✔ Custom comparator  
✔ Real-life usage  

PriorityQueue Java me **priority-based data processing** ke liye use hota hai aur algorithms me bahut powerful hota hai.