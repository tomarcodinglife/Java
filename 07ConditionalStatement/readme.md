# ☕ Java Lesson 7 – Conditional Statements

Is lesson me hum seekhenge:

- Conditional Statements kya hote hain
- if statement
- if-else statement
- else-if ladder

Java me **conditional statements ka use decision making ke liye hota hai**.

Matlab program kisi **condition ko check karta hai aur uske basis par decision leta hai**.

Example:

```
Agar age ≥ 18 → vote kar sakte ho
Agar age < 18 → vote nahi kar sakte
```

---

# 1️⃣ if Statement

`if` statement tab use hota hai jab **sirf ek condition check karni ho**.

Agar condition **true** hogi to code execute hoga.

### Syntax

```java
if(condition){
    // code execute hoga
}
```

---

## Example – if Statement

```java
public class IfExample {

    public static void main(String[] args) {

        int age = 20;

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }

    }

}
```

### Output

```
You are eligible to vote
```

Explanation:

```
age = 20
20 >= 18 → true
Isliye message print hua
```

---

# 2️⃣ if-else Statement

`if-else` tab use hota hai jab **do possible situations ho**.

- Condition true → if block run
- Condition false → else block run

---

### Syntax

```java
if(condition){
    // true block
}
else{
    // false block
}
```

---

## Example – if-else

```java
public class IfElseExample {

    public static void main(String[] args) {

        int age = 16;

        if(age >= 18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }

    }

}
```

### Output

```
You cannot vote
```

Explanation:

```
age = 16
16 >= 18 → false
Isliye else block run hua
```

---

# 3️⃣ else-if Ladder

Jab **multiple conditions check karni ho**, tab `else-if` ladder use karte hain.

Example:

```
Marks ke basis par grade decide karna
```

---

### Syntax

```java
if(condition1){
    // code
}
else if(condition2){
    // code
}
else if(condition3){
    // code
}
else{
    // default code
}
```

---

## Example – else-if

```java
public class GradeExample {

    public static void main(String[] args) {

        int marks = 75;

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 75){
            System.out.println("Grade B");
        }
        else if(marks >= 50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }

    }

}
```

---

### Output

```
Grade B
```

Explanation:

```
marks = 75

marks >= 90 → false
marks >= 75 → true

Isliye Grade B print hua
```

---

# 4️⃣ Flow Diagram

Conditional statements ka flow kuch is tarah hota hai:

```
Condition Check
      ↓
   true / false
      ↓
Execute Block
```

Example:

```
if(condition)
     ↓
 true → if block
 false → else block
```

---

# 5️⃣ Real Life Example

ATM withdrawal example:

```
if(balance >= withdrawalAmount){
    allow withdrawal
}
else{
    show insufficient balance
}
```

---

# ⚡ Important Points

- Conditional statements decision making ke liye use hote hain
- `if` statement sirf **true condition me run hota hai**
- `if-else` me **do situations handle hoti hain**
- `else-if` ladder me **multiple conditions check hoti hain**
- Conditions me relational operators use hote hain

Example:

```
>
<
>=
<=
==
!=
```

---

# 🎯 Interview Questions

1️⃣ Conditional statement kya hota hai?  
2️⃣ `if` aur `if-else` me kya difference hai?  
3️⃣ `else-if` ladder kab use hota hai?  
4️⃣ Java me decision making kaise hoti hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ if statement  
✔ if-else statement  
✔ else-if ladder  
✔ decision making logic  

Conditional statements **program logic ka bahut important part hain**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Switch Statement
- Nested Conditions
- Ternary Operator