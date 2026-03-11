# ☕ Java Lesson – Classes and Objects

Is lesson me hum seekhenge:

- Class kya hoti hai
- Object kya hota hai
- Java me class aur object ka syntax
- Constructors
- Parameterized constructors
- Object creation and usage
- Basic OOP concepts: Encapsulation, Access Modifiers

---

# 📌 Class Kya Hoti Hai?

Class ek **blueprint ya template** hoti hai jisse hum **objects create karte hain**.  

- Class me **variables (attributes) aur methods (functions)** hote hain  
- Class me **state (variables)** aur **behavior (methods)** define hote hain  

Example:

```java
public class Car {
    // Attributes / Variables
    String color;
    String model;
    int year;

    // Method / Behavior
    void displayInfo(){
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}
```

---

# 📌 Object Kya Hota Hai?

Object ek **instance of a class** hota hai.  

- Class ek **blueprint**  
- Object ek **real-world example**  

Example:

```java
public class Main {
    public static void main(String[] args) {

        // Object creation
        Car myCar = new Car();

        // Object variable assignment
        myCar.model = "Tesla";
        myCar.color = "Red";
        myCar.year = 2026;

        // Method call
        myCar.displayInfo();

    }
}
```

Output:

```
Car Model: Tesla
Car Color: Red
Car Year: 2026
```

---

# 📌 Constructor in Java

Constructor ek **special method** hai jo **object create hone par call hota hai**.  

- Constructor ka **name class ke name ke same** hota hai  
- Constructor me return type **void nahi hota**  

### Example – Default Constructor

```java
public class Student {

    String name;
    int age;

    // Constructor
    Student(){
        name = "Unknown";
        age = 0;
    }

    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display(); // Name: Unknown, Age: 0
    }
}
```

---

# 📌 Parameterized Constructor

Constructor me **parameters pass kar sakte hain** taaki object initialize ho jaye.

```java
public class Student {

    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sujit", 22);
        s1.display(); // Name: Sujit, Age: 22

        Student s2 = new Student("Riya", 20);
        s2.display(); // Name: Riya, Age: 20
    }
}
```

---

# 📌 Object Interaction Example

```java
public class BankAccount {

    String accHolder;
    double balance;

    // Constructor
    BankAccount(String name, double bal){
        accHolder = name;
        balance = bal;
    }

    // Deposit
    void deposit(double amount){
        balance += amount;
    }

    // Withdraw
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display(){
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Sujit", 5000);
        account.deposit(2000);
        account.withdraw(1000);
        account.display();
    }
}
```

Output:

```
Account Holder: Sujit
Balance: 6000.0
```

---

# 📌 Access Modifiers (Encapsulation Basics)

- **private** → sirf class ke andar access  
- **public** → kahi se bhi access  
- **default (no modifier)** → same package ke andar access  
- **protected** → subclass aur package me access

Example:

```java
public class Employee {

    private String name;
    private int salary;

    public void setData(String n, int s){
        name = n;
        salary = s;
    }

    public void display(){
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setData("Sujit", 50000);
        emp.display();
    }
}
```

---

# ⚡ Important Points

- Class = Blueprint, Object = Instance  
- Constructor object initialize karne ke liye use hota hai  
- Parameterized constructor = initial values pass karte hain  
- Encapsulation ke liye **private variables + public methods** use karte hain  
- Methods (functions) objects ka **behavior** define karte hain

---

# 🎯 Interview Questions

1️⃣ Class aur Object me difference kya hai?  
2️⃣ Constructor kya hota hai?  
3️⃣ Parameterized aur default constructor me difference kya hai?  
4️⃣ Encapsulation kya hai?  
5️⃣ Access modifiers ke types aur use kya hain?  
6️⃣ Object ka state aur behavior kya hota hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Class kya hoti hai  
✔ Object kya hota hai  
✔ Default & Parameterized Constructor  
✔ Object creation & method call  
✔ Basic Encapsulation & Access Modifiers  

Classes & Objects **Java OOP ka foundation hai aur real-world modeling ke liye bahut important hai**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Inheritance
- Types of Inheritance in Java
- Super Keyword
- Method Overriding