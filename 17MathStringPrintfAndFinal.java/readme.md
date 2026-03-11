# ☕ Java Lesson – Final Variable, Math Class & Strings

Is lesson me hum seekhenge:

- Final Variables
- Java Math class
- Strings in Java
- StringBuffer
- StringBuilder
- toString() method

---

# 1️⃣ Final Variable

**Final variable ek constant variable hai**, jiska value **ek baar assign karne ke baad change nahi hota**.

```java
public class FinalExample {
    public static void main(String[] args){
        final int MAX_VALUE = 100;
        System.out.println("Max Value = " + MAX_VALUE);
        // MAX_VALUE = 200; // Error: cannot assign a value
    }
}
```

Output:

```
Max Value = 100
```

✅ Use: Constants define karne ke liye, jaise PI, speed limits, etc.

---

# 2️⃣ Java Math Class

Java me **Math class** me **mathematical operations ke liye methods** available hote hain.  

### Common Methods

```java
public class MathExample {
    public static void main(String[] args){
        int a = 10, b = 3;

        System.out.println("Absolute a = " + Math.abs(-a));
        System.out.println("Max = " + Math.max(a,b));
        System.out.println("Min = " + Math.min(a,b));
        System.out.println("Power = " + Math.pow(a,b));
        System.out.println("Square root of b = " + Math.sqrt(b));
        System.out.println("Random number (0-1) = " + Math.random());
        System.out.println("Round 3.7 = " + Math.round(3.7));
        System.out.println("Ceil 3.2 = " + Math.ceil(3.2));
        System.out.println("Floor 3.8 = " + Math.floor(3.8));
    }
}
```

---

# 3️⃣ Strings in Java

- String **immutable hoti hai**  
- Object of `String` class  
- String literal ya `new String()` dono se create hoti hai

```java
public class StringExample {
    public static void main(String[] args){
        String s1 = "Sujit"; // literal
        String s2 = new String("Singh"); // new object

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        // String methods
        System.out.println("Length of s1 = " + s1.length());
        System.out.println("Uppercase s1 = " + s1.toUpperCase());
        System.out.println("Lowercase s2 = " + s2.toLowerCase());
        System.out.println("Char at index 2 in s1 = " + s1.charAt(2));
        System.out.println("Substring s2(0,3) = " + s2.substring(0,3));
        System.out.println("Contains 'jit' = " + s1.contains("jit"));
    }
}
```

---

# 4️⃣ StringBuffer

- **Mutable String** – value change possible  
- Thread-safe  
- Slower than StringBuilder

```java
public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // add text
        sb.insert(6, "Java "); // insert text
        sb.replace(0,5,"Hi"); // replace text
        sb.delete(3,7); // delete text
        System.out.println(sb);
        System.out.println("Length = " + sb.length());
        System.out.println("Capacity = " + sb.capacity());
    }
}
```

---

# 5️⃣ StringBuilder

- **Mutable String**  
- Non-thread-safe → faster than StringBuffer  

```java
public class StringBuilderExample {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Sujit");
        sb.append(" Singh");
        sb.insert(6,"Kumar ");
        sb.replace(0,5,"Hello");
        sb.delete(0,6);
        System.out.println(sb);
    }
}
```

---

# 6️⃣ toString() Method

- `toString()` method **object ka string representation return karta hai**  
- Sabhi classes me Object class ka `toString()` hota hai  
- Custom class me override karke object details print kar sakte hain

```java
class Student {
    String name;
    int age;

    Student(String n, int a){
        name = n;
        age = a;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
}

public class ToStringExample {
    public static void main(String[] args){
        Student s = new Student("Sujit", 22);
        System.out.println(s); // Automatically calls toString()
    }
}
```

Output:

```
Name: Sujit, Age: 22
```

---

# ⚡ Important Points

- **Final variable** = constant  
- **Math class** = mathematical operations  
- **String** = immutable, StringBuffer/StringBuilder = mutable  
- **toString()** = object representation  
- StringBuffer = thread-safe, StringBuilder = faster  

---

# 🎯 Interview Questions

1️⃣ Final variable kya hota hai?  
2️⃣ Math class ke common methods kaunse hain?  
3️⃣ String aur StringBuilder me difference kya hai?  
4️⃣ StringBuffer aur StringBuilder me difference kya hai?  
5️⃣ toString() method ka use aur override ka example kya hai?  

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Final variable ka use aur syntax  
✔ Java Math class ke common methods  
✔ String basics aur methods  
✔ StringBuffer aur StringBuilder usage  
✔ toString() method aur override  
✔ Mutable aur Immutable string concepts

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Java OOP Advanced  
- Inheritance  
- Polymorphism  
- Abstraction  
- Interfaces