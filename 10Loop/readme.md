# ☕ Java Lesson – Loops, Nested Loops, Pattern Printing, Break & Continue

Is lesson me hum seekhenge:

- Loops kya hote hain
- Java me loops ke types
- Nested loops
- Pattern printing
- Break statement
- Continue statement

---

# 📌 Loop Kya Hota Hai?

Loop ek **control structure** hai jo kisi code ko **multiple times execute karne ke liye use hota hai**.

Example:

```
Agar hume 1 se 100 tak number print karna ho
```

Without loop:

```
System.out.println(1);
System.out.println(2);
System.out.println(3);
...
```

Loop use karne se code short aur efficient ho jata hai.

---

# 📌 Java me Loops ke Types

Java me 3 types ke loops hote hain:

```
Loops
│
├── for loop
├── while loop
└── do-while loop
```

---

# 1️⃣ for Loop

`for loop` tab use hota hai jab **iterations ka exact number pata ho**.

### Syntax

```java
for(initialization; condition; update){
    // code
}
```

### Example

```java
public class ForLoopExample {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

    }

}
```

Output:

```
1
2
3
4
5
```

---

# 2️⃣ while Loop

`while loop` tab use hota hai jab **iterations ka number fix na ho**.

### Syntax

```java
while(condition){
   // code
}
```

### Example

```java
public class WhileLoopExample {

    public static void main(String[] args) {

        int i = 1;

        while(i <= 5){
            System.out.println(i);
            i++;
        }

    }

}
```

---

# 3️⃣ do-while Loop

Is loop me **code kam se kam ek baar execute hota hi hota hai**.

### Syntax

```java
do{
   // code
}
while(condition);
```

### Example

```java
public class DoWhileExample {

    public static void main(String[] args) {

        int i = 1;

        do{
            System.out.println(i);
            i++;
        }
        while(i <= 5);

    }

}
```

---

# 📌 Nested Loops

Jab ek loop ke andar dusra loop hota hai use **Nested Loop** kehte hain.

Example structure:

```
Outer Loop
   └── Inner Loop
```

### Syntax

```java
for(){
    for(){
        // code
    }
}
```

---

# Example – Nested Loop

```java
public class NestedLoopExample {

    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++){

            for(int j = 1; j <= 3; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}
```

Output:

```
* * *
* * *
* * *
```

---

# ⭐ Pattern Printing

Pattern printing me **nested loops use hote hain**.

---

## Pattern 1 – Square Pattern

```java
public class SquarePattern {

    public static void main(String[] args) {

        for(int i = 1; i <= 4; i++){

            for(int j = 1; j <= 4; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}
```

Output:

```
* * * *
* * * *
* * * *
* * * *
```

---

## Pattern 2 – Right Triangle

```java
public class TrianglePattern {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){

            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}
```

Output:

```
*
* *
* * *
* * * *
* * * * *
```

---

# 📌 Break Statement

`break` statement ka use **loop ko immediately terminate karne ke liye hota hai**.

### Example

```java
public class BreakExample {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){

            if(i == 5){
                break;
            }

            System.out.println(i);

        }

    }

}
```

Output:

```
1
2
3
4
```

Explanation:

```
Jab i = 5 hua
loop break ho gaya
```

---

# 📌 Continue Statement

`continue` statement current iteration ko skip karta hai aur next iteration start karta hai.

### Example

```java
public class ContinueExample {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){

            if(i == 3){
                continue;
            }

            System.out.println(i);

        }

    }

}
```

Output:

```
1
2
4
5
```

Explanation:

```
i = 3 skip ho gaya
```

---

# 📊 Break vs Continue

| Statement | Work |
|-----------|------|
| break | loop ko completely stop karta hai |
| continue | current iteration skip karta hai |

---

# ⚡ Important Points

- Loop repetitive tasks ke liye use hota hai
- Nested loops pattern printing me use hote hain
- `break` loop terminate karta hai
- `continue` iteration skip karta hai
- Pattern printing programming practice ke liye important hai

---

# 🎯 Interview Questions

1️⃣ Loop kya hota hai?  
2️⃣ Java me kitne types ke loops hote hain?  
3️⃣ Nested loop kya hota hai?  
4️⃣ Break aur Continue me kya difference hai?  
5️⃣ Pattern printing me nested loop kyu use hota hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Loops  
✔ Nested loops  
✔ Pattern printing  
✔ Break statement  
✔ Continue statement  

Ye concepts **DSA aur logic building ke liye bahut important hain**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Arrays
- Array traversal
- Multi dimensional arrays