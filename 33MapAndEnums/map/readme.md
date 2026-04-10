# ☕ Java Lesson – Map Interface in Java

Is lesson me hum seekhenge:

- Map kya hota hai
- Key-Value concept
- Map implementations (HashMap, LinkedHashMap, TreeMap)
- Important methods
- Real examples

---

# 1️⃣ Map Kya Hota Hai?

Map ek interface hai jo:

```
key-value pairs store karta hai
```

Example:

```
name → marks
```

---

# 2️⃣ Key Features

✔ key unique hoti hai  
✔ value duplicate ho sakti hai  
✔ key ke basis par data access hota hai  

---

# 3️⃣ Package

```
java.util.Map
```

---

# 4️⃣ Map Implementations

Java me main Map classes:

```
HashMap
LinkedHashMap
TreeMap
```

---

# 5️⃣ HashMap

✔ unordered  
✔ fast performance  
✔ null key (1) allowed  

Example:

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Sujit", 90);
        map.put("Rahul", 80);
        map.put("Amit", 85);

        System.out.println(map);
    }
}
```

---

# 6️⃣ LinkedHashMap

✔ insertion order maintain karta hai  

Example:

```java
LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

map.put("A", 1);
map.put("B", 2);

System.out.println(map);
```

---

# 7️⃣ TreeMap

✔ sorted order me data store karta hai  
✔ null key allow nahi  

Example:

```java
TreeMap<Integer, String> map = new TreeMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

System.out.println(map);
```

---

# 8️⃣ Important Methods

| Method | Use |
|-------|-----|
| put() | add/update |
| get() | value access |
| remove() | delete |
| containsKey() | key check |
| containsValue() | value check |
| size() | count |

---

# 9️⃣ Example – Methods

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);

        System.out.println(map.get("A")); // 10

        map.remove("B");

        System.out.println(map.containsKey("A"));
    }
}
```

---

# 🔟 Iterating Map

### KeySet

```java
for(String key : map.keySet()){
    System.out.println(key + " " + map.get(key));
}
```

### EntrySet

```java
for(Map.Entry<String, Integer> entry : map.entrySet()){
    System.out.println(entry.getKey() + " " + entry.getValue());
}
```

---

# 1️⃣1️⃣ Map vs List vs Set

| Feature | Map | List | Set |
|--------|-----|------|-----|
| Data | key-value | single value | single value |
| Duplicate | key ❌ | ✔ | ❌ |
| Order | depends | ✔ | ❌ |

---

# 1️⃣2️⃣ Null Handling

| Map Type | Null Key | Null Value |
|----------|----------|------------|
| HashMap | ✔ (1) | ✔ |
| LinkedHashMap | ✔ | ✔ |
| TreeMap | ❌ | ✔ |

---

# 1️⃣3️⃣ Real-Life Use Case

```
database-like storage
```

Example:

```
username → password
roll no → student data
```

---

# 1️⃣4️⃣ Important Points

✔ Map Collection interface ka part nahi hai (separate hai)  
✔ key unique hoti hai  
✔ hashing aur tree structure use hota hai internally  

---

# 🎯 Interview Questions

1. Map kya hota hai?
2. HashMap aur TreeMap me difference?
3. Map me duplicate key kyun allow nahi?
4. keySet() aur entrySet() me difference?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Map interface  
✔ HashMap, LinkedHashMap, TreeMap  
✔ Important methods  
✔ Iteration techniques  
✔ Real-life usage  

Map Java me **key-value based fast data access** ke liye use hota hai.