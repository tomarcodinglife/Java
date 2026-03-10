# ☕ Java Lesson 6 – Operators in Java

Is lesson me hum seekhenge:

- Operators kya hote hain
- Arithmetic Operators
- Assignment Operators
- Logical Operators
- Relational Operators
- Unary Operators
- Order of Operations (BODMAS Rule)

Java me **operators special symbols hote hain jo variables aur values par operations perform karte hain.**

Example:

```
5 + 3
10 > 4
a = b
```

---

# 1️⃣ Arithmetic Operators

Arithmetic operators **mathematical calculations** ke liye use hote hain.

| Operator | Meaning |
|--------|--------|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus (remainder) |

## Example Code

```java
public class ArithmeticExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }

}
```

## Output

```
15
5
50
2
0
```

---

# 2️⃣ Assignment Operators

Assignment operator ka use **value assign karne ke liye** hota hai.

| Operator | Example | Meaning |
|--------|--------|--------|
| `=` | a = 10 | Assign value |
| `+=` | a += 5 | a = a + 5 |
| `-=` | a -= 5 | a = a - 5 |
| `*=` | a *= 2 | a = a * 2 |
| `/=` | a /= 2 | a = a / 2 |

## Example

```java
public class AssignmentExample {

    public static void main(String[] args) {

        int a = 10;

        a += 5;
        System.out.println(a);

        a *= 2;
        System.out.println(a);

    }

}
```

Output

```
15
30
```

---

# 3️⃣ Relational Operators

Relational operators **comparison** ke liye use hote hain.

Ye result **true ya false** return karte hain.

| Operator | Meaning |
|--------|--------|
| `==` | Equal |
| `!=` | Not Equal |
| `>` | Greater Than |
| `<` | Less Than |
| `>=` | Greater or Equal |
| `<=` | Less or Equal |

## Example

```java
public class RelationalExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

    }

}
```

Output

```
true
false
false
true
```

---

# 4️⃣ Logical Operators

Logical operators **multiple conditions check** karne ke liye use hote hain.

| Operator | Meaning |
|--------|--------|
| `&&` | Logical AND |
| `||` | Logical OR |
| `!` | Logical NOT |

## Example

```java
public class LogicalExample {

    public static void main(String[] args) {

        int age = 20;
        boolean hasLicense = true;

        System.out.println(age >= 18 && hasLicense);
        System.out.println(age >= 18 || hasLicense);
        System.out.println(!hasLicense);

    }

}
```

Output

```
true
true
false
```

---

# 5️⃣ Unary Operators

Unary operator **single operand par operation karta hai**.

| Operator | Meaning |
|--------|--------|
| `+` | Positive |
| `-` | Negative |
| `++` | Increment |
| `--` | Decrement |
| `!` | Logical NOT |

## Example

```java
public class UnaryExample {

    public static void main(String[] args) {

        int a = 5;

        a++;
        System.out.println(a);

        a--;
        System.out.println(a);

    }

}
```

Output

```
6
5
```

---

# 6️⃣ Order of Operations (BODMAS Rule)

Java expressions evaluate karte waqt **BODMAS rule follow karta hai**.

BODMAS ka matlab:

```
B → Brackets
O → Order (Power)
D → Division
M → Multiplication
A → Addition
S → Subtraction
```

---

# Example Program

```java
public class OrderOfOperations {

    public static void main (String[] args) {

        System.out.println(10 - 5 * 4);

        System.out.println(10 * 5 * 2 + 5 / 2 - 2); // BODMAS Rule Follow

        System.out.println(10 / (4 / 2)); // BODMAS Rule Follow

    }

}
```

---

# Output Explanation

### Expression 1

```
10 - 5 * 4
```

Step:

```
5 * 4 = 20
10 - 20 = -10
```

Output

```
-10
```

---

### Expression 2

```
10 * 5 * 2 + 5 / 2 - 2
```

Step:

```
10 * 5 = 50
50 * 2 = 100
5 / 2 = 2
100 + 2 = 102
102 - 2 = 100
```

Output

```
100
```

---

### Expression 3

```
10 / (4 / 2)
```

Step:

```
4 / 2 = 2
10 / 2 = 5
```

Output

```
5
```

---

# ⚡ Important Points

- Operators values par operations perform karte hain
- Arithmetic operators mathematical operations ke liye use hote hain
- Relational operators comparison ke liye use hote hain
- Logical operators multiple conditions check karte hain
- Unary operators single operand par kaam karte hain
- Java expressions **BODMAS rule follow karte hain**

---

# 🎯 Interview Questions

1️⃣ Java me operators kya hote hain?  
2️⃣ Arithmetic operators ka use kya hai?  
3️⃣ `==` aur `=` me kya difference hai?  
4️⃣ Logical AND (`&&`) ka kya use hai?  
5️⃣ BODMAS rule kya hota hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Arithmetic Operators  
✔ Assignment Operators  
✔ Relational Operators  
✔ Logical Operators  
✔ Unary Operators  
✔ Order of Operations (BODMAS)

Operators **Java programming ka fundamental concept** hain aur almost har program me use hote hain.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Conditional Statements
- if
- if-else
- else-if
- Nested if