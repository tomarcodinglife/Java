# ☕ Java Lesson – Collection Framework (Collection Library)

Is lesson me hum cover karenge:

- Collection framework kya hota hai
- Collection hierarchy
- List, Set, Map kya hote hain
- Important classes (ArrayList, HashSet, HashMap)
- Real examples aur use cases

---

# 1️⃣ Collection Framework Kya Hota Hai?

Collection framework ka matlab:

```
data ko store aur manage karne ke liye ready-made classes aur interfaces
```

Java me:

```
java.util package me available hota hai
```

---

# 2️⃣ Collection Framework Hierarchy

```
Iterable
   ↓
Collection
   ├── List
   ├── Set
   └── Queue

Map (separate interface)
```

---

# 3️⃣ Collection vs Collections

| Term | Meaning |
|------|--------|
| Collection | Interface |
| Collections | Utility class |

Example:

```java
Collections.sort(list);
```

---

# 4️⃣ List Interface

List ka use hota hai:

```
ordered collection + duplicate allowed
```

### Common Classes

- ArrayList
- LinkedList
- Vector

---

# 5️⃣ ArrayList Example

```java
import java.util.ArrayList;

class Test {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10); // duplicate allowed

        for(int n : list){
            System.out.println(n);
        }
    }
}
```

---

# 6️⃣ LinkedList Example

```java
import java.util.LinkedList;

class Test {

    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");

        System.out.println(list);
    }
}
```

---

# 7️⃣ Set Interface

Set ka use hota hai:

```
unique elements store karne ke liye
```

✔ duplicates allowed nahi

### Classes

- HashSet
- LinkedHashSet
- TreeSet

---

# 8️⃣ HashSet Example

```java
import java.util.HashSet;

class Test {

    public static void main(String[] args){

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignore

        System.out.println(set);
    }
}
```

---

# 9️⃣ Map Interface

Map ka use hota hai:

```
key-value pair store karne ke liye
```

✔ key unique hoti hai

---

# 🔟 HashMap Example

```java
import java.util.HashMap;

class Test {

    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Sujit", 90);
        map.put("Rahul", 80);

        System.out.println(map.get("Sujit"));
    }
}
```

---

# 1️⃣1️⃣ List vs Set vs Map

| Feature | List | Set | Map |
|--------|------|-----|-----|
| Order | ✔ Yes | ❌ No | ❌ No |
| Duplicate | ✔ Yes | ❌ No | Key ❌ |
| Index | ✔ Yes | ❌ No | ❌ No |

---

# 1️⃣2️⃣ Important Methods

| Method | Use |
|-------|-----|
| add() | element add |
| remove() | delete |
| get() | value access |
| contains() | check |
| size() | count |

---

# 1️⃣3️⃣ Iteration Methods

### For-each loop

```java
for(int n : list){
    System.out.println(n);
}
```

### Iterator

```java
Iterator<Integer> it = list.iterator();

while(it.hasNext()){
    System.out.println(it.next());
}
```

---

# 1️⃣4️⃣ Collections Utility Class

```java
Collections.sort(list);
Collections.reverse(list);
Collections.max(list);
```

---

# 1️⃣5️⃣ Real-Life Use Cases

```
ArrayList → dynamic array
HashSet → unique data
HashMap → key-value storage (database-like)
```

---

# 🎯 Interview Questions

1. Collection framework kya hota hai?
2. List aur Set me difference kya hai?
3. HashMap ka use kya hai?
4. ArrayList vs LinkedList difference?
5. Iterator kya hota hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Collection framework basics  
✔ List, Set, Map  
✔ ArrayList, HashSet, HashMap  
✔ Iteration methods  
✔ Real-life usage  

Collection framework Java me **dynamic data handling aur efficient storage** ke liye use hota hai.


# 📚 Java Collections Framework (JCF) – Complete Guide

## 🧠 What is Java Collections Framework?

Java Collections Framework (JCF) is a set of classes and interfaces that provide efficient ways to store, manage, and manipulate groups of data.

---

## 🏗️ Core Interfaces

### Collection Interface

* Root interface of collection hierarchy
* Common methods:

  * add()
  * remove()
  * size()
  * isEmpty()
  * contains()

---

### List Interface (Ordered, allows duplicates)

#### Implementations:

* ArrayList
* LinkedList
* Vector (legacy)
* Stack (legacy)

#### Features:

* Maintains insertion order
* Allows duplicate elements
* Index-based access

---

### Set Interface (No duplicates)

#### Implementations:

* HashSet
* LinkedHashSet
* TreeSet

#### Features:

* No duplicate elements
* Uses hashing or tree structure

---

### Queue Interface (FIFO / Priority-based)

#### Implementations:

* PriorityQueue
* ArrayDeque

#### Methods:

* offer()
* poll()
* peek()

---

### Map Interface (Key-Value pairs)

#### Implementations:

* HashMap
* LinkedHashMap
* TreeMap
* Hashtable (legacy)

#### Features:

* Keys are unique
* Values can be duplicated

---

## ⚙️ Important Classes

### ArrayList

* Dynamic array
* Fast access (O(1))
* Slow insertion/deletion (O(n))

---

### LinkedList

* Doubly linked list
* Fast insertion/deletion
* Slow access

---

### HashMap / HashSet

* Based on hashing
* Average O(1) operations

---

### TreeMap / TreeSet

* Sorted structure
* Based on Red-Black Tree
* O(log n) operations

---

### PriorityQueue

* Based on Heap (Min Heap by default)
* Elements are ordered based on priority

---

## 🔁 Iteration Techniques

* for loop
* enhanced for loop
* Iterator
* ListIterator
* forEach()

---

## 🔀 Sorting

### Comparable (Natural Ordering)

* Used when class defines its own sorting

### Comparator (Custom Ordering)

* Used when we need custom sorting logic

---

## ⚡ Collections Utility Class

* sort()
* reverse()
* shuffle()
* frequency()
* max()
* min()

---

## ⏱️ Time Complexity

| Data Structure | Access   | Insert   | Delete   |
| -------------- | -------- | -------- | -------- |
| ArrayList      | O(1)     | O(n)     | O(n)     |
| LinkedList     | O(n)     | O(1)     | O(1)     |
| HashMap        | O(1)     | O(1)     | O(1)     |
| TreeMap        | O(log n) | O(log n) | O(log n) |
| PriorityQueue  | O(1)*    | O(log n) | O(log n) |

(*peek operation)

---

## 🔐 Important Concepts

* Hashing
* hashCode() and equals()
* Collision handling
* Load factor
* Fail-fast vs Fail-safe

---

## 🧵 Thread-Safe Collections

* Vector
* Hashtable
* Collections.synchronizedList()
* ConcurrentHashMap

---

## 🚀 Advanced Topics

* Stream API
* Lambda Expressions
* Functional Interfaces
* Parallel Streams

---

## 🎯 Real-World Use Cases

* Ranking system → PriorityQueue
* Unique elements → Set
* Fast lookup → HashMap
* Sorted data → TreeSet

---

## ❌ Common Mistakes

* Not overriding equals() and hashCode()
* Choosing wrong data structure
* Modifying collection during iteration

---

## 📊 When to Use What?

| Situation              | Use           |
| ---------------------- | ------------- |
| Fast search            | HashMap       |
| Unique data            | HashSet       |
| Sorted data            | TreeSet       |
| Frequent insert/delete | LinkedList    |
| Priority-based         | PriorityQueue |

---

## 🎯 Final Summary

Java Collections Framework helps in efficient data handling using different data structures and algorithms.

---

## 📌 Author Notes

This README is designed for learning, practice, and interview preparation of Java Collections Framework.
