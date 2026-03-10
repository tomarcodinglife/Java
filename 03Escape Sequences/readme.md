# ☕ Java Lesson 3 – Escape Sequences

Is lesson me hum **Escape Sequences** ke bare me seekhenge.

Escape sequences special characters hote hain jo **string ke andar special formatting ya control characters** ko represent karte hain.

Ye generally **backslash `\` se start hote hain**.

Example:

```
\n
\t
\"
\\
```

---

# 1️⃣ Escape Sequence Kya Hota Hai

Escape sequence ek **special character combination** hota hai jo string me special action perform karta hai.

Example:

```java
System.out.println("Hello\nWorld");
```

Output:

```
Hello
World
```

Yaha `\n` new line create karta hai.

---

# 2️⃣ Common Escape Sequences in Java

| Escape Sequence | Meaning |
|----------------|--------|
| `\n` | New Line |
| `\t` | Tab Space |
| `\"` | Double Quote print karne ke liye |
| `\'` | Single Quote print karne ke liye |
| `\\` | Backslash print karne ke liye |
| `\b` | Backspace |
| `\r` | Carriage Return |
| `\f` | Form Feed |

---

# 3️⃣ Example – New Line (`\n`)

```java
public class NewLineExample {

    public static void main(String[] args) {

        System.out.println("Hello\nSujit");

    }

}
```

## Output

```
Hello
Sujit
```

---

# 4️⃣ Example – Tab Space (`\t`)

```java
public class TabExample {

    public static void main(String[] args) {

        System.out.println("Java\tProgramming");

    }

}
```

## Output

```
Java    Programming
```

---

# 5️⃣ Example – Double Quotes (`\"`)

```java
public class QuoteExample {

    public static void main(String[] args) {

        System.out.println("He said \"Hello\"");

    }

}
```

## Output

```
He said "Hello"
```

---

# 6️⃣ Example – Backslash (`\\`)

```java
public class BackslashExample {

    public static void main(String[] args) {

        System.out.println("C:\\Program Files\\Java");

    }

}
```

## Output

```
C:\Program Files\Java
```

---

# 7️⃣ Multiple Escape Sequence Example

```java
public class EscapeExample {

    public static void main(String[] args) {

        System.out.println("Name:\tSujit");
        System.out.println("City:\tJamshedpur");
        System.out.println("Message:\nWelcome to Java");

    }

}
```

## Output

```
Name:   Sujit
City:   Jamshedpur
Message:
Welcome to Java
```

---

# 8️⃣ Real Use Case

Escape sequences ka use **formatting aur file paths me bahut hota hai**.

Example:

```java
public class FilePathExample {

    public static void main(String[] args) {

        System.out.println("File Path: C:\\Users\\Sujit\\Documents");

    }

}
```

Output:

```
File Path: C:\Users\Sujit\Documents
```

---

# ⚡ Important Points

- Escape sequence **`\` backslash se start hota hai**
- Ye string ke andar **special formatting ke liye use hota hai**
- `\n` new line create karta hai
- `\t` tab space create karta hai
- `\"` double quote print karta hai
- `\\` backslash print karta hai

---

# 🎯 Interview Questions

1️⃣ Escape sequence kya hota hai?

2️⃣ Java me `\n` ka kya use hai?

3️⃣ `\t` kya karta hai?

4️⃣ Java me double quote kaise print karte hain?

5️⃣ `\\` ka use kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Escape sequence kya hota hai  
✔ Common escape sequences  
✔ `\n` new line  
✔ `\t` tab space  
✔ `\"` double quotes  
✔ `\\` backslash  

Escape sequences **string formatting ke liye bahut useful hote hain**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- User Input in Java
- Scanner Class
- Reading different data types