# ☕ Java Lesson 1 – Hello World & Printing Output

Is lesson me hum Java ka **sabse basic program (Hello World)** aur console par **single line aur multi line printing** seekhenge.

Java me har program **class ke andar likha jata hai** aur execution **main() method se start hota hai**.

---

# 1️⃣ Hello World Program

Hello World program programming ka **sabse pehla aur simplest program** hota hai jo sirf ek message print karta hai.

## 📌 Example Code

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}
```

## 🧠 Explanation

| Code | Meaning |
|-----|--------|
| `public` | Access modifier (sab jagah se accessible) |
| `class` | Java me program class ke andar likha jata hai |
| `HelloWorld` | Class ka naam |
| `main()` | Program ka entry point |
| `System.out.println()` | Console par text print karta hai |

## ▶ Output

```
Hello World
```

---

# 2️⃣ Single Line Printing

Single line printing ka matlab hai **ek hi line me output print karna**.

Java me hum `System.out.print()` ka use karte hain.

## 📌 Example Code

```java
public class SingleLinePrint {

    public static void main(String[] args) {

        System.out.print("Hello ");
        System.out.print("Sujit");

    }

}
```

## ▶ Output

```
Hello Sujit
```

🔎 **Important:**  
`print()` new line create nahi karta.

---

# 3️⃣ Multi Line Printing

Multi line printing ka matlab hai **har output next line me print hona**.

Iske liye `println()` method use hota hai.

## 📌 Example Code

```java
public class MultiLinePrint {

    public static void main(String[] args) {

        System.out.println("Sujit");
        System.out.println("Kumar");
        System.out.println("Singh");

    }

}
```

## ▶ Output

```
Sujit
Kumar
Singh
```

🔎 **Important:**  
`println()` automatically **new line create karta hai**.

---

# 4️⃣ Difference Between print() and println()

| Method | Work |
|------|------|
| `print()` | Same line me output print karta hai |
| `println()` | Output print karke next line me chala jata hai |

## 📌 Example Code

```java
public class PrintExample {

    public static void main(String[] args) {

        System.out.print("Java ");
        System.out.print("Programming");

        System.out.println();

        System.out.println("Java");
        System.out.println("Programming");

    }

}
```

## ▶ Output

```
Java Programming
Java
Programming
```

---

# 5️⃣ Java Program Structure

Ek basic Java program ka structure kuch is tarah hota hai:

```
Class
 └── main() Method
       └── Statements
```

## 📌 Example Structure Code

```java
public class ProgramName {

    public static void main(String[] args) {

        // Program statements yaha likhe jate hain

    }

}
```

---

# ⚡ Important Points

- Java ek **object oriented programming language** hai.
- Har Java program **class ke andar likha jata hai**.
- Program execution **main() method se start hota hai**.
- `System.out.println()` console par output print karta hai.
- `print()` same line me print karta hai.
- `println()` new line create karta hai.

---

# 🎯 Interview Questions

1️⃣ Java program ka entry point kya hota hai?  
2️⃣ `System.out.println()` kya karta hai?  
3️⃣ `print()` aur `println()` me kya difference hai?  
4️⃣ Java program ka basic structure kya hota hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Hello World program  
✔ Java program ka basic structure  
✔ Single line printing  
✔ Multi line printing  
✔ `print()` vs `println()` difference  

Ye Java programming ka **foundation lesson** hai.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Variables
- Data Types
- Naming Rules
- Memory Basics