# ☕ Java Lesson 4 – User Input (Scanner Class)

Is lesson me hum seekhenge ki **Java program me user se input kaise lete hain**.

Java me user input lene ke liye hum **Scanner class** ka use karte hain.  
Scanner class `java.util` package me hoti hai.

Isliye hume program ke start me **Scanner import** karna padta hai.

```java
import java.util.Scanner;
```

---

# 1️⃣ Scanner Class Kya Hoti Hai

Scanner class ka use **keyboard se input lene ke liye** hota hai.

Example:

- Name input
- Age input
- Number input
- Text input

Scanner object banane ka syntax:

```java
Scanner variableName = new Scanner(System.in);
```

Example:

```java
Scanner input = new Scanner(System.in);
```

Yaha:

- `Scanner` → class ka naam
- `input` → object ka naam
- `System.in` → keyboard input

---

# 2️⃣ Example Program – User Input

## 📌 Code

```java
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Name : ");
        String userName = input.nextLine();

        System.out.println("Hi " + userName);

        System.out.print("Enter your age " + userName + ": ");
        int age = input.nextInt();

        System.out.println("Hello " + userName + " Your Age is " + age);

    }

}
```

---

# 3️⃣ Code Explanation

| Code | Explanation |
|-----|-------------|
| `import java.util.Scanner` | Scanner class import karte hain |
| `Scanner input = new Scanner(System.in)` | Scanner object create karte hain |
| `input.nextLine()` | User se text input leta hai |
| `input.nextInt()` | User se integer input leta hai |
| `System.out.print()` | Message display karta hai |

---

# 4️⃣ Example Input / Output

### Input

```
Please Enter Your Name : Sujit
Enter your age Sujit: 22
```

### Output

```
Hi Sujit
Hello Sujit Your Age is 22
```

---

# 5️⃣ Common Scanner Methods

| Method | Work |
|------|------|
| `nextLine()` | String input |
| `nextInt()` | Integer input |
| `nextFloat()` | Float input |
| `nextDouble()` | Double input |
| `nextBoolean()` | Boolean input |
| `next()` | Single word input |

---

# 6️⃣ Example – Different Data Types Input

```java
import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }

}
```

---

# 7️⃣ Program Flow

User Input Program ka flow kuch is tarah hota hai:

```
Import Scanner
      ↓
Create Scanner Object
      ↓
Ask Input from User
      ↓
Store Input in Variable
      ↓
Print Result
```

---

# ⚡ Important Points

- User input lene ke liye **Scanner class use hoti hai**
- Scanner **java.util package** me hoti hai
- `nextLine()` string input leta hai
- `nextInt()` integer input leta hai
- Scanner object banane ke liye `new` keyword use hota hai

---

# 🎯 Interview Questions

1️⃣ Java me user input kaise lete hain?  
2️⃣ Scanner class kis package me hoti hai?  
3️⃣ `next()` aur `nextLine()` me kya difference hai?  
4️⃣ Scanner object ka syntax kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ User input kya hota hai  
✔ Scanner class ka use  
✔ Scanner object create karna  
✔ `nextLine()` aur `nextInt()` ka use  
✔ Different data type input lena

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Arithmetic Operators
- Relational Operators
- Logical Operators