# ☕ Java Lesson – Filter & Reduce in Java (Stream API)

Is lesson me hum seekhenge:

- Stream kya hota hai
- filter() method
- reduce() method
- Real examples
- Functional programming flow

---

# 1️⃣ Stream Kya Hota Hai?

Stream ka matlab:

```
data ko process karna (collection par)
```

Example:

```
filter → transform → result
```

---

# 2️⃣ filter() Kya Hota Hai?

filter() use hota hai:

```
condition ke basis par data select karne ke liye
```

---

# 3️⃣ filter() Syntax

```java
stream.filter(condition)
```

---

# 4️⃣ Example – Even Numbers

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
```

Output:

```
2
4
6
```

---

# 5️⃣ Multiple Filters

```java
list.stream()
    .filter(n -> n > 2)
    .filter(n -> n % 2 == 0)
    .forEach(System.out::println);
```

---

# 6️⃣ reduce() Kya Hota Hai?

reduce() ka use hota hai:

```
multiple values ko ek single result me convert karna
```

---

# 7️⃣ reduce() Syntax

```java
stream.reduce(identity, accumulator)
```

---

# 8️⃣ Example – Sum

```java
int sum = list.stream()
              .reduce(0, (a, b) -> a + b);

System.out.println(sum);
```

Output:

```
21
```

---

# 9️⃣ Example – Max Value

```java
int max = list.stream()
              .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

System.out.println(max);
```

---

# 🔟 Combined Example (Filter + Reduce)

```java
int sum = list.stream()
              .filter(n -> n % 2 == 0)
              .reduce(0, (a, b) -> a + b);

System.out.println(sum);
```

Output:

```
12
```

---

# 1️⃣1️⃣ Flow Samjho

```
List → Stream → Filter → Reduce → Result
```

---

# 1️⃣2️⃣ Real-Life Example

```
students list:
filter → pass students
reduce → total marks
```

---

# 1️⃣3️⃣ Important Points

✔ filter → condition based selection  
✔ reduce → final result  
✔ dono functional programming ka core hai  

---

# 1️⃣4️⃣ Advantages

✔ clean code  
✔ less loops  
✔ readable  
✔ parallel processing possible  

---

# 🎯 Interview Questions

1. filter() kya karta hai?
2. reduce() kya hota hai?
3. reduce ka identity kya hota hai?
4. filter aur map me difference?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Stream concept  
✔ filter() method  
✔ reduce() method  
✔ combined usage  
✔ real examples  

Filter & Reduce Java me **data processing ko simple aur powerful banate hain**.