# ☕ Java Lesson – Functional Programming in Java

Is lesson me hum seekhenge:

- Functional Programming kya hota hai
- Imperative vs Functional style
- Lambda Expressions
- Functional Interfaces
- Streams API
- Real examples

---

# 1️⃣ Functional Programming Kya Hota Hai?

Functional Programming ka matlab:

```
code ko functions ke form me likhna
```

✔ less code  
✔ clean code  
✔ readable code  

---

# 2️⃣ Imperative vs Functional

## Imperative (Traditional)

```java
int sum = 0;

for(int i = 1; i <= 5; i++){
    sum += i;
}
```

## Functional

```java
int sum = IntStream.rangeClosed(1,5).sum();
```

---

# 3️⃣ Lambda Expression

Lambda ek short way hai function likhne ka:

```
(parameters) -> expression
```

Example:

```java
(a, b) -> a + b
```

---

# 4️⃣ Functional Interface

Functional Interface:

```
jisme sirf ek abstract method hota hai
```

Example:

```java
interface MyInterface {
    void display();
}
```

Lambda use:

```java
MyInterface obj = () -> {
    System.out.println("Hello");
};
```

---

# 5️⃣ Built-in Functional Interfaces

| Interface | Use |
|----------|-----|
| Predicate | condition check |
| Function | input → output |
| Consumer | accept value |
| Supplier | value provide |

---

# 6️⃣ Predicate Example

```java
Predicate<Integer> isEven = n -> n % 2 == 0;

System.out.println(isEven.test(4));
```

---

# 7️⃣ Function Example

```java
Function<Integer, Integer> square = x -> x * x;

System.out.println(square.apply(5));
```

---

# 8️⃣ Consumer Example

```java
Consumer<String> print = s -> System.out.println(s);

print.accept("Hello");
```

---

# 9️⃣ Supplier Example

```java
Supplier<Integer> random = () -> 100;

System.out.println(random.get());
```

---

# 🔟 Streams API

Streams use hota hai:

```
data processing ke liye (collection par)
```

---

# 1️⃣1️⃣ Stream Example

```java
import java.util.*;

class Test {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
```

---

# 1️⃣2️⃣ Map Example

```java
list.stream()
    .map(n -> n * n)
    .forEach(System.out::println);
```

---

# 1️⃣3️⃣ Reduce Example

```java
int sum = list.stream()
              .reduce(0, (a, b) -> a + b);

System.out.println(sum);
```

---

# 1️⃣4️⃣ Method Reference

Short form:

```java
System.out::println
```

---

# 1️⃣5️⃣ Advantages

✔ less code  
✔ better readability  
✔ parallel processing possible  

---

# 1️⃣6️⃣ Real-Life Example

```
filter → even numbers
map → square
reduce → sum
```

---

# 1️⃣7️⃣ Important Points

✔ Java 8 se introduce hua  
✔ Lambda + Stream important hai  
✔ functional style modern coding hai  

---

# 🎯 Interview Questions

1. Functional Programming kya hota hai?
2. Lambda kya hota hai?
3. Functional interface kya hota hai?
4. Stream API ka use kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Functional Programming concept  
✔ Lambda Expressions  
✔ Functional Interfaces  
✔ Streams API  
✔ Real examples  

Functional Programming Java me **clean, concise aur powerful coding style** provide karta hai.