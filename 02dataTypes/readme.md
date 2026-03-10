# ☕ Java Lesson 2 – Variables and Data Types

Is lesson me hum seekhenge:

- Variable kya hota hai
- Data Type kya hota hai
- Java ke different data types
- Variable declare aur initialize kaise karte hain

Java me **variable ek container hota hai jo data store karta hai**.

Example: Age, Name, Salary etc.

---

# 1️⃣ Variable Kya Hota Hai

Variable ek **memory location ka naam** hota hai jisme hum data store karte hain.

Example:

```
Age = 25
Name = Sujit
```

Java me variable declare karne ka syntax:

```java
dataType variableName = value;
```

Example:

```java
int age = 25;
String name = "Sujit";
```

---

# 2️⃣ Example Program (Variable)

```java
public class VariableExample {

    public static void main(String[] args) {

        int age = 22;
        String name = "Sujit";

        System.out.println(name);
        System.out.println(age);

    }

}
```

## Output

```
Sujit
22
```

---

# 3️⃣ Data Type Kya Hota Hai

Data Type batata hai ki **variable me kis type ka data store hoga**.

Example:

- Number
- Character
- Decimal
- Boolean
- Text

Java me mainly **2 types ke Data Types hote hain**.

```
Data Types
│
├── Primitive
└── Non Primitive
```

---

# 4️⃣ Primitive Data Types

Primitive data types simple data store karte hain.

| Data Type | Size | Example |
|----------|------|--------|
| byte | 1 byte | 10 |
| short | 2 byte | 100 |
| int | 4 byte | 1000 |
| long | 8 byte | 100000 |
| float | 4 byte | 10.5 |
| double | 8 byte | 20.555 |
| char | 2 byte | 'A' |
| boolean | 1 bit | true / false |

---

# 5️⃣ Primitive Data Type Example

```java
public class DataTypeExample {

    public static void main(String[] args) {

        int age = 22;
        float price = 99.5f;
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println(age);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(isJavaFun);

    }

}
```

## Output

```
22
99.5
A
true
```

---

# 6️⃣ Non-Primitive Data Types

Non primitive data types objects ko represent karte hain.

Examples:

- String
- Array
- Class
- Interface

Example:

```java
public class StringExample {

    public static void main(String[] args) {

        String name = "Sujit";

        System.out.println(name);

    }

}
```

## Output

```
Sujit
```

---

# 7️⃣ Variable Naming Rules

Java me variable name likhte waqt kuch rules follow karne hote hain.

### Rules

✔ Variable name **letter ya underscore se start hona chahiye**  
✔ Variable name **number se start nahi ho sakta**  
✔ Special characters allowed nahi hote  
✔ Java keywords variable name nahi ho sakte

### Valid Examples

```
age
studentName
_total
price1
```

### Invalid Examples

```
1age
student-name
class
```

---

# 8️⃣ Multiple Variables Example

```java
public class MultipleVariables {

    public static void main(String[] args) {

        int age = 22;
        String name = "Sujit";
        double salary = 50000;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }

}
```

## Output

```
Name: Sujit
Age: 22
Salary: 50000
```

---

# 9️⃣ Variable Declaration vs Initialization

### Declaration

Variable create karna.

```java
int age;
```

### Initialization

Variable ko value dena.

```java
age = 25;
```

### Combined

```java
int age = 25;
```

---

# ⚡ Important Points

- Variable ek **memory container** hota hai
- Data type decide karta hai **variable me kis type ka data store hoga**
- Java me **8 primitive data types** hote hain
- `String` ek **non primitive data type** hai

---

# 🎯 Interview Questions

1️⃣ Variable kya hota hai?  
2️⃣ Data type kya hota hai?  
3️⃣ Primitive aur non primitive data type me kya difference hai?  
4️⃣ Java me kitne primitive data types hote hain?  
5️⃣ Variable naming rules kya hain?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Variable kya hota hai  
✔ Data type kya hota hai  
✔ Primitive data types  
✔ Non primitive data types  
✔ Variable naming rules  

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Operators in Java
- Arithmetic Operators
- Relational Operators
- Logical Operators