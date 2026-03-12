# ☕ Java Lesson – equals(), hashCode() & Overriding

Is lesson me hum seekhenge:

- equals() method
- hashCode() method
- equals() override
- hashCode() override
- Hash collections me kaise kaam karta hai
- Kyun pehle hashCode check hota hai phir equals()

---

# 1️⃣ equals() Method

`equals()` method **do objects ko compare karta hai**.

Default behavior:
- **reference comparison** karta hai
- yani memory address compare hota hai

### Syntax

```java
public boolean equals(Object obj)
```

### Example

```java
class Student {
    String name;
}

public class EqualsExample {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.equals(s2));
    }
}
```

Output

```
false
```

Kyun?

- Dono objects **different memory location** par hain.

---

# 2️⃣ hashCode() Method

`hashCode()` method **object ka unique integer code return karta hai**.

Ye code mainly use hota hai:

- HashMap
- HashSet
- Hashtable

### Syntax

```java
public int hashCode()
```

### Example

```java
public class HashCodeExample {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
```

Output

```
2301506
2301506
```

Kyunki **content same hai**.

---

# 3️⃣ equals() Override

Agar hum chahte hain ki **objects content se compare ho**, to equals override karna padta hai.

### Example

```java
class Student {

    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){

        Student s = (Student) obj;

        if(this.name.equals(s.name) && this.age == s.age){
            return true;
        }
        return false;
    }
}

public class EqualsOverrideExample {

    public static void main(String[] args){

        Student s1 = new Student("Sujit",22);
        Student s2 = new Student("Sujit",22);

        System.out.println(s1.equals(s2));
    }
}
```

Output

```
true
```

Ab **content match hone par true** aayega.

---

# 4️⃣ hashCode() Override

Java rule:

> **Agar equals override karte ho to hashCode bhi override karna chahiye**

### Example

```java
class Student {

    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){

        Student s = (Student) obj;

        return this.name.equals(s.name) && this.age == s.age;
    }

    @Override
    public int hashCode(){

        return name.hashCode() + age;
    }
}

public class HashCodeOverrideExample {

    public static void main(String[] args){

        Student s1 = new Student("Sujit",22);
        Student s2 = new Student("Sujit",22);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));
    }
}
```

Output

```
same hashcodes
true
```

---

# 5️⃣ Why First hashCode then equals?

Hash collections (HashMap / HashSet) me performance improve karne ke liye:

### Step 1

Java **hashCode() call karta hai**

```
hash = key.hashCode()
```

Isse decide hota hai object **kis bucket me jayega**.

### Step 2

Agar same bucket me multiple objects ho gaye (collision):

Tab Java **equals() call karta hai**

```
if(obj1.equals(obj2))
```

Tab actual comparison hota hai.

---

# Example Flow

Suppose HashSet me do objects add karte hain:

```
Student("Sujit",22)
Student("Sujit",22)
```

Process:

```
1️⃣ hashCode() call
2️⃣ same bucket mila
3️⃣ equals() call
4️⃣ equals true → duplicate reject
```

---

# ⚡ Rule of equals() and hashCode()

Java contract:

```
if two objects are equal
then their hashCode must be same
```

Example:

```
s1.equals(s2) = true
→ s1.hashCode() == s2.hashCode()
```

But reverse always true nahi hota.

---

# 🎯 Interview Questions

1️⃣ equals() aur `==` me difference kya hai?  
2️⃣ hashCode() ka purpose kya hai?  
3️⃣ equals override karte waqt hashCode override kyun zaruri hai?  
4️⃣ HashMap ka working mechanism kya hai?  
5️⃣ Collision kya hota hai?  
6️⃣ Why hashCode first then equals?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ equals() method  
✔ hashCode() method  
✔ equals override  
✔ hashCode override  
✔ Hash collections working  
✔ Why first hashCode then equals  

Java collections framework me **correct equals + hashCode implementation bahut important hai**, warna HashMap / HashSet incorrect behavior de sakte hain.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Java Polymorphism
- Method Overloading
- Method Overriding
- Runtime vs Compile-time polymorphism