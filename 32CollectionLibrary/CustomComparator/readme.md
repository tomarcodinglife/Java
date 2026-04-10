# ☕ Java Lesson – Custom Comparator (Sorting in Java)

Is lesson me hum seekhenge:

- Comparator kya hota hai
- Custom comparator kyun use karte hain
- Comparator vs Comparable
- Custom sorting kaise karte hain
- Real examples

---

# 1️⃣ Comparator Kya Hota Hai?

Comparator ek interface hai:

```
jo custom sorting logic define karne ke liye use hota hai
```

Package:

```
java.util.Comparator
```

---

# 2️⃣ Comparator Ka Use Kyun?

Default sorting:

```
ascending order me hoti hai
```

Agar aapko chahiye:

```
descending
custom logic (age, name, marks)
```

to Comparator use karte hain.

---

# 3️⃣ Comparator Interface Method

```java
int compare(Object o1, Object o2)
```

Return:

```
negative → o1 < o2
zero     → equal
positive → o1 > o2
```

---

# 4️⃣ Basic Example (Descending Order)

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(30);
        list.add(20);

        Collections.sort(list, (a, b) -> b - a);

        System.out.println(list);
    }
}
```

Output:

```
[30, 20, 10]
```

---

# 5️⃣ Custom Object Sorting

```java
class Student {

    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
```

---

# 6️⃣ Sort by Marks

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Sujit", 85));
        list.add(new Student("Rahul", 90));
        list.add(new Student("Amit", 80));

        Collections.sort(list, (s1, s2) -> s2.marks - s1.marks);

        for(Student s : list){
            System.out.println(s.name + " " + s.marks);
        }
    }
}
```

---

# 7️⃣ Sort by Name

```java
Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
```

---

# 8️⃣ Comparator vs Comparable

| Feature | Comparator | Comparable |
|--------|-----------|------------|
| Package | java.util | java.lang |
| Method | compare() | compareTo() |
| Use | external sorting | internal sorting |

---

# 9️⃣ Multiple Level Sorting

```java
Collections.sort(list, (s1, s2) -> {

    if(s1.marks == s2.marks){
        return s1.name.compareTo(s2.name);
    }

    return s2.marks - s1.marks;
});
```

---

# 🔟 Using Comparator Class (Old Way)

```java
Collections.sort(list, new Comparator<Student>() {

    public int compare(Student s1, Student s2){
        return s1.marks - s2.marks;
    }
});
```

---

# 1️⃣1️⃣ Built-in Comparators

```java
Collections.sort(list, Comparator.reverseOrder());
Collections.sort(list, Comparator.naturalOrder());
```

---

# 1️⃣2️⃣ Real-Life Example

```java
Collections.sort(list, (a, b) -> a.length() - b.length());
```

String length ke basis par sorting.

---

# 1️⃣3️⃣ Important Points

✔ Comparator external sorting ke liye use hota hai  
✔ Multiple sorting conditions possible hain  
✔ Lambda expressions se code short ho jata hai  

---

# 🎯 Interview Questions

1. Comparator kya hota hai?
2. Comparator aur Comparable me difference?
3. compare() method ka return kya hota hai?
4. Custom sorting kaise implement karte hain?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Comparator interface  
✔ Custom sorting logic  
✔ Lambda-based sorting  
✔ Comparator vs Comparable  
✔ Multi-level sorting  

Comparator Java me **flexible aur powerful sorting mechanism** provide karta hai.