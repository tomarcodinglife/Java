# ☕ Java Lesson – VarArgs (Variable Arguments)

Is lesson me hum seekhenge:

- VarArgs kya hota hai
- VarArgs ka syntax
- VarArgs ka use kyun hota hai
- VarArgs vs Array
- Important rules aur examples

---

# 1️⃣ VarArgs Kya Hota Hai?

VarArgs ka matlab:

```
ek method me variable number of arguments pass kar sakte hain
```

Matlab:

```
kitne arguments aayenge → fix nahi hai
```

---

# 2️⃣ Syntax of VarArgs

```java
returnType methodName(dataType... variableName) {
}
```

Example:

```java
void printNumbers(int... numbers) {
}
```

---

# 3️⃣ Basic Example

```java
class Test {

    static void printNumbers(int... nums){

        for(int n : nums){
            System.out.println(n);
        }
    }

    public static void main(String[] args){

        printNumbers(1);
        printNumbers(1, 2, 3);
        printNumbers(1, 2, 3, 4, 5);
    }
}
```

---

# 4️⃣ VarArgs Internally Array Hota Hai

Java internally VarArgs ko array me convert karta hai.

Example:

```java
void show(int... nums)
```

Internally:

```java
void show(int[] nums)
```

---

# 5️⃣ VarArgs with Other Parameters

VarArgs ko dusre parameters ke saath bhi use kar sakte hain.

```java
class Test {

    static void display(String name, int... marks){

        System.out.println(name);

        for(int m : marks){
            System.out.println(m);
        }
    }

    public static void main(String[] args){

        display("Sujit", 90, 85, 80);
    }
}
```

---

# 6️⃣ Important Rules

✔ VarArgs hamesha **last parameter** hona chahiye  
✔ Ek method me sirf **ek VarArgs** allowed hai  

❌ Invalid:

```java
void test(int... a, int... b) {} // error
```

❌ Invalid:

```java
void test(int... a, int b) {} // error
```

---

# 7️⃣ VarArgs vs Array

| Feature | VarArgs | Array |
|--------|--------|-------|
| Input | flexible | fixed |
| Syntax | simple | complex |
| Use | multiple arguments | fixed data |

---

# 8️⃣ Overloading with VarArgs

```java
class Test {

    static void show(int a){
        System.out.println("Single");
    }

    static void show(int... a){
        System.out.println("Multiple");
    }

    public static void main(String[] args){

        show(5);      // Single
        show(1,2,3);  // Multiple
    }
}
```

---

# 9️⃣ Real-Life Example

```java
class Calculator {

    static int sum(int... numbers){

        int total = 0;

        for(int n : numbers){
            total += n;
        }

        return total;
    }

    public static void main(String[] args){

        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30, 40));
    }
}
```

---

# 🔟 Edge Case – No Argument

```java
sum(); // allowed
```

nums array empty hoga:

```
length = 0
```

---

# 1️⃣1️⃣ When to Use VarArgs?

Use karo jab:

```
number of inputs fix na ho
```

Example:

```
sum(), print(), logger
```

---

# 🎯 Interview Questions

1. VarArgs kya hota hai?
2. Kya VarArgs internally array hota hai?
3. VarArgs me kitne parameters allowed hote hain?
4. VarArgs last me hi kyun hona chahiye?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ VarArgs concept  
✔ Syntax aur usage  
✔ VarArgs vs array  
✔ Rules aur edge cases  

VarArgs Java me method ko **flexible aur reusable** banata hai.