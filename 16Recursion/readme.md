# ☕ Java Lesson – Recursion

Is lesson me hum seekhenge:

- Recursion kya hoti hai
- Base case aur Recursive case
- Factorial using recursion
- Fibonacci series using recursion
- Sum of digits using recursion
- Reverse number using recursion
- Advantages & disadvantages

---

# 📌 Recursion Kya Hai?

Recursion ek technique hai jisme **function khud ko call karta hai**.  

- Function apne andar hi call hota hai  
- Do important cheezein:
  1. **Base case** – function kab stop hoga  
  2. **Recursive case** – function ka khud ko call karna  

---

# 📌 Syntax

```java
returnType functionName(parameters){
    if(base_condition){
        // stop recursion
        return value;
    } else {
        // recursive call
        functionName(modified_parameters);
    }
}
```

---

# 1️⃣ Factorial using Recursion

```java
public class Factorial {

    static int factorial(int n){
        if(n == 0 || n == 1) return 1; // Base case
        else return n * factorial(n-1); // Recursive call
    }

    public static void main(String[] args){
        int num = 5;
        System.out.println("Factorial of " + num + " = " + factorial(num));
    }
}
```

Output:

```
Factorial of 5 = 120
```

---

# 2️⃣ Fibonacci Series using Recursion

```java
public class Fibonacci {

    static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2); // Recursive call
    }

    public static void main(String[] args){
        int n = 10;
        System.out.print("Fibonacci Series: ");
        for(int i=0;i<n;i++){
            System.out.print(fib(i) + " ");
        }
    }
}
```

Output:

```
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
```

---

# 3️⃣ Sum of Digits using Recursion

```java
public class SumOfDigits {

    static int sumDigits(int n){
        if(n == 0) return 0; // Base case
        return n % 10 + sumDigits(n / 10); // Recursive call
    }

    public static void main(String[] args){
        int num = 12345;
        System.out.println("Sum of digits of " + num + " = " + sumDigits(num));
    }
}
```

Output:

```
Sum of digits of 12345 = 15
```

---

# 4️⃣ Reverse Number using Recursion

```java
public class ReverseNumber {

    static int reverse(int n, int rev){
        if(n == 0) return rev; // Base case
        return reverse(n / 10, rev * 10 + n % 10); // Recursive call
    }

    public static void main(String[] args){
        int num = 1234;
        System.out.println("Reversed Number = " + reverse(num, 0));
    }
}
```

Output:

```
Reversed Number = 4321
```

---

# 5️⃣ Advantages of Recursion

- Code simple aur readable hota hai  
- Complex problems like factorial, Fibonacci, tree traversal, graph traversal easily solve hote hain  
- Divide & Conquer algorithms me helpful  

# 6️⃣ Disadvantages of Recursion

- Memory consumption zyada hota hai (stack frames)  
- Infinite recursion se program crash ho sakta hai  
- Iterative solution usually faster hota hai  

---

# ⚡ Important Points

- **Base case** sabse important hai warna infinite recursion hoga  
- **Recursive call** me parameter ko modify karna hota hai  
- Recursion me **stack ka use** hota hai  
- Simple problems me recursion **readable aur elegant** solution deti hai  

---

# 🎯 Interview Questions

1️⃣ Recursion kya hai aur base case kya hota hai?  
2️⃣ Factorial recursion kaise implement karte hain?  
3️⃣ Fibonacci recursion ka time complexity kya hoti hai?  
4️⃣ Sum of digits aur reverse number recursion me kaise karte hain?  
5️⃣ Recursion aur iteration me difference kya hai?  

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Recursion kya hai  
✔ Base case aur Recursive case  
✔ Factorial using recursion  
✔ Fibonacci series using recursion  
✔ Sum of digits using recursion  
✔ Reverse number using recursion  
✔ Advantages & disadvantages  

Recursion **Java me problem solving ka ek important tool hai** jo complex problems ko elegant tarike se solve karne me help karta hai.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Java Arrays (1D & 2D) advanced practice  
- String handling, StringBuffer & StringBuilder  
- OOP concepts advance (Inheritance, Polymorphism, Abstraction)