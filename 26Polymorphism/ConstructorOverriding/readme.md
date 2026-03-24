# ☕ Java Lesson – Constructor Overriding (Concept & Reality)

Is lesson me hum seekhenge:

- Constructor overriding kya hota hai (theory)
- Java me constructor overriding kyun possible nahi hai
- Constructor vs Method overriding difference
- super() constructor call ka role inheritance me

---

# 1️⃣ Constructor Overriding Kya Hota Hai?

Simple definition:

```
Agar child class parent class ke constructor ko override kar sake
to use constructor overriding kehte.
```

Lekin Java me:

```
Constructor overriding possible nahi hai
```

---

# 2️⃣ Constructor Override Kyun Nahi Hota?

Constructor ki properties:

```
✔ Constructor inherit nahi hota
✔ Constructor ka naam class ke naam jaisa hota hai
✔ Overriding inheritance par depend karti hai
```

Kyuki:

```
Constructor inherit hi nahi hota
→ to override bhi nahi ho sakta
```

---

# 3️⃣ Example – Constructor Not Overridden

```java
class Animal {

    Animal(){
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {

    Dog(){
        System.out.println("Dog constructor");
    }
}

public class Test {

    public static void main(String[] args){

        Dog d = new Dog();
    }
}
```

Output

```
Animal constructor
Dog constructor
```

Yahan:

```
Dog ne Animal constructor override nahi kiya
sirf apna constructor define kiya
```

---

# 4️⃣ Constructor Overriding vs Method Overriding

| Feature | Constructor | Method |
|--------|-------------|--------|
| Inherit hota hai | ❌ No | ✔ Yes |
| Override hota hai | ❌ No | ✔ Yes |
| Name | Class name | Method name |

---

# 5️⃣ super() Constructor Call

Inheritance me parent constructor call hota hai:

```
super()
```

Automatically:

```java
class Dog extends Animal {

    Dog(){
        super();
        System.out.println("Dog constructor");
    }
}
```

Agar `super()` na likhen:

```
compiler automatically first line me add kar deta hai
```

---

# 6️⃣ Parameterized Constructor Example

```java
class Animal {

    Animal(String name){
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {

    Dog(){
        super("Dog");
        System.out.println("Dog constructor");
    }
}
```

---

# 7️⃣ Constructor Chaining in Inheritance

Execution order:

```
Parent constructor → Child constructor
```

Flow:

```
Dog object create
↓
Animal constructor call
↓
Dog constructor call
```

---

# 8️⃣ Common Interview Question

❓ **Can constructors be overridden in Java?**

✔ Correct answer:

```
No, constructors cannot be overridden because
they are not inherited.
```

---

# 9️⃣ Constructor vs Method Execution

Example:

```java
class A {

    A(){
        System.out.println("A constructor");
    }

    void show(){
        System.out.println("A show");
    }
}

class B extends A {

    B(){
        System.out.println("B constructor");
    }

    void show(){
        System.out.println("B show");
    }
}
```

Usage:

```java
A obj = new B();
```

Output:

```
A constructor
B constructor
```

Method call:

```java
obj.show();
```

Output:

```
B show
```

Explanation:

```
Constructor → override nahi hota
Method → override hota hai
```

---

# 🔟 Key Points

✔ Constructor overriding Java me possible nahi hai  
✔ Constructor inheritance nahi hota  
✔ Parent constructor hamesha child constructor se pehle call hota hai  
✔ super() constructor chaining ke liye use hota hai  

---

# 🎯 Interview Questions

1️⃣ Kya Java me constructor override ho sakta hai?  
2️⃣ Constructor inherit kyun nahi hota?  
3️⃣ super() constructor kab call hota hai?  
4️⃣ Constructor aur method overriding me difference kya hai?  

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Constructor overriding concept  
✔ Java me constructor overriding kyun possible nahi hai  
✔ super() constructor chaining  
✔ Parent-child constructor execution order  

Ye topic chhota hai lekin interview me bahut poocha jata hai, isliye clear hona zaruri hai.