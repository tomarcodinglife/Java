# ☕ Java Lesson 5 – Type Conversion & Type Casting

Is lesson me hum seekhenge:

- Type Conversion kya hota hai
- Type Casting kya hota hai
- Implicit Conversion
- Explicit Casting

Java me jab ek data type ko **dusre data type me convert kiya jata hai**, us process ko **Type Conversion** ya **Type Casting** kehte hain.

---

# 1️⃣ Type Conversion Kya Hota Hai

Type conversion ka matlab hai **ek data type ko automatically dusre compatible data type me convert karna**.

Isko **Implicit Conversion** bhi kehte hain.

Example:

```
int → float
int → double
float → double
```

Ye conversion **automatically Java compiler kar deta hai**.

---

# 2️⃣ Implicit Conversion (Automatic Conversion)

Isme **small data type automatically large data type me convert ho jata hai**.

Example:

```java
public class ImplicitExample {

    public static void main(String[] args) {

        int num = 5;

        float floatNumber = num;

        System.out.println(floatNumber);

    }

}
```

### Output

```
5.0
```

Yaha `int` automatically **float me convert** ho gaya.

---

# 3️⃣ Type Casting Kya Hota Hai

Jab hum **manually ek data type ko dusre data type me convert karte hain**, use **Type Casting** kehte hain.

Isko **Explicit Conversion** bhi kehte hain.

Example:

```
double → int
float → int
long → int
```

Is conversion me **data loss ho sakta hai**.

Syntax:

```java
dataType variable = (dataType) value;
```

Example:

```java
int num = (int) 5.9;
```

Output:

```
5
```

---

# 4️⃣ Example Program – Conversion & Casting

## 📌 Code

```java
import java.lang.*;
import java.util.Scanner;

public class TypeConversion {

    public static void main(String[] args) {

        // implicit conversion
        float floatNumber = 5;
        double doubleNumber = 3.1f;
        long longNumber = 7;

        // explicit conversion (casting)
        float floatNum = (float) 5.0;
        double doubleNum = (double) 5.0;
        long longNum = (long) 5.0;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(longNumber);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(longNum);

    }

}
```

---

# 5️⃣ Code Explanation

| Code | Meaning |
|-----|--------|
| `float floatNumber = 5;` | int automatically float me convert ho gaya |
| `double doubleNumber = 3.1f;` | float automatically double me convert ho gaya |
| `long longNumber = 7;` | int automatically long me convert ho gaya |
| `(float) 5.0` | double ko manually float me convert kiya |
| `(double) 5.0` | double ko explicitly assign kiya |
| `(long) 5.0` | double ko long me convert kiya |

---

# 6️⃣ Output

```
5.0
3.1
7
5.0
5.0
5
```

---

# 7️⃣ Primitive Type Conversion Hierarchy

Java me primitive type conversion ka order kuch is tarah hota hai:

```
byte → short → int → long → float → double
```

Left se right conversion **automatic hota hai**.

Example:

```
int → double   ✔ allowed
double → int   ❌ casting required
```

---

# 8️⃣ Implicit vs Explicit Conversion

| Type | Meaning |
|-----|--------|
| Implicit Conversion | Automatic conversion |
| Explicit Conversion | Manual casting |

Example:

```java
int a = 10;

double b = a;     // implicit

int c = (int) b;  // explicit
```

---

# ⚡ Important Points

- Java me data type conversion **automatic ya manual dono ho sakta hai**
- **Implicit conversion** me data loss nahi hota
- **Explicit casting** me data loss ho sakta hai
- Small → Large conversion automatic hota hai
- Large → Small conversion me casting zaroori hoti hai

---

# 🎯 Interview Questions

1️⃣ Type conversion kya hota hai?  
2️⃣ Implicit conversion kya hota hai?  
3️⃣ Explicit casting kya hota hai?  
4️⃣ Java me primitive conversion hierarchy kya hai?  
5️⃣ `double` ko `int` me kaise convert karte hain?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Type Conversion  
✔ Type Casting  
✔ Implicit Conversion  
✔ Explicit Conversion  
✔ Primitive type hierarchy

Type conversion **Java programming me bahut common concept hai** aur numeric operations me frequently use hota hai.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Arithmetic Operators
- Unary Operators
- Relational Operators
- Logical Operators