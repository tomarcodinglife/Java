
// 39. Functional VS Structural Programming
// 40. Programming Paradiagram
// 41. Optional Class
// 43. FIlter, Map, For Each
// 43. Short, Distinct, Map

# ☕ Java Lesson – Functional vs Structural + Optional + Streams (Advanced)

Is lesson me hum seekhenge:

- Functional vs Structural Programming
- Programming Paradigm
- Optional Class
- Stream Operations (filter, map, forEach, sort, distinct)

---

# 1️⃣ Programming Paradigm Kya Hota Hai?

Programming Paradigm ka matlab:

```
program likhne ka tarika ya style
```

Types:

✔ Procedural  
✔ Object-Oriented  
✔ Functional  

---

# 2️⃣ Functional vs Structural Programming

## 🔸 Structural (Procedural Style)

```
step-by-step instructions
```

Example:

```java
int sum = 0;

for(int i = 1; i <= 5; i++){
    sum += i;
}
```

---

## 🔸 Functional Programming

```
functions ke through data process karna
```

Example:

```java
int sum = IntStream.rangeClosed(1,5).sum();
```

---

# 3️⃣ Difference Table

| Feature | Structural | Functional |
|--------|----------|-----------|
| Style | Step-by-step | Function-based |
| Code | lengthy | short |
| Readability | medium | high |

---

# 4️⃣ Optional Class Kya Hota Hai?

Optional ek container hai:

```
jo null values handle karta hai
```

---

# 5️⃣ Optional Create Karna

```java
Optional<String> name = Optional.of("Sujit");
Optional<String> empty = Optional.empty();
```

---

# 6️⃣ Important Methods

| Method | Use |
|-------|-----|
| isPresent() | value check |
| get() | value lena |
| orElse() | default value |
| ifPresent() | action perform |

---

# 7️⃣ Example

```java
Optional<String> name = Optional.ofNullable(null);

System.out.println(name.orElse("Default Name"));
```

---

# 8️⃣ Stream Operations

---

## 🔸 filter()

```java
list.stream()
    .filter(n -> n % 2 == 0)
    .forEach(System.out::println);
```

---

## 🔸 map()

```java
list.stream()
    .map(n -> n * n)
    .forEach(System.out::println);
```

---

## 🔸 forEach()

```java
list.forEach(System.out::println);
```

---

# 9️⃣ sort()

```java
list.stream()
    .sorted()
    .forEach(System.out::println);
```

Descending:

```java
list.stream()
    .sorted((a,b) -> b - a)
    .forEach(System.out::println);
```

---

# 🔟 distinct()

```java
list.stream()
    .distinct()
    .forEach(System.out::println);
```

✔ duplicate remove karta hai  

---

# 1️⃣1️⃣ Combined Example

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,2,3,4,5);

        list.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .distinct()
            .sorted()
            .forEach(System.out::println);
    }
}
```

---

# 1️⃣2️⃣ Flow Samjho

```
List → Stream → Filter → Map → Distinct → Sort → Output
```

---

# 1️⃣3️⃣ Real-Life Example

```
students data:
filter → pass students
map → marks convert
distinct → remove duplicate
sort → rank wise
```

---

# 1️⃣4️⃣ Important Points

✔ Optional null-safe coding ke liye hai  
✔ Streams functional programming ka core hai  
✔ operations chaining possible hai  

---

# 🎯 Interview Questions

1. Programming paradigm kya hota hai?
2. Functional vs Structural difference?
3. Optional class kya hai?
4. filter vs map difference?
5. distinct() kya karta hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Programming paradigms  
✔ Functional vs Structural programming  
✔ Optional class  
✔ Stream operations (filter, map, sort, distinct)  

Ye topics Java ke **modern programming style** ko represent karte hain.