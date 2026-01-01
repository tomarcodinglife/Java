# Java
Java is a high-level, object-oriented, platform-independent programming language used to build software applications. It was developed by Sun Microsystems in 1995 and is now maintained by Oracle.

## Why Java is Popular

### Platform Independent
Java follows the rule:
“Write Once, Run Anywhere”
A Java program can run on Windows, Linux, macOS, etc., without changes.

### Object-Oriented
Java is based on concepts like:
Class
Object
Inheritance
Polymorphism
Encapsulation
This makes programs reusable, modular, and easy to maintain.

### Secure
Java has:
No direct memory access
Bytecode verification
Automatic garbage collection

### Robust & Reliable
Strong memory management
Exception handling
Less chances of crashes

## JDK vs JVM VS JRE
JDK is a complete kit for Java developers. (JDK = JRE, Javac or Java Compiler, Development & Debugger) JVM is a virtual machine that runs Java programs. Using JVM Executes Java bytecode (.class files), Converts bytecode into machine code, Makes Java platform-independent, Manages memory and garbage collection and JRE provides the environment required to run Java applications. (JRE = JVM + Libraries)

## Variables 

## Java Literals
Literals are **fixed values assigned directly** to variables in Java. They represent **constant data**.

### 1. Integer Literals
Whole numbers without decimal point.

| Type          | Syntax / Example     | Notes                                |
|---------------|-------------------|-------------------------------------|
| Decimal       | `int a = 10;`     | Normal integer                      |
| Octal         | `int b = 012;`    | Starts with `0`, decimal 10         |
| Hexadecimal   | `int c = 0xA;`    | Starts with `0x`, decimal 10        |
| Binary        | `int d = 0b1010;` | Starts with `0b`, decimal 10        |
| Long          | `long l = 100000L;` | Use `L` or `l`                     |
| Readable     | `int p = 1_000_000;` | `_` allowed for readability         |

---

### 2. Floating-Point Literals
Numbers with decimal point.

| Type     | Syntax / Example     | Notes                          |
|----------|-------------------|--------------------------------|
| Float    | `float f = 10.5f;` | Use `f` or `F`                |
| Double   | `double d = 20.75;` | Default type for decimals     |
| Scientific | `double e = 1.2e3;` | 1200 in decimal               |

---

### 3. Character Literals
Single character enclosed in **single quotes**.

| Example       | Notes                            |
|---------------|---------------------------------|
| `'A'`         | Single English letter           |
| `'9'`         | Digit as character              |
| `'#'`         | Symbol                          |
| `'\u0041'`    | Unicode character (A)           |
| `'\n'`        | Escape sequence (new line)      |
| `'\t'`        | Escape sequence (tab)           |
| `'\''`        | Single quote character          |

---

### 4. String Literals
Sequence of characters enclosed in **double quotes**.

| Example                  | Notes                        |
|---------------------------|-------------------------------|
| `"Hello"`                 | Text                          |
| `"Sujit Kumar Singh"`     | Multiple words                |
| `"Line1\nLine2"`          | Escape sequences supported    |

---

### 5. Boolean Literals
Represents **true or false** values.

| Example        | Notes                  |
|----------------|-----------------------|
| `true`         | Boolean true value     |
| `false`        | Boolean false value    |

---

### 6. Null Literal
Represents **no object reference**.

| Example          | Notes                        |
|-----------------|-------------------------------|
| `String str = null;` | Only for reference types, not primitive |

---

### Notes
1. **Integer types**: `byte`, `short`, `int`, `long`  
2. **Floating types**: `float`, `double`  
3. **Characters**: Single quotes `' '`  
4. **Strings**: Double quotes `" "`  
5. **Boolean**: `true` or `false`  
6. **Null**: For reference variables only  
7. Java supports **underscore `_` in numeric literals** for readability  


## Data Type

### Premitive Data Type

| Data Type | Description                                  | Size (Fixed) | Example                          | Type              | 
|----------|-----------------------------------------------|--------------|----------------------------------|------------------ |
| byte     | Very small integer                            | 1 byte       | byte a = 10;                     | Integer (Integral)|
| short    | Small integer                                 | 2 bytes      | short b = 100;                   | Integer (Integral)|
| int      | Integer value (whole numbers)                 | 4 bytes      | int c = 1000;                    | Integer (Integral)|
| long     | Large integer                                 | 8 bytes      | long d = 100000L;                | Integer (Integral)|
| float    | Single-precision decimal number               | 4 bytes      | float e = 3.14f;                 | Floating-Point    |
| double   | Double-precision decimal number               | 8 bytes      | double f = 3.14159;              | Floating-Point    |
| char     | Single Unicode character                      | 2 bytes      | char g = 'A';                    | Character Type    |
| boolean  | True or false                                 | 1 byte*      | boolean h = true;                | Boolean           |
---

### Example 
    int age = 20;
    boolean isRealAge = true;
    float myMarks = 70.0f;
    double myHeight = 5.7;
    String name = "Sujit Kumar Singh";
    byte level = 3; (Use when Memory very limited)
    short year = 2025; (Use when memory need are small but larger than byte)
    long population = 140000000L; (Use only when large value needs to be store)
    char myChar = 'S'; (It is use in single single quotes with single character)

## Non Premitive Data Type

| Data Type | Description                                   | Size    | Example                                  | Type                |
|----------|------------------------------------------------|---------|------------------------------------------|---------------------|
| String   | Sequence of characters (String class)          | Depends | String a = "Hello";                      | Text / Reference    |
| Array    | Collection of elements of same data type       | Depends | int[] b = {1, 2, 3};                     | Collection          |
| Class    | Blueprint for creating objects                 | Depends | class Student { }                        | User-Defined Type   |
| Object   | Parent class of all Java classes               | Depends | Object obj = new Object();               | Universal Reference |
| Interface| Blueprint with abstract methods                | Depends | interface Shape { }                      | Abstract Type       |
| Enum     | Set of named constants                         | Depends | enum Day { MON, TUE };                   | Special Class       |
---

## Java Literals – Table Reference

Literals are **fixed values** assigned directly to variables in Java. They represent constant data.

| Literal Type      | Example Syntax                        | Notes / Output                        |
|------------------|--------------------------------------|---------------------------------------|
| **Integer (Decimal)**   | `int a = 10;`                       | Normal integer                        |
| **Integer (Octal)**     | `int b = 012;`                      | Starts with `0`, decimal 10           |
| **Integer (Hexadecimal)** | `int c = 0xA;`                     | Starts with `0x`, decimal 10          |
| **Integer (Binary)**    | `int d = 0b1010;`                   | Starts with `0b`, decimal 10          |
| **Long**                | `long l = 10000000000L;`            | Use `L` or `l` for long values       |
| **Readable Integer**    | `int r = 1_000_000;`               | `_` can be used for readability      |
| **Float**               | `float f = 10.5f;`                  | Use `f` or `F`                        |
| **Double**              | `double d1 = 20.75;`                | Default type for decimals             |
| **Scientific (Double)** | `double d2 = 1.2e3;`                | 1.2 × 10³ = 1200                      |
| **Char**                | `char ch = 'A';`                    | Single character, uses single quotes |
| **Unicode Char**        | `char ch = '\u0041';`               | Unicode character                     |
| **String**              | `String name = "Sujit";`            | Sequence of characters                |
| **Boolean**             | `boolean isJavaFun = true;`         | Only `true` or `false`                |
| **Null**                | `String str = null;`                 | Represents no reference               |
| **Escape in String**    | `String msg = "Hello\nJava";`       | Supports escape sequences like \n, \t |

---

### 🔹 Quick Tips
1. **Integer types**: `byte`, `short`, `int`, `long`  
2. **Floating types**: `float`, `double`  
3. **Char vs String**: `'A'` → char, `"A"` → String  
4. Boolean literals are only `true` or `false`.  
5. Null literal can be assigned **only to reference types**.  

---


## Java Escape Sequences – Table Reference

Escape sequences in Java are special characters preceded by a backslash `\`, used in **strings and char literals**.

| Escape Sequence | Meaning / Usage                        | Example Code                          | Output Example           |
|-----------------|----------------------------------------|---------------------------------------|-------------------------|
| `\n`            | New line                               | `System.out.println("Hello\nJava");` | `Hello`<br>`Java`       |
| `\t`            | Horizontal tab                         | `System.out.println("A\tB\tC");`     | `A   B   C`             |
| `\\`            | Backslash                               | `System.out.println("C:\\Users");`   | `C:\Users`              |
| `\'`            | Single quote                            | `char ch = '\'';`                     | `'`                      |
| `\"`            | Double quote                            | `System.out.println("He said \"Hi\"");` | `He said "Hi"`         |
| `\r`            | Carriage return (cursor to line start)  | `System.out.println("12345\rAB");`   | `AB345`                  |
| `\b`            | Backspace (removes previous char)       | `System.out.println("Helloo\b!");`   | `Hell!`                  |
| `\f`            | Form feed (page break, mostly printing) | `System.out.println("Hello\fWorld");` | (depends on printer)    |
| `\uXXXX`        | Unicode character                        | `char ch = '\u0041';`                | `A`                      |

---

### 🔹 Quick Tips
1. Escape sequences work **only in char or string literals**.  
2. Always **use double backslash `\\`** for printing a backslash.  
3. `\b` and `\r` may behave differently in **console vs files**.  
4. Unicode `\uXXXX` can represent **any Unicode character**.  

---

## Print Hello World

```java

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }   
}

```

## Common Regex Symbols (Java)

> Note: Java me regex likhte waqt backslash (`\`) ko escape karna padta hai.  
> Isliye `\d` ko Java string me `"\\d"` likhte hain.

### Character Classes

| Regex | Java String | Description |
|------|------------|-------------|
| `\d` | `\\d` | Digit (0–9) |
| `\D` | `\\D` | Non-digit |
| `\w` | `\\w` | Word character (a–z, A–Z, 0–9, _) |
| `\W` | `\\W` | Non-word character |
| `\s` | `\\s` | Whitespace (space, tab, newline) |
| `\S` | `\\S` | Non-whitespace |

### Quantifiers

| Regex | Description |
|------|------------|
| `*` | 0 or more times |
| `+` | 1 or more times |
| `?` | 0 or 1 time |
| `{n}` | Exactly n times |
| `{n,}` | At least n times |
| `{n,m}` | Between n and m times |

### Anchors

| Regex | Description |
|------|------------|
| `^` | Start of string |
| `$` | End of string |

### Character Sets

| Regex | Description |
|------|------------|
| `[abc]` | Matches a, b, or c |
| `[a-z]` | Lowercase letters |
| `[A-Z]` | Uppercase letters |
| `[0-9]` | Digits |
| `[^0-9]` | Not a digit |

### Groups & Alternation

| Regex | Description |
|------|------------|
| `(abc)` | Group |
| `|` | OR operator |

### Common Patterns

| Pattern | Description |
|-------|-------------|
| `\\d+` | One or more digits |
| `\\d{10}` | 10-digit mobile number |
| `[a-zA-Z]+` | Alphabets only |
| `\\w+@\\w+\\.\\w+` | Basic email format |


## All Types of Operators in Java

Java me operators ka use **operations perform karne** ke liye hota hai.

---

### 1. Arithmetic Operators

| Operator | Name | Example |
|--------|------|--------|
| `+` | Addition | `a + b` |
| `-` | Subtraction | `a - b` |
| `*` | Multiplication | `a * b` |
| `/` | Division | `a / b` |
| `%` | Modulus | `a % b` |

---

### 2. Unary Operators

| Operator | Name | Example |
|--------|------|--------|
| `+` | Unary Plus | `+a` |
| `-` | Unary Minus | `-a` |
| `++` | Increment | `a++`, `++a` |
| `--` | Decrement | `a--`, `--a` |
| `!` | Logical NOT | `!true` |

---

### 3. Assignment Operators

| Operator | Example | Meaning |
|--------|---------|--------|
| `=` | `a = 5` | Assign |
| `+=` | `a += 2` | `a = a + 2` |
| `-=` | `a -= 2` | `a = a - 2` |
| `*=` | `a *= 2` | `a = a * 2` |
| `/=` | `a /= 2` | `a = a / 2` |
| `%=` | `a %= 2` | `a = a % 2` |

---

### 4. Relational (Comparison) Operators

| Operator | Description | Example |
|--------|-------------|--------|
| `==` | Equal to | `a == b` |
| `!=` | Not equal to | `a != b` |
| `>` | Greater than | `a > b` |
| `<` | Less than | `a < b` |
| `>=` | Greater than or equal | `a >= b` |
| `<=` | Less than or equal | `a <= b` |

---

### 5. Logical Operators

| Operator | Name | Example |
|--------|------|--------|
| `&&` | Logical AND (&&) | `a > 5 && b < 10` |
| `||`  | Logical OR (||) | `a > 5 || b < 10` |
| `!` | Logical NOT (!) | `!(a > b)` |

---

### 6. Bitwise Operators

| Operator | Name | Example |
|--------|------|--------|
| `&` | AND | `a & b` |
| `|` | OR | `a | b` |
| `^` | XOR | `a ^ b` |
| `~` | Complement | `~a` |

---

### 7. Shift Operators

| Operator | Name | Example |
|--------|------|--------|
| `<<` | Left Shift | `a << 1` |
| `>>` | Right Shift | `a >> 1` |
| `>>>` | Unsigned Right Shift | `a >>> 1` |

---

### 8. Ternary Operator

| Operator | Description | Example |
|--------|-------------|--------|
| `?:` | Conditional | `max = (a > b) ? a : b;` |

---

### 9. instanceof Operator

| Operator | Description | Example |
|--------|-------------|--------|
| `instanceof` | Object type check | `obj instanceof String` |

---

### 10. Special Operators

| Operator | Description | Example |
|--------|-------------|--------|
| `.` | Access member | `obj.method()` |
| `[]` | Array access | `arr[0]` |
| `()` | Method call | `method()` |
| `new` | Object creation | `new Scanner()` |

---

### Operator Precedence (High → Low)

| Priority | Operators |
|--------|----------|
| High | `()`, `[]`, `.` |
|  | `++`, `--`, `!` |
|  | `*`, `/`, `%` |
|  | `+`, `-` |
|  | `<`, `>`, `<=`, `>=` |
|  | `==`, `!=` |
|  | `&&` |
|  | `||` |
| Low | `=`, `+=`, `-=` |

---




