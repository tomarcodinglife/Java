# ☕ Java Lesson – Constructor Overloading

Is lesson me hum seekhenge:

- Constructor kya hota hai
- Constructor overloading kya hoti hai
- Overloaded constructors ka use
- Default vs Parameterized constructor
- Constructor chaining (this keyword)

---

# 1️⃣ Constructor Kya Hota Hai?

Constructor ek special method hota hai:

```
jo object create hote hi automatically call hota hai
```

Constructor ka naam:

```
class ke naam jaisa hota hai
```

Example:

```java
class Student {

    Student(){
        System.out.println("Constructor called");
    }
}
```

---

# 2️⃣ Constructor Overloading Kya Hota Hai?

Jab ek hi class me multiple constructors ho:

```
different parameters ke saath
```

to use **Constructor Overloading** kehte hain.

---

# 3️⃣ Basic Example

```java
class Student {

    Student(){
        System.out.println("Default Constructor");
    }

    Student(String name){
        System.out.println("Name: " + name);
    }

    Student(String name, int age){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Test {

    public static void main(String[] args){

        Student s1 = new Student();
        Student s2 = new Student("Sujit");
        Student s3 = new Student("Sujit", 22);
    }
}
```

Output

```
Default Constructor
Name: Sujit
Name: Sujit, Age: 22
```

---

# 4️⃣ Constructor Overloading Rules

✔ Constructor ka naam class jaisa hona chahiye  
✔ Constructors ke parameters different hone chahiye  
✔ Return type nahi hota

---

# 5️⃣ Default vs Parameterized Constructor

| Constructor Type | Description |
|------------------|------------|
| Default Constructor | No parameters |
| Parameterized Constructor | Parameters ke saath |

Example:

```java
class Car {

    Car(){
        System.out.println("Default constructor");
    }

    Car(String brand){
        System.out.println("Brand: " + brand);
    }
}
```

---

# 6️⃣ Constructor Chaining – this Keyword

Constructor ke andar dusre constructor ko call karne ke liye:

```
this()
```

use hota hai.

Example:

```java
class Student {

    Student(){
        this("Unknown");
    }

    Student(String name){
        System.out.println("Name: " + name);
    }
}
```

Output:

```
Name: Unknown
```

Rule:

```
this() constructor ke first line me hona chahiye
```

---

# 7️⃣ Constructor Chaining with Multiple Constructors

```java
class Student {

    Student(){
        this("Sujit", 22);
    }

    Student(String name){
        this(name, 0);
    }

    Student(String name, int age){
        System.out.println(name + " " + age);
    }
}
```

---

# 8️⃣ Real-Life Example

```java
class BankAccount {

    String name;
    double balance;

    BankAccount(){
        this("Unknown", 0.0);
    }

    BankAccount(String name){
        this(name, 0.0);
    }

    BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    void display(){
        System.out.println(name + " : " + balance);
    }
}
```

Usage:

```java
BankAccount a1 = new BankAccount();
BankAccount a2 = new BankAccount("Sujit");
BankAccount a3 = new BankAccount("Sujit", 5000);
```

---

# 9️⃣ Constructor Overloading vs Method Overloading

| Feature | Constructor Overloading | Method Overloading |
|--------|-------------------------|--------------------|
| Purpose | Object initialization | Method flexibility |
| Return type | Nahi hota | Hota hai |
| Name | Class jaisa | Method name |

---

# 🔟 Important Points

✔ Constructor automatic call hota hai  
✔ Constructor overloading allowed hai  
✔ this() constructor chaining ke liye use hota hai  
✔ Constructor inherit nahi hota

---

# 🎯 Interview Questions

1️⃣ Constructor kya hota hai?  
2️⃣ Constructor overloading kya hoti hai?  
3️⃣ this() ka use kya hai?  
4️⃣ Default constructor kab generate hota hai?  
5️⃣ Constructor aur method me difference kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Constructor concept  
✔ Constructor overloading  
✔ Default vs parameterized constructor  
✔ Constructor chaining using this()  
✔ Real-life examples  

Constructor overloading object initialization ko flexible banata hai aur code duplication reduce karta hai.