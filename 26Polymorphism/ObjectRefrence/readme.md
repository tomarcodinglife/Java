# ☕ Java Lesson – Object Class, Object Reference & Object Casting

Is lesson me hum seekhenge:

- Object reference kya hota hai
- Java me Object class kya hoti hai
- Object sab classes ka parent kaise hai
- Upcasting kya hota hai
- Downcasting kya hota hai
- Type casting in objects

---

# 1️⃣ Object Reference Kya Hota Hai?

Java me jab hum object create karte hain:

```java
Student s = new Student();
```

Yahan:

```
Student → class
s → object reference
new Student() → actual object
```

Diagram:

```
s  --------->  Student Object in Heap
```

Object reference sirf:

```
memory address store karta hai
```

---

# 2️⃣ Java me Object Class

Java me ek built-in class hoti hai:

```
java.lang.Object
```

Ye sab classes ki **topmost parent class** hai.

Example:

```java
class Student {

}
```

Actually internally hota hai:

```java
class Student extends Object {

}
```

---

# 3️⃣ Object – Parent of Every Class

Iska matlab:

```
Har class indirectly Object ko inherit karti hai
```

Isliye har object ke paas ye methods hote hain:

```
toString()
equals()
hashCode()
getClass()
wait()
notify()
clone()
```

Example

```java
class Test {

    public static void main(String[] args){

        String s = "Java";

        System.out.println(s.getClass());
    }
}
```

Output

```
class java.lang.String
```

---

# 4️⃣ Object Reference as Parent Type

Object reference kisi bhi object ko store kar sakta hai.

Example

```java
public class Test {

    public static void main(String[] args){

        Object obj = new String("Hello");

        System.out.println(obj);
    }
}
```

Output

```
Hello
```

Yahan:

```
Object reference → String object store kar raha hai
```

Isse kehte hain:

```
Upcasting
```

---

# 5️⃣ Upcasting (Implicit)

Jab child object ko parent reference me store karte hain.

```java
Animal a = new Dog();
```

Rules:

✔ automatic hota hai  
✔ safe hota hai  
✔ compile time par allowed hota hai

---

# 6️⃣ Downcasting (Explicit)

Jab parent reference ko child type me convert karte hain.

```java
Animal a = new Dog();

Dog d = (Dog) a;
```

Yahan cast karna padta hai:

```
(Dog)
```

---

# 7️⃣ Upcasting Example

```java
class Animal {

    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void bark(){
        System.out.println("Dog bark");
    }
}

public class Test {

    public static void main(String[] args){

        Animal a = new Dog(); // upcasting

        a.sound();
    }
}
```

Output

```
Animal sound
```

---

# 8️⃣ Downcasting Example

```java
class Animal {

}

class Dog extends Animal {

    void bark(){
        System.out.println("Dog bark");
    }
}

public class Test {

    public static void main(String[] args){

        Animal a = new Dog();

        Dog d = (Dog) a; // downcasting

        d.bark();
    }
}
```

Output

```
Dog bark
```

---

# 9️⃣ Invalid Downcasting (Runtime Error)

```java
Animal a = new Animal();

Dog d = (Dog) a; // Runtime Error
```

Error:

```
ClassCastException
```

Isliye safe casting ke liye:

```java
if(a instanceof Dog){
    Dog d = (Dog) a;
}
```

---

# 🔟 Object Casting Summary

| Casting Type | Direction | Automatic | Safe |
|-------------|-----------|----------|------|
| Upcasting | Child → Parent | ✔ Yes | ✔ Yes |
| Downcasting | Parent → Child | ❌ No | ⚠ Risky |

---

# 1️⃣1️⃣ Why Object Casting Important?

Use hota hai:

```
polymorphism
method overriding
collection framework
generic programming
```

Example:

```java
Object[] arr = new Object[3];

arr[0] = "Java";
arr[1] = 10;
arr[2] = new Student();
```

---

# 🎯 Interview Questions

1️⃣ Java me Object class kya hoti hai?  
2️⃣ Kya har class Object ko inherit karti hai?  
3️⃣ Object reference kya hota hai?  
4️⃣ Upcasting aur downcasting me difference kya hai?  
5️⃣ ClassCastException kab aata hai?  
6️⃣ instanceof operator ka use kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Object reference concept  
✔ Object class as parent  
✔ Upcasting  
✔ Downcasting  
✔ Type casting rules  
✔ instanceof safety check  

Java OOP ka ye foundation concept hai jo polymorphism aur collections samajhne ke liye zaruri hai.