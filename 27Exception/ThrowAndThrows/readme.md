# ☕ Java Lesson – throw vs throws (Complete Guide)

Is lesson me hum cover karenge:

- throw kya hota hai
- throws kya hota hai
- throw vs throws difference
- checked exception me throws ka role
- user-defined exception me throw ka use
- real programs aur interview points

---

# 1️⃣ throw Keyword Kya Hota Hai?

`throw` ka use hota hai:

```
manually exception generate karne ke liye
```

Ye method ke andar use hota hai aur ek **exception object** ko throw karta hai.

---

# 2️⃣ Basic Syntax of throw

```java
throw new ExceptionType("message");
```

Example:

```java
public class Test {

    public static void main(String[] args) {

        int age = 16;

        if(age < 18){
            throw new ArithmeticException("Not eligible for voting");
        }

        System.out.println("Eligible");
    }
}
```

---

# 3️⃣ throw Ka Flow

Program execution:

```
condition true → throw execute → program terminate
```

Agar try-catch na ho:

```
exception propagate hokar program crash kar deta hai
```

---

# 4️⃣ throws Keyword Kya Hota Hai?

`throws` ka use hota hai:

```
method declaration me exception ko forward karne ke liye
```

Ye compiler ko batata hai:

```
ye method exception throw kar sakta hai
```

---

# 5️⃣ Syntax of throws

```java
returnType methodName() throws ExceptionType {
}
```

Example:

```java
import java.io.*;

class Test {

    static void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
    }

    public static void main(String[] args) {

        try {
            readFile();
        } catch(IOException e){
            System.out.println("File not found");
        }
    }
}
```

---

# 6️⃣ throw vs throws – Key Difference

| Feature | throw | throws |
|--------|------|--------|
| Use | exception throw karna | exception declare karna |
| Location | method body | method signature |
| Object required | ✔ Yes | ❌ No |
| Multiple exceptions | ❌ No | ✔ Yes |

---

# 7️⃣ throw + throws Together

Example:

```java
class Test {

    static void checkAge(int age) throws Exception {

        if(age < 18){
            throw new Exception("Under age");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
```

Flow:

```
checkAge() → throws declare
throw → actual exception throw
```

---

# 8️⃣ Checked Exception me throws Mandatory

Checked exception (jaise IOException) ko:

```
either try-catch karo
ya throws likho
```

Example:

```java
void read() throws IOException {
    FileReader f = new FileReader("file.txt");
}
```

Agar throws na likhen:

```
compile-time error
```

---

# 9️⃣ Multiple Exceptions with throws

```java
void test() throws IOException, SQLException {
}
```

---

# 🔟 User-Defined Exception me throw

Custom exception:

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
    throw new InvalidAgeException("You are under age");
}
```

---

# 1️⃣1️⃣ throw Without try-catch

Agar exception unchecked hai:

```java
throw new ArithmeticException();
```

Compiler allow karta hai, lekin program crash ho jayega.

---

# 1️⃣2️⃣ Exception Propagation

```
method1 → method2 → method3
```

Agar method3 me exception aayi aur handle nahi hui:

```
throws ke through upar propagate hoti hai
```

Example:

```java
void m1() throws Exception {
    m2();
}

void m2() throws Exception {
    throw new Exception("Error");
}
```

---

# 1️⃣3️⃣ Real-Life Analogy

- **throw** → actual complaint karna
- **throws** → pehle se likhna: “main complaint kar sakta hoon”

---

# 1️⃣4️⃣ Common Errors

❌ throw without object

```java
throw Exception;   // wrong
```

✔ correct

```java
throw new Exception();
```

---

# 1️⃣5️⃣ Important Interview Questions

1. throw aur throws me difference kya hai?
2. Checked exception me throws kab mandatory hota hai?
3. Kya throw multiple exceptions ek saath kar sakta hai?
4. throws ka use overriding me kaise behave karta hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ throw ka use manually exception generate karne ke liye hota hai  
✔ throws ka use method declaration me hota hai  
✔ checked exception me throws mandatory ho sakta hai  
✔ throw + throws saath me use hote hain real programs me  

Java exception handling me **throw action hai aur throws declaration hai**.