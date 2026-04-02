# ☕ Java Lesson – Wrapper Classes (Complete Guide)

Is lesson me hum seekhenge:

- Wrapper class kya hoti hai
- Primitive vs Wrapper difference
- Autoboxing & Unboxing
- Important wrapper classes
- Use cases aur examples

---

# 1️⃣ Wrapper Class Kya Hoti Hai?

Wrapper class ka matlab:

```
primitive data type ko object me convert karna
```

Java me har primitive type ka ek wrapper class hota hai.

---

# 2️⃣ Primitive vs Wrapper

| Primitive | Wrapper Class |
|----------|--------------|
| int | Integer |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |
| long | Long |
| short | Short |
| byte | Byte |

---

# 3️⃣ Wrapper Class Ka Use Kyun?

Java me kuch features:

```
sirf objects ke saath kaam karte hain
```

Example:

```
Collections Framework
ArrayList
```

Isliye primitives ko object banana padta hai.

---

# 4️⃣ Autoboxing

Autoboxing ka matlab:

```
primitive → object conversion automatically
```

Example:

```java
public class Test {

    public static void main(String[] args){

        int a = 10;

        Integer obj = a; // autoboxing

        System.out.println(obj);
    }
}
```

---

# 5️⃣ Unboxing

Unboxing ka matlab:

```
object → primitive conversion
```

Example:

```java
Integer obj = 20;

int num = obj; // unboxing

System.out.println(num);
```

---

# 6️⃣ Manual Conversion

```java
int a = 10;

Integer obj = Integer.valueOf(a);

int num = obj.intValue();
```

---

# 7️⃣ Wrapper Class Methods

Example with Integer:

```java
Integer num = 100;

System.out.println(num.toString());
System.out.println(num.compareTo(50));
System.out.println(Integer.parseInt("123"));
```

---

# 8️⃣ String to Primitive

```java
String str = "50";

int num = Integer.parseInt(str);

System.out.println(num + 10); // 60
```

---

# 9️⃣ Primitive to String

```java
int num = 100;

String str = String.valueOf(num);
```

---

# 🔟 Wrapper Class Example

```java
import java.util.ArrayList;

class Test {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // autoboxing
        list.add(20);

        for(Integer n : list){
            System.out.println(n); // unboxing
        }
    }
}
```

---

# 1️⃣1️⃣ Important Points

✔ Wrapper classes immutable hoti hain  
✔ null value store kar sakti hain (primitive nahi)  
✔ collections me required hoti hain  

---

# 1️⃣2️⃣ Performance Note

```
Wrapper slower hota hai primitive se
```

Kyunki:

```
object creation + memory overhead
```

---

# 🎯 Interview Questions

1. Wrapper class kya hoti hai?
2. Autoboxing aur unboxing kya hai?
3. Primitive aur wrapper me difference?
4. Collections me primitive kyun use nahi hota?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Wrapper class concept  
✔ Primitive vs object difference  
✔ Autoboxing & Unboxing  
✔ Conversion methods  
✔ Real-life usage  

Wrapper classes Java me **primitive aur object world ke beech bridge** ka kaam karti hain.