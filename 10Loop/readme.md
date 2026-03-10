# ☕ Java Lesson – Loops

Is lesson me hum seekhenge:

- Loop kya hota hai
- Java me loops kyu use hote hain
- for loop
- while loop
- do-while loop
- Loops ka comparison

---

# 📌 Loop Kya Hota Hai?

Loop ek **control structure** hai jo kisi code ko **bar-bar execute karne ke liye use hota hai**.

Example:

```
Agar hume "Hello" 100 baar print karna ho
```

Without loop:

```
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
...
100 times
```

Loop use karne se code short ho jata hai.

Example:

```
Loop → code ko multiple times run karna
```

---

# 📌 Java me Loops ke Types

Java me **3 main loops** hote hain:

```
Loops
│
├── for loop
├── while loop
└── do-while loop
```

---

# 1️⃣ for Loop

`for loop` tab use hota hai jab **number of iterations pata ho**.

Example:

```
1 se 10 tak print karna
```

---

### Syntax

```java
for(initialization; condition; update){
    // code
}
```

Explanation:

| Part | Meaning |
|-----|--------|
| initialization | loop start value |
| condition | loop kab tak chalega |
| update | value change |

---

### Example Program

```java
public class ForLoopExample {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){

            System.out.println(i);

        }

    }

}
```

---

### Output

```
1
2
3
4
5
```

Explanation:

```
i = 1 se start
condition i <= 5
har loop ke baad i++
```

---

# 2️⃣ while Loop

`while loop` tab use hota hai jab **iterations ka exact number pata na ho**.

Loop tab tak chalega jab tak **condition true ho**.

---

### Syntax

```java
while(condition){
    // code
}
```

---

### Example Program

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

### Output

```
1
2
3
4
5
```

Explanation:

```
i = 1
jab tak i <= 5 hai loop chalta rahega
```

---

# 3️⃣ do-while Loop

`do-while` loop me **code kam se kam ek baar execute hota hi hota hai**.

Condition baad me check hoti hai.

---

### Syntax

```java
do{
   // code
}
while(condition);
```

---

### Example Program

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

### Output

```
1
2
3
4
5
```

---

# 📊 Loops Comparison

| Loop | Condition Check | Use |
|-----|----------------|-----|
| for | start me | fixed iterations |
| while | start me | unknown iterations |
| do-while | end me | atleast 1 execution |

---

# Example – Table Print Using Loop

```java
public class TableExample {

    public static void main(String[] args) {

        int num = 5;

        for(int i = 1; i <= 10; i++){

            System.out.println(num + " x " + i + " = " + (num * i));

        }

    }

}
```

---

### Output

```
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
```

---

# ⚡ Important Points

- Loop code repetition ko reduce karta hai
- `for loop` fixed iterations ke liye best hai
- `while loop` condition based loops ke liye use hota hai
- `do-while` me code **kam se kam ek baar execute hota hai**

---

# 🎯 Interview Questions

1️⃣ Loop kya hota hai?  
2️⃣ Java me kitne types ke loops hote hain?  
3️⃣ for loop aur while loop me kya difference hai?  
4️⃣ do-while loop ka special feature kya hai?  
5️⃣ Infinite loop kya hota hai?

Example infinite loop:

```java
while(true){
    System.out.println("Hello");
}
```

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Loops kya hote hain  
✔ for loop  
✔ while loop  
✔ do-while loop  
✔ loops ka comparison  

Loops programming ka **bahut important concept hain jo repetitive tasks ko simple bana dete hain**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Nested Loops
- Pattern Printing
- Break and Continue