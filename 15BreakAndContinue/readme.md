# ☕ Java Lesson – Break & Continue Statements

Is lesson me hum seekhenge:

- Break statement  
- Continue statement  
- For, While, Do-While loops ke saath usage  
- Nested loops me break & continue  

---

# 📌 Break Statement

**Break statement loop ko turant terminate kar deta hai** aur loop ke bahar control le jata hai.  

Syntax:

```java
for(initialization; condition; increment){
    if(condition_to_break){
        break;
    }
}
```

### Example – Break in For Loop

```java
public class BreakExample {
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            if(i == 5){
                break; // loop terminate hoga jab i=5
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

---

### Example – Break in While Loop

```java
public class BreakWhile {
    public static void main(String[] args){
        int i = 1;
        while(i <= 10){
            if(i == 7) break;
            System.out.println(i);
            i++;
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
6
```

---

# 📌 Continue Statement

**Continue statement loop ke current iteration ko skip kar deta hai** aur next iteration pe chala jata hai.  

Syntax:

```java
for(initialization; condition; increment){
    if(condition_to_skip){
        continue;
    }
}
```

### Example – Continue in For Loop

```java
public class ContinueExample {
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            if(i % 2 == 0) continue; // Even number skip
            System.out.println(i); // Only odd numbers print
        }
    }
}
```

Output:

```
1
3
5
7
9
```

---

### Example – Continue in While Loop

```java
public class ContinueWhile {
    public static void main(String[] args){
        int i = 0;
        while(i < 10){
            i++;
            if(i % 3 == 0) continue; // multiple of 3 skip
            System.out.print(i + " ");
        }
    }
}
```

Output:

```
1 2 4 5 7 8 10
```

---

# 📌 Nested Loops with Break & Continue

**Nested loops me break sirf current loop ko affect karta hai** jisme break use hua hai.  

### Example – Nested Loop with Break

```java
public class NestedBreak {
    public static void main(String[] args){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                if(j==3) break;
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
```

Output:

```
i=1, j=1
i=1, j=2
i=2, j=1
i=2, j=2
i=3, j=1
i=3, j=2
```

---

### Example – Nested Loop with Continue

```java
public class NestedContinue {
    public static void main(String[] args){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                if(j==3) continue; // skip j=3
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
```

Output:

```
i=1, j=1
i=1, j=2
i=1, j=4
i=1, j=5
i=2, j=1
i=2, j=2
i=2, j=4
i=2, j=5
i=3, j=1
i=3, j=2
i=3, j=4
i=3, j=5
```

---

# ⚡ Important Points

- **Break** → loop ko turant terminate karta hai  
- **Continue** → loop ke current iteration ko skip karta hai  
- **Nested loops** me break sirf inner loop ko affect karta hai  
- Decision making ke saath loops me **flow control** ke liye use hote hain  

---

# 🎯 Interview Questions

1️⃣ Break aur continue me difference kya hai?  
2️⃣ Nested loop me break aur continue ka effect kaise hota hai?  
3️⃣ Infinite loop me break ka use kaise karenge?  
4️⃣ Odd/Even numbers print karte waqt continue ka example kya ho sakta hai?  
5️⃣ While loop me break aur continue ka syntax kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Break statement  
✔ Continue statement  
✔ For, While, Do-While loops ke saath examples  
✔ Nested loops me break & continue  
✔ Loop control flow ka use

Loops ke saath **break aur continue programming me flow control aur optimization ke liye bahut important hai**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Functions / Methods in Java  
- Parameterized functions  
- Return type functions  
- Function practice challenges (Armstrong, Factorial, Fibonacci, etc.)