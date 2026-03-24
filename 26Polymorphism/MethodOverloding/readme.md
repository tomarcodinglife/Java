# ☕ Java Lesson – Method Overloading (Compile-Time Polymorphism)

Is lesson me hum seekhenge:

- Method overloading kya hota hai
- Overloading ke rules
- Compile-time polymorphism ka role
- Method overloading ke different cases
- Example programs

---

# 1️⃣ Method Overloading Kya Hota Hai?

Jab ek hi class me **same method name** ho lekin:

```
parameters different ho
```

to use **Method Overloading** kehte hain.

Example:

```
add(int a, int b)
add(int a, int b, int c)
```

---

# 2️⃣ Method Overloading Ka Purpose

Method overloading ka use hota hai:

```
same functionality ke liye different inputs handle karne ke liye
```

Example:

```
print(int)
print(double)
print(String)
```

---

# 3️⃣ Basic Example

```java
class Calculator {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class Test {

    public static void main(String[] args){

        Calculator c = new Calculator();

        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,4));
    }
}
```

Output

```
5
9
```

---

# 4️⃣ Method Overloading Rules

Method overload hone ke liye:

✔ Method name same hona chahiye  
✔ Parameters different hone chahiye  

Parameters different hone ke 3 tarike:

```
1. Number of parameters different
2. Data type different
3. Order of parameters different
```

---

# 5️⃣ Case 1 – Different Number of Parameters

```java
class Demo {

    void show(){
        System.out.println("No parameter");
    }

    void show(int a){
        System.out.println("One parameter");
    }

    void show(int a, int b){
        System.out.println("Two parameters");
    }
}
```

---

# 6️⃣ Case 2 – Different Data Type

```java
class Demo {

    void print(int a){
        System.out.println("Integer: " + a);
    }

    void print(double a){
        System.out.println("Double: " + a);
    }
}
```

---

# 7️⃣ Case 3 – Different Order of Parameters

```java
class Demo {

    void display(int a, String b){
        System.out.println(a + " " + b);
    }

    void display(String b, int a){
        System.out.println(b + " " + a);
    }
}
```

---

# 8️⃣ Invalid Overloading (Return Type Only)

Sirf return type change karne se overloading nahi hoti.

❌ Invalid example:

```java
class Demo {

    int add(int a, int b){
        return a + b;
    }

    double add(int a, int b){
        return a + b;
    }
}
```

Compiler error:

```
method add(int,int) is already defined
```

---

# 9️⃣ Method Overloading and Compile-Time Polymorphism

Method overloading ko kehte hain:

```
Compile-time Polymorphism
```

Kyunki:

```
Compiler decide karta hai kaunsa method call hoga
```

Example:

```java
Demo d = new Demo();

d.print(5);      // int version
d.print(5.5);    // double version
```

---

# 🔟 Constructor Overloading

Constructors bhi overload ho sakte hain.

```java
class Student {

    Student(){
        System.out.println("Default Constructor");
    }

    Student(String name){
        System.out.println("Name: " + name);
    }
}
```

---

# 1️⃣1️⃣ Real-Life Example

```java
class Printer {

    void print(String text){
        System.out.println(text);
    }

    void print(int number){
        System.out.println(number);
    }

    void print(String text, int number){
        System.out.println(text + " " + number);
    }
}
```

Usage:

```java
Printer p = new Printer();

p.print("Hello");
p.print(10);
p.print("Score", 95);
```

---

# 1️⃣2️⃣ Overloading vs Overriding

| Feature | Overloading | Overriding |
|--------|-------------|------------|
| Location | Same class | Parent + Child class |
| Parameters | Different | Same |
| Polymorphism | Compile-time | Run-time |

---

# 🎯 Interview Questions

1️⃣ Method overloading kya hota hai?  
2️⃣ Kya return type change karne se overloading hoti hai?  
3️⃣ Method overloading compile-time polymorphism kyun hai?  
4️⃣ Constructor overloading kya hota hai?  
5️⃣ Overloading aur overriding me difference kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Method overloading concept  
✔ Overloading rules  
✔ Compile-time polymorphism  
✔ Constructor overloading  
✔ Valid aur invalid cases  

Method overloading code ko **readable, flexible aur reusable** banata hai.