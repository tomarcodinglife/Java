# ☕ Java Lesson – Set Interface in Java

Is lesson me hum seekhenge:

- Set kya hota hai
- Set ki properties
- Set implementations (HashSet, LinkedHashSet, TreeSet)
- Important methods
- Real examples

---

# 1️⃣ Set Kya Hota Hai?

Set ek interface hai jo:

```
unique elements store karta hai
```

Features:

✔ duplicate elements allowed nahi  
✔ unordered collection (mostly)  
✔ null ek hi allow hota hai (HashSet me)  

---

# 2️⃣ Set Interface Package

```
java.util.Set
```

---

# 3️⃣ Set Implementations

Java me main Set implementations:

```
HashSet
LinkedHashSet
TreeSet
```

---

# 4️⃣ HashSet

✔ unordered  
✔ fast (hashing use karta hai)  
✔ duplicate remove automatically  

Example:

```java
import java.util.*;

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

# 5️⃣ LinkedHashSet

✔ insertion order maintain karta hai  
✔ thoda slow HashSet se  

Example:

```java
LinkedHashSet<String> set = new LinkedHashSet<>();

set.add("A");
set.add("B");
set.add("C");

System.out.println(set);
```

---

# 6️⃣ TreeSet

✔ sorted order me elements store karta hai  
✔ internally tree structure use karta hai  

Example:

```java
TreeSet<Integer> set = new TreeSet<>();

set.add(30);
set.add(10);
set.add(20);

System.out.println(set); // sorted output
```

---

# 7️⃣ Important Methods

| Method | Use |
|-------|-----|
| add() | element add |
| remove() | delete |
| contains() | check element |
| size() | count |
| clear() | remove all |

---

# 8️⃣ Iteration Example

```java
for(int n : set){
    System.out.println(n);
}
```

---

# 9️⃣ Set vs List

| Feature | Set | List |
|--------|-----|------|
| Duplicate | ❌ No | ✔ Yes |
| Order | ❌ No (HashSet) | ✔ Yes |
| Index | ❌ No | ✔ Yes |

---

# 🔟 Null Handling

| Set Type | Null Allowed |
|---------|-------------|
| HashSet | ✔ Yes (1 time) |
| LinkedHashSet | ✔ Yes |
| TreeSet | ❌ No |

---

# 1️⃣1️⃣ Real-Life Use Case

```
unique values store karna
```

Example:

```
usernames
emails
IDs
```

---

# 1️⃣2️⃣ Important Points

✔ Set duplicates automatically remove karta hai  
✔ HashSet fastest hota hai  
✔ TreeSet sorted data deta hai  

---

# 🎯 Interview Questions

1. Set kya hota hai?
2. HashSet aur TreeSet me difference?
3. Set me duplicate kyun allowed nahi?
4. TreeSet me null kyun allowed nahi?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Set interface  
✔ HashSet, LinkedHashSet, TreeSet  
✔ Important methods  
✔ Differences aur use cases  

Set Java me **unique data store karne ke liye best collection hai**.