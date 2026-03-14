# ☕ Java Lesson – Nested Class & Inner Class (Static vs Non-Static)

Is lesson me hum seekhenge:

- Nested Class kya hoti hai
- Inner Class kya hoti hai
- Static Nested Class
- Non-Static Inner Class
- Static aur Non-Static members ko kaise access karte hain
- Example programs

---

# 1️⃣ Nested Class Kya Hai?

Java me **class ke andar ek aur class declare karna** nested class kehlata hai.

Example structure:

```java
class OuterClass {

    class InnerClass {

    }

}
```

Nested classes ke 2 main types:

```
1. Static Nested Class
2. Non-Static Inner Class
```

---

# 2️⃣ Static Nested Class

Agar nested class **static keyword ke saath declare hoti hai**, to use **Static Nested Class** kehte hain.

### Syntax

```java
class Outer {

    static class Inner {

    }

}
```

---

# Static Nested Class Rules

✔ Outer class ke **static members access kar sakti hai**  
✔ Outer class ke **non-static members directly access nahi kar sakti**  
✔ Object create karne ke liye **Outer class object ki zarurat nahi**

---

# Example – Static Nested Class

```java
class Outer {

    static int x = 10;
    int y = 20;

    static class Inner {

        void display(){
            System.out.println("Access static variable x = " + x);

            // System.out.println(y); ❌ not allowed
        }
    }
}

public class StaticNestedExample {

    public static void main(String[] args){

        Outer.Inner obj = new Outer.Inner();

        obj.display();
    }
}
```

Output

```
Access static variable x = 10
```

---

# 3️⃣ Non-Static Inner Class

Agar nested class **static nahi hai**, to use **Inner Class** kehte hain.

### Syntax

```java
class Outer {

    class Inner {

    }

}
```

---

# Inner Class Rules

✔ Outer class ke **static aur non-static dono members access kar sakti hai**  
✔ Inner class object banane ke liye **Outer class object zaruri hai**

---

# Example – Non Static Inner Class

```java
class Outer {

    int x = 10;
    static int y = 20;

    class Inner {

        void display(){
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}

public class InnerClassExample {

    public static void main(String[] args){

        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();

        inner.display();
    }
}
```

Output

```
x = 10
y = 20
```

---

# 4️⃣ Access Rules Summary

| Situation | Static Nested Class | Non-Static Inner Class |
|----------|---------------------|------------------------|
| Access static variable | ✔ Yes | ✔ Yes |
| Access non-static variable | ❌ No | ✔ Yes |
| Need outer object | ❌ No | ✔ Yes |

---

# 5️⃣ Static Method me Inner Class Access

Static method me **direct inner class access nahi hota**.

Example:

```java
class Outer {

    class Inner {
        void show(){
            System.out.println("Inner class method");
        }
    }

    static void test(){

        Outer outer = new Outer();
        Outer.Inner obj = outer.new Inner();

        obj.show();
    }
}
```

---

# 6️⃣ Static vs Non Static Variable Access

Example:

```java
class Example {

    static int a = 10;
    int b = 20;

    static void staticMethod(){
        System.out.println(a); // ✔ allowed
        // System.out.println(b); ❌ not allowed
    }

    void nonStaticMethod(){
        System.out.println(a); // ✔ allowed
        System.out.println(b); // ✔ allowed
    }
}
```

Rule:

```
Static method → only static members
Non-static method → both static & non-static members
```

---

# ⚡ Important Points

✔ Nested class = class inside class  
✔ Static nested class → outer static members access  
✔ Inner class → outer static + non static access  
✔ Static nested class ke liye outer object required nahi  
✔ Inner class ke liye outer object required

---

# 🎯 Interview Questions

1️⃣ Nested class aur inner class me difference kya hai?  
2️⃣ Static nested class kya hoti hai?  
3️⃣ Inner class ko object kaise create karte hain?  
4️⃣ Static method non-static variable access kyun nahi kar sakta?  
5️⃣ Inner class outer class ke members kaise access karti hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Nested class concept  
✔ Static nested class  
✔ Non-static inner class  
✔ Static vs non-static member access  
✔ Object creation rules  

Java me nested classes **code organization aur encapsulation improve karne ke liye use hoti hain**.