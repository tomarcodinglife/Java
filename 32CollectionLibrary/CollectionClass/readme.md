# ☕ Java Lesson – Collections Class (Utility Class)

Is lesson me hum seekhenge:

- Collections class kya hoti hai
- Collection vs Collections difference
- Important methods of Collections class
- Sorting, reversing, searching operations
- Real examples

---

# 1️⃣ Collections Class Kya Hoti Hai?

`Collections` ek utility class hai jo provide karti hai:

```
static methods for collection operations
```

Ye class:

```
java.util package me hoti hai
```

---

# 2️⃣ Collection vs Collections

| Feature | Collection | Collections |
|--------|------------|-------------|
| Type | Interface | Class |
| Use | data store karna | operations perform karna |

---

# 3️⃣ Common Methods of Collections Class

| Method | Use |
|-------|-----|
| sort() | sorting |
| reverse() | reverse order |
| max() | maximum value |
| min() | minimum value |
| shuffle() | random order |
| binarySearch() | searching |
| frequency() | count occurrences |

---

# 4️⃣ Sorting Example

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);

        Collections.sort(list);

        System.out.println(list);
    }
}
```

Output:

```
[10, 20, 30]
```

---

# 5️⃣ Reverse Example

```java
Collections.reverse(list);
```

---

# 6️⃣ Max and Min

```java
System.out.println(Collections.max(list));
System.out.println(Collections.min(list));
```

---

# 7️⃣ Shuffle Example

```java
Collections.shuffle(list);
```

Random order me elements arrange honge.

---

# 8️⃣ Binary Search

```java
Collections.sort(list);

int index = Collections.binarySearch(list, 20);

System.out.println(index);
```

Note:

```
list sorted hona chahiye
```

---

# 9️⃣ Frequency Count

```java
int count = Collections.frequency(list, 10);

System.out.println(count);
```

---

# 🔟 Custom Object Sorting

```java
Collections.sort(list, Comparator.reverseOrder());
```

---

# 1️⃣1️⃣ Immutable Collection

```java
List<Integer> list = Collections.unmodifiableList(new ArrayList<>());
```

Isme modification allowed nahi.

---

# 1️⃣2️⃣ Real-Life Example

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();

        names.add("Sujit");
        names.add("Rahul");
        names.add("Amit");

        Collections.sort(names);

        System.out.println(names);
    }
}
```

---

# 1️⃣3️⃣ Important Points

✔ Collections class ke sab methods static hote hain  
✔ Ye sirf operations perform karti hai  
✔ Data store nahi karti  

---

# 🎯 Interview Questions

1. Collection aur Collections me difference kya hai?
2. Collections.sort() kaise kaam karta hai?
3. Binary search me sorting kyun zaruri hai?
4. shuffle() method ka use kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Collections class concept  
✔ Important utility methods  
✔ Sorting, searching, reversing  
✔ Real-life examples  

Collections class Java me **collection operations ko easy aur efficient** banati hai.