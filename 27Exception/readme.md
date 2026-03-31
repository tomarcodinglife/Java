# ☕ Java Lesson – Exception, throw, throws & Custom Exception (Complete Guide)

Is lesson me hum cover karenge:

- Exception kya hota hai
- Built-in exceptions
- throw keyword
- throws keyword
- Custom (User-defined) exception
- Exception flow aur real programs

---

# 1️⃣ Exception Kya Hota Hai?

Exception ek **runtime problem** hota hai jo program ke normal flow ko disturb karta hai.

Example:

```
10 / 0 → ArithmeticException
```

Agar exception handle na kiya jaye:

```
program terminate ho jata hai
```

---

# 2️⃣ Built-in Exceptions

Java already bahut saare exceptions provide karta hai.

| Exception | Cause |
|----------|------|
| ArithmeticException | divide by zero |
| NullPointerException | null object |
| ArrayIndexOutOfBoundsException | invalid index |
| NumberFormatException | invalid number |

Example:

```java
int a = 10 / 0;  // ArithmeticException
```

---

# 3️⃣ Exception Handling Basic Syntax

```java
try {
    risky code
} catch(Exception e) {
    handling code
}
```

Example:

```java
try {
    int a = 10 / 0;
} catch(ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

---

# 4️⃣ throw Keyword

`throw` ka use hota hai:

```
manually exception generate karne ke liye
```

Syntax:

```java
throw new ExceptionType("message");
```

Example:

```java
int age = 15;

if(age < 18){
    throw new ArithmeticException("Not eligible");
}
```

---

# 5️⃣ throws Keyword

`throws` ka use hota hai:

```
method declaration me exception ko forward karne ke liye
```

Example:

```java
void readFile() throws IOException {
}
```

---

# 6️⃣ throw vs throws

| Feature | throw | throws |
|--------|------|--------|
| Use | exception throw karna | exception declare karna |
| Location | method body | method signature |
| Object required | ✔ Yes | ❌ No |

---

# 7️⃣ Custom Exception Kya Hoti Hai?

Aap khud ki exception class bana sakte ho jab built-in exception sufficient na ho.

Example:

```java
class InvalidAgeException extends Exception {

    InvalidAgeException(String msg){
        super(msg);
    }
}
```

---

# 8️⃣ Custom Exception Throw Karna

```java
static void checkAge(int age) throws InvalidAgeException {

    if(age < 18){
        throw new InvalidAgeException("Under age");
    }
}
```

---

# 9️⃣ Custom Exception Handle Karna

```java
public static void main(String[] args) {

    try {
        checkAge(15);
    } catch(InvalidAgeException e){
        System.out.println(e.getMessage());
    }
}
```

Output:

```
Under age
```

---

# 🔟 Exception Flow

```
method → throw → throws → try-catch → handled
```

---

# 1️⃣1️⃣ Complete Example Program

```java
class InvalidAgeException extends Exception {

    InvalidAgeException(String msg){
        super(msg);
    }
}

class Test {

    static void checkAge(int age) throws InvalidAgeException {

        if(age < 18){
            throw new InvalidAgeException("Not eligible to vote");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
```

---

# 1️⃣2️⃣ Checked vs Unchecked Exception

| Type | Example |
|-----|---------|
| Checked | IOException |
| Unchecked | ArithmeticException |

Custom exception default:

```
checked hoti hai
```

Agar RuntimeException extend kare:

```
unchecked ban jati hai
```

---

# 1️⃣3️⃣ Custom Unchecked Exception

```java
class MyException extends RuntimeException {

    MyException(String msg){
        super(msg);
    }
}
```

---

# 1️⃣4️⃣ Important Rules

✔ throw ek exception object throw karta hai  
✔ throws multiple exceptions declare kar sakta hai  
✔ custom exception class Exception ya RuntimeException extend karti hai  

---

# 🎯 Interview Questions

1. throw aur throws me difference kya hai?
2. Custom exception kab banani chahiye?
3. Checked aur unchecked custom exception me difference kya hai?
4. Exception hierarchy kya hoti hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Exception handling basics  
✔ Built-in exceptions  
✔ throw keyword  
✔ throws keyword  
✔ Custom exception creation aur handling  

Java me exception handling **robust aur error-safe programs** banane ke liye essential hai.