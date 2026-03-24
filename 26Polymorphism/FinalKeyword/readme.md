# ☕ Java Lesson – final Keyword (Class, Method & Variable)

Is lesson me hum seekhenge:

- final keyword kya hota hai
- final variable kya hota hai
- final method kya hoti hai
- final class kya hoti hai
- final keyword ka use kab aur kyun kiya jata hai

---

# 1️⃣ final Keyword Kya Hota Hai?

`final` ek keyword hai jo Java me use hota hai:

```
restriction lagane ke liye
```

final ka use 3 jagah hota hai:

```
1. Variable
2. Method
3. Class
```

---

# 2️⃣ final Variable

Final variable ka matlab:

```
value once assigned → change nahi ho sakti
```

Example:

```java
public class Test {

    public static void main(String[] args){

        final int number = 10;

        // number = 20; ❌ error
    }
}
```

---

# 3️⃣ Final Variable Initialization

Final variable ko initialize karna zaruri hai:

```
either declaration ke time
ya constructor me
```

Example:

```java
class Student {

    final int id;

    Student(int id){
        this.id = id;
    }
}
```

---

# 4️⃣ final Method

Agar method final hai:

```
to subclass us method ko override nahi kar sakti
```

Example:

```java
class Animal {

    final void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    // void sound() {} ❌ error
}
```

---

# 5️⃣ final Class

Final class ka matlab:

```
us class ko extend nahi kar sakte
```

Example:

```java
final class Vehicle {

}

class Car extends Vehicle {  // ❌ error

}
```

Real example:

```
String class is final
```

---

# 6️⃣ Final Keyword Summary

| final Use | Meaning |
|----------|---------|
| final variable | value change nahi hogi |
| final method | override nahi kar sakte |
| final class | inherit nahi kar sakte |

---

# 7️⃣ final vs finally vs finalize

| Keyword | Use |
|--------|-----|
| final | restriction keyword |
| finally | exception handling block |
| finalize | garbage collection method |

---

# 8️⃣ Real-Life Example

```java
class BankAccount {

    final int accountNumber;
    double balance;

    BankAccount(int acc){
        accountNumber = acc;
    }

    final void showAccount(){
        System.out.println(accountNumber);
    }
}
```

---

# 9️⃣ Why Use final?

Use cases:

```
constant values
security
immutable objects
prevent method modification
prevent inheritance
```

---

# 🔟 Important Rules

✔ final variable ko reassign nahi kar sakte  
✔ final method override nahi hoti  
✔ final class inherit nahi hoti  
✔ final reference variable ka object change ho sakta hai but reference nahi

Example:

```java
final Student s = new Student();

s.name = "Sujit"; // ✔ allowed
// s = new Student(); ❌ not allowed
```

---

# 🎯 Interview Questions

1️⃣ final keyword ka use kya hai?  
2️⃣ final variable aur constant me kya relation hai?  
3️⃣ final method override kyun nahi hoti?  
4️⃣ final class ka real example kya hai?  
5️⃣ final, finally aur finalize me difference kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ final variable  
✔ final method  
✔ final class  
✔ restrictions aur use cases  
✔ final vs finally vs finalize  

final keyword Java me **code safety aur immutability maintain karne ke liye** bahut important hai.