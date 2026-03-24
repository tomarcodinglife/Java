# ☕ Java Lesson – Pass by Value vs Pass by Reference

Is lesson me hum seekhenge:

- Pass by value kya hota hai
- Pass by reference kya hota hai
- Java me kaunsa use hota hai
- Primitive aur object passing ka difference
- Common misconceptions

---

# 1️⃣ Pass by Value Kya Hota Hai?

Pass by value me:

```
variable ki copy method ko di jati hai
```

Original variable change nahi hota.

Example:

```java
public class Test {

    static void change(int x){
        x = 50;
    }

    public static void main(String[] args){

        int a = 10;

        change(a);

        System.out.println(a);
    }
}
```

Output

```
10
```

Explanation:

```
a ki copy change hui
original value same rahi
```

---

# 2️⃣ Pass by Reference Kya Hota Hai?

Pass by reference me:

```
method ko actual memory address diya jata hai
```

Isliye method ke andar change hone par original bhi change hota hai.

Example (C++ style concept):

```
void change(int &x)
```

Java me ye syntax exist nahi karta.

---

# 3️⃣ Java me Actual Behavior

Java me:

```
ALWAYS pass by value
```

Lekin objects ke case me:

```
reference ka copy pass hota hai
```

Isliye confusion hota hai ki Java pass by reference hai.

---

# 4️⃣ Primitive Example

```java
static void change(int x){
    x = 100;
}
```

Call:

```java
int a = 5;
change(a);
```

Result:

```
a = 5
```

---

# 5️⃣ Object Example

```java
class Student {
    int age;
}

public class Test {

    static void change(Student s){
        s.age = 25;
    }

    public static void main(String[] args){

        Student s1 = new Student();
        s1.age = 20;

        change(s1);

        System.out.println(s1.age);
    }
}
```

Output

```
25
```

Yahan lagta hai pass by reference hua, lekin actual me:

```
reference ki copy pass hui
```

---

# 6️⃣ Why Object Value Change Ho Gayi?

Memory diagram:

```
s1 → Student object
copy of s1 → same object ko point kar raha hai
```

Isliye:

```
object change → original me reflect
```

---

# 7️⃣ Reassign Object Example

```java
static void change(Student s){
    s = new Student();
    s.age = 50;
}
```

Call:

```java
Student s1 = new Student();
s1.age = 20;

change(s1);

System.out.println(s1.age);
```

Output

```
20
```

Explanation:

```
method ke andar reference reassign hua
original reference unchanged raha
```

---

# 8️⃣ Primitive vs Object Passing

| Feature | Primitive | Object |
|--------|-----------|--------|
| Pass type | Value | Reference ka value |
| Original change | ❌ No | ✔ Yes (object fields) |
| Reassignment effect | N/A | ❌ No |

---

# 9️⃣ Java Interview Truth

Java:

```
Pass by Value only
```

But:

```
Object reference ki copy pass hoti hai
```

Isliye log bolte hain:

```
Java is pass by value of reference
```

---

# 🔟 Summary Example

```java
void test(Student s){
    s.age = 30;      // affects original
    s = new Student(); // no effect
}
```

---

# 🎯 Interview Questions

1️⃣ Java pass by value hai ya reference?  
2️⃣ Primitive aur object passing me difference kya hai?  
3️⃣ Object reassign karne par original kyun change nahi hota?  
4️⃣ Java me reference passing kyun possible nahi hai?  

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Pass by value concept  
✔ Pass by reference concept  
✔ Java ka actual behavior  
✔ Primitive vs object difference  
✔ Common confusion clear kiya  

Java me **hamesha pass by value hota hai**, lekin objects ke case me reference copy pass hone se behavior pass by reference jaisa lagta hai.