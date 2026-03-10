# ☕ Java Lesson – Comments

Is lesson me hum seekhenge:

- Comments kya hote hain
- Java me comments kyu use hote hain
- Java me kitne types ke comments hote hain
- Single line comment
- Multi line comment
- Documentation comment

---

# 📌 Comments Kya Hote Hain?

Comments **program ke andar likha hua explanation** hote hain jo **compiler ignore kar deta hai**.

Matlab:

```
Comments sirf programmer ke liye hote hain
Compiler unhe execute nahi karta
```

Comments ka use hota hai:

- Code ko samjhane ke liye
- Code documentation ke liye
- Debugging ke liye
- Code temporarily disable karne ke liye

Example:

```java
// This is a comment
```

---

# 📌 Java me Comments ke Types

Java me **3 types ke comments** hote hain:

```
Comments
│
├── Single Line Comment
├── Multi Line Comment
└── Documentation Comment
```

---

# 1️⃣ Single Line Comment

Single line comment **sirf ek line ke liye hota hai**.

Iska syntax:

```java
// comment
```

Example:

```java
public class CommentExample {

    public static void main(String[] args) {

        // printing hello message
        System.out.println("Hello World");

    }

}
```

Explanation:

```
// se start hone wali line compiler ignore karta hai
```

---

# 2️⃣ Multi Line Comment

Multi-line comment **multiple lines ke explanation ke liye use hota hai**.

Syntax:

```java
/* comment */
```

Example:

```java
public class MultiLineComment {

    public static void main(String[] args) {

        /*
        This program prints
        a welcome message
        */

        System.out.println("Welcome to Java");

    }

}
```

Explanation:

```
/* se start
*/ se end
beech ka sab text comment hota hai
```

---

# 3️⃣ Documentation Comment (JavaDoc)

Documentation comments **software documentation generate karne ke liye use hote hain**.

Syntax:

```java
/** comment */
```

Example:

```java
/**
 * This class prints Hello World
 * Author : Sujit Kumar Singh
 */

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}
```

Documentation comments se **JavaDoc tool automatically documentation generate karta hai**.

---

# 📊 Comment Types Summary

| Comment Type | Syntax | Use |
|---------------|-------|-----|
| Single Line | `//` | One line comment |
| Multi Line | `/* */` | Multiple lines explanation |
| Documentation | `/** */` | Documentation generation |

---

# Example Program with All Comments

```java
/**
 * This program shows different types of comments
 */

public class CommentDemo {

    public static void main(String[] args) {

        // This is single line comment

        /*
        This is
        multi line
        comment
        */

        System.out.println("Java Comments Example");

    }

}
```

---

# ⚡ Important Points

- Comments compiler execute nahi karta
- Comments code readability improve karte hain
- Documentation comments professional projects me use hote hain
- Debugging ke time comments useful hote hain

---

# 🎯 Interview Questions

1️⃣ Java me comments kya hote hain?  
2️⃣ Java me kitne types ke comments hote hain?  
3️⃣ Single line aur multi-line comment me difference kya hai?  
4️⃣ Documentation comment ka use kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Comments kya hote hain  
✔ Single line comments  
✔ Multi-line comments  
✔ Documentation comments  

Comments **code ko readable aur understandable banane ke liye bahut important hote hain**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Loops in Java
- for loop
- while loop
- do while loop