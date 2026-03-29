# ☕ Java Lesson – Exception Handling (Complete Guide)

Is lesson me hum cover karenge:

- Exception kya hota hai
- try, catch, finally
- throw vs throws
- Built-in vs User-defined exception
- Checked vs Unchecked exception
- Exception hierarchy

---

# 1️⃣ Exception Kya Hota Hai?

Exception ek **runtime error** hota hai jo program ke normal flow ko disturb karta hai.

Example:

```
10 / 0 → ArithmeticException
```

---

# 2️⃣ Exception Handling Kyun Zaruri Hai?

Agar exception handle na kare:

```
program crash ho jata hai
```

Exception handling se:

```
program safely continue kar sakta hai
```

---

# 3️⃣ try – catch Block

Basic syntax:

```java
try {
    risky code
} catch (ExceptionType e) {
    handling code
}
```

Example:

```java
public class Test {

    public static void main(String[] args){

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
```

---

# 4️⃣ finally Block

finally block **hamesha execute hota hai**.

```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e){
    System.out.println("Error");
} finally {
    System.out.println("Always executed");
}
```

---

# 5️⃣ Multiple catch Blocks

```java
try {
    int arr[] = new int[5];
    arr[10] = 50;
} catch (ArithmeticException e){
    System.out.println("Arithmetic error");
} catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Array index error");
}
```

---

# 6️⃣ Built-in Exceptions

Java already provide karta hai:

| Exception | Cause |
|----------|------|
| ArithmeticException | divide by zero |
| NullPointerException | null object use |
| ArrayIndexOutOfBoundsException | wrong index |
| NumberFormatException | invalid number |

---

# 7️⃣ Checked vs Unchecked Exception

## Checked Exception

Compile-time par check hoti hai.

Example:

```
IOException
SQLException
```

Compiler bolta hai:

```
handle karo ya throws likho
```

## Unchecked Exception

Runtime par hoti hai.

Example:

```
ArithmeticException
NullPointerException
```

---

# 8️⃣ Checked vs Unchecked Table

| Feature | Checked | Unchecked |
|--------|---------|-----------|
| Check time | Compile time | Runtime |
| Handle required | ✔ Yes | ❌ No |
| Example | IOException | ArithmeticException |

---

# 9️⃣ throw Keyword

throw ka use hota hai:

```
manually exception create karne ke liye
```

Example:

```java
public class Test {

    public static void main(String[] args){

        int age = 15;

        if(age < 18){
            throw new ArithmeticException("Not eligible");
        }
    }
}
```

---

# 🔟 throws Keyword

throws ka use hota hai:

```
method declaration me exception forward karne ke liye
```

Example:

```java
void readFile() throws IOException {
    // file reading code
}
```

---

# 1️⃣1️⃣ throw vs throws

| throw | throws |
|------|--------|
| actual exception throw karta hai | method declare karta hai |
| method body me use | method signature me use |

---

# 1️⃣2️⃣ User-Defined Exception

Aap khud ki exception class bana sakte ho:

```java
class InvalidAgeException extends Exception {

    InvalidAgeException(String msg){
        super(msg);
    }
}
```

Use:

```java
if(age < 18){
    throw new InvalidAgeException("Under age");
}
```

---

# 1️⃣3️⃣ Exception Hierarchy

```
Throwable
 ├── Error
 └── Exception
       ├── Checked
       └── RuntimeException
```

RuntimeException ke niche:

```
ArithmeticException
NullPointerException
```

---

# 1️⃣4️⃣ Example – Complete Program

```java
class Test {

    static void checkAge(int age) throws Exception {

        if(age < 18){
            throw new Exception("Not eligible");
        }
    }

    public static void main(String[] args){

        try {
            checkAge(15);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
```

---

# 1️⃣5️⃣ Important Rules

✔ finally always execute hota hai  
✔ checked exception handle karna mandatory hai  
✔ unchecked exception optional hai  
✔ throw ek exception object throw karta hai  

---

# 🎯 Interview Questions

1️⃣ Exception aur error me kya difference hai?  
2️⃣ throw aur throws me difference kya hai?  
3️⃣ Checked aur unchecked exception me difference?  
4️⃣ finally block kab execute nahi hota?  
5️⃣ User-defined exception kaise banate hain?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ try, catch, finally  
✔ throw vs throws  
✔ Built-in exceptions  
✔ Checked vs unchecked  
✔ User-defined exceptions  
✔ Exception hierarchy  

Exception handling Java me **robust aur crash-free applications** banane ke liye essential hai.