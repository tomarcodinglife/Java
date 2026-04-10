# ☕ Java Lesson – Enum in Java (Enumeration)

Is lesson me hum seekhenge:

- Enum kya hota hai
- Enum ka use kyun hota hai
- Enum syntax
- Enum with methods and constructors
- Real examples

---

# 1️⃣ Enum Kya Hota Hai?

Enum ka matlab:

```
fixed set of constants define karna
```

Example:

```
Days → MONDAY, TUESDAY, WEDNESDAY
```

---

# 2️⃣ Enum Kyun Use Karte Hain?

Jab values fix ho:

```
better readability + safety
```

Example:

❌ Using String:

```java
String day = "MONDAY";
```

✔ Using Enum:

```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}
```

---

# 3️⃣ Basic Syntax

```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}
```

Use:

```java
public class Test {

    public static void main(String[] args){

        Day d = Day.MONDAY;

        System.out.println(d);
    }
}
```

---

# 4️⃣ Enum with Switch

```java
Day d = Day.MONDAY;

switch(d){
    case MONDAY:
        System.out.println("Start of week");
        break;

    case TUESDAY:
        System.out.println("Working day");
        break;
}
```

---

# 5️⃣ Enum Methods

| Method | Use |
|-------|-----|
| values() | all constants |
| valueOf() | string to enum |
| ordinal() | index |

Example:

```java
for(Day d : Day.values()){
    System.out.println(d + " " + d.ordinal());
}
```

---

# 6️⃣ Enum with Fields

```java
enum Day {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3);

    int value;

    Day(int value){
        this.value = value;
    }
}
```

---

# 7️⃣ Enum with Method

```java
enum Day {

    MONDAY, TUESDAY;

    public void display(){
        System.out.println("Hello " + this);
    }
}
```

Use:

```java
Day.MONDAY.display();
```

---

# 8️⃣ Enum with Constructor

✔ constructor always private hota hai

```java
enum Level {

    LOW, MEDIUM, HIGH;

    Level(){
        System.out.println("Constructor called");
    }
}
```

---

# 9️⃣ Real-Life Example

```java
enum Status {
    SUCCESS, FAIL, PENDING
}

class Test {

    public static void main(String[] args){

        Status s = Status.SUCCESS;

        if(s == Status.SUCCESS){
            System.out.println("Task Completed");
        }
    }
}
```

---

# 🔟 Enum vs Constants (final static)

| Feature | Enum | final static |
|--------|------|-------------|
| Type safety | ✔ Yes | ❌ No |
| Readability | ✔ High | Medium |
| Methods allowed | ✔ Yes | ❌ No |

---

# 1️⃣1️⃣ Important Points

✔ Enum internally class hoti hai  
✔ Enum objects fixed hote hain  
✔ == operator se compare kar sakte hain  

---

# 🎯 Interview Questions

1. Enum kya hota hai?
2. Enum aur final static me difference?
3. Enum me constructor ka use kya hai?
4. Enum me methods bana sakte hain?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Enum concept  
✔ Syntax aur usage  
✔ Enum methods (values, ordinal)  
✔ Enum with constructor aur methods  
✔ Real-life usage  

Enum Java me **fixed constants ko safe aur readable way me manage karne ka best tarika hai**.