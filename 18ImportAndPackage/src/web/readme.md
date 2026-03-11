# ☕ Java Lesson – Import & Package

Is lesson me hum seekhenge:

- Package kya hota hai
- Import statement kya hota hai
- Predefined packages aur user-defined packages
- Package ka structure aur usage
- Example programs

---

# 📌 Package Kya Hai?

- Package ek **folder/directory** hota hai jisme **related classes aur interfaces** store hote hain  
- Package use karne se **code organization aur reusability** improve hoti hai  
- Java me predefined packages jaise `java.util`, `java.io` hote hain

### Syntax

```java
package package_name;
```

- Package statement **first line** me hona chahiye  
- Ek class ek hi package me belong kar sakti hai

---

### Example – User Defined Package

**File:** `MyPackage/Hello.java`

```java
package MyPackage;

public class Hello {
    public void show(){
        System.out.println("Hello from MyPackage");
    }
}
```

**File:** `Main.java` (same project directory me)

```java
import MyPackage.Hello; // import user-defined package

public class Main {
    public static void main(String[] args){
        Hello obj = new Hello();
        obj.show();
    }
}
```

Output:

```
Hello from MyPackage
```

---

# 📌 Import Statement

- `import` statement se hum **dusre package ki class ya interface ko use kar sakte hain**  
- Agar class **same package me hai** to import ki zarurat nahi  

### Syntax

```java
import package_name.ClassName;  // specific class
import package_name.*;           // all classes in package
```

### Example – Predefined Package

```java
import java.util.Scanner;

public class ImportExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hi " + name);
    }
}
```

---

# 📌 Predefined Packages Examples

| Package       | Description                                 | Example Class       |
|---------------|---------------------------------------------|------------------|
| java.lang      | Fundamental classes (String, Math, Object) | Math, String      |
| java.util      | Utility classes                             | Scanner, ArrayList |
| java.io        | Input/Output classes                         | File, BufferedReader |
| java.net       | Networking classes                           | URL, Socket      |

---

# 📌 Notes

- Package se **class ka fully qualified name** milta hai  
  - Example: `java.util.Scanner`  
- Predefined packages ka **import optional** nahi hota agar class use karni hai  
- `*` ka use karte waqt **all classes import** ho jati hain  
- User-defined packages me **subfolders** bhi package ke part ban sakte hain  

---

# ⚡ Important Points

- **Package** = folder of classes  
- **Import** = allows use of classes from other packages  
- Java compiler me **package structure** project ke folder structure ke saath match karna chahiye  
- Fully qualified name use kar ke import ke bina bhi class access kar sakte hain  

---

# 🎯 Interview Questions

1️⃣ Package kya hota hai aur use kyu karte hain?  
2️⃣ Import statement ka syntax aur use kya hai?  
3️⃣ Predefined aur user-defined package me difference kya hai?  
4️⃣ Fully qualified class name kya hota hai?  
5️⃣ `import java.util.*` aur `import java.util.Scanner` me difference kya hai?  

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Package kya hota hai  
✔ User-defined aur predefined packages  
✔ Import statement ka use  
✔ Fully qualified class name  
✔ Package structure aur syntax  

Packages aur import statements **Java me code organization aur reusability ke liye important tools hai**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Exception Handling in Java  
- try, catch, finally  
- Throw & throws  
- Custom exceptions