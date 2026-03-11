# ☕ Java Lesson – Functions (Methods) & Challenges

Is lesson me hum seekhenge:

- Function (Method) kya hai
- Parameterized Functions
- Return Type Functions
- Java me functions ka syntax
- Practice Challenges:
  - Armstrong Number
  - Digit Sum
  - Factorials
  - Fibonacci Series
  - Greatest of numbers
  - LCM / GCD
  - Odd Numbers
  - Palindrome
  - Prime Numbers
  - Table Print
  - Return Opposite / Reverse Number

---

# 📌 Function (Method) Kya Hota Hai?

Function ya Method ek **block of code hai** jo **reusable** hota hai aur **specific task perform karta hai**.

- Function ek **program ko modular bana deta hai**
- Ek baar function define karke multiple times use kiya ja sakta hai
- Function program ko **readable aur maintainable** banata hai

---

# 📌 Syntax – Function in Java

```java
returnType functionName(parameters){
    // code
    return value; // optional, if returnType is void then return not required
}
```

Explanation:

| Part | Meaning |
|------|---------|
| returnType | function ka type ya void |
| functionName | function ka naam |
| parameters | input arguments (optional) |
| return | value return karne ke liye (optional) |

---

# 1️⃣ Simple Function (No Parameters, No Return)

```java
public class SimpleFunction {

    static void greet(){
        System.out.println("Hello, Sujit!");
    }

    public static void main(String[] args) {
        greet(); // function call
    }

}
```

Output:

```
Hello, Sujit!
```

---

# 2️⃣ Parameterized Function

Function **parameters accept kar sakta hai**.

```java
public class ParameterFunction {

    static void greet(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Sujit"); // passing parameter
    }

}
```

Output:

```
Hello, Sujit!
```

---

# 3️⃣ Return Type Function

Function **kuch value return kar sakta hai**.

```java
public class ReturnFunction {

    static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 7);
        System.out.println(result);
    }

}
```

Output:

```
12
```

---

# 📌 Practice Challenges – Functions

Ye practice challenges aapko **logic building aur function usage** me help karenge.

---

## 1️⃣ Armstrong Number

```java
public class Armstrong {

    static boolean isArmstrong(int num){
        int sum = 0, temp = num;
        while(temp != 0){
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println(isArmstrong(number));
    }

}
```

---

## 2️⃣ Digit Sum

```java
public class DigitSum {

    static int sumDigits(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(1234)); // 10
    }

}
```

---

## 3️⃣ Factorial

```java
public class Factorial {

    static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }

}
```

---

## 4️⃣ Fibonacci Series

```java
public class Fibonacci {

    static void fibonacci(int n){
        int a=0, b=1;
        System.out.print(a + " " + b + " ");
        for(int i=3; i<=n; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        fibonacci(7);
    }

}
```

Output:

```
0 1 1 2 3 5 8
```

---

## 5️⃣ Greatest of Two Numbers

```java
public class Greatest {

    static int max(int a, int b){
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 20));
    }

}
```

---

## 6️⃣ LCM / GCD

```java
public class LCMGCD {

    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(12,18)); // 6
        System.out.println(lcm(12,18)); // 36
    }

}
```

---

## 7️⃣ Odd Numbers Function

```java
public class OddNumbers {

    static void printOdd(int n){
        for(int i=1; i<=n; i+=2){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        printOdd(10); // 1 3 5 7 9
    }

}
```

---

## 8️⃣ Palindrome Check

```java
public class Palindrome {

    static boolean isPalindrome(int num){
        int rev=0, temp=num;
        while(temp != 0){
            rev = rev*10 + temp%10;
            temp /= 10;
        }
        return rev == num;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
    }

}
```

---

## 9️⃣ Prime Check

```java
public class PrimeCheck {

    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13)); // true
    }

}
```

---

## 🔟 Table Print (Return Function Example)

```java
public class TablePrint {

    static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }

    public static void main(String[] args) {
        printTable(5);
    }

}
```

---

## 11️⃣ Return Opposite / Reverse Number

```java
public class ReverseNumber {

    static int reverseNum(int num){
        int rev=0;
        while(num != 0){
            rev = rev*10 + num%10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(1234)); // 4321
    }

}
```

---

# ⚡ Important Points

- Functions **code ko modular aur reusable banate hain**  
- Parameterized functions input lete hain  
- Return type functions output dete hain  
- Functions **practice challenges ke liye best hain**  

---

# 🎯 Interview Questions

1️⃣ Function kya hai?  
2️⃣ Java me parameterized function kaise banate hain?  
3️⃣ Return type function ka use kya hai?  
4️⃣ Armstrong number ka logic kya hota hai?  
5️⃣ Fibonacci series function me kaise implement karte hain?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Function / Method  
✔ Parameter Function  
✔ Return Function  
✔ Practice challenges – Armstrong, DigitSum, Factorial, Fibonacci, Greatest, LCM/GCD, Odd, Palindrome, Prime, Table Print, Reverse  

Functions **Java programming me code ko clean aur reusable banane ke liye bahut important hain**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Arrays in Java
- Single dimension array
- Multi dimension array
- Array traversal & operations