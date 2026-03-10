# ☕ Java Lesson 8 – Number System

Is lesson me hum seekhenge:

- Number System kya hota hai
- Binary Number System
- Decimal Number System
- Octal Number System
- Hexadecimal Number System

Computer me numbers ko represent karne ke liye **different number systems use hote hain**.

Commonly 4 types ke number systems use hote hain:

```
Number Systems
│
├── Binary (Base 2)
├── Octal (Base 8)
├── Decimal (Base 10)
└── Hexadecimal (Base 16)
```

---

# 1️⃣ Decimal Number System

Decimal system **sabse common number system** hai jo hum daily life me use karte hain.

Iska **base 10** hota hai.

Digits:

```
0 1 2 3 4 5 6 7 8 9
```

Example:

```
245
```

Calculation:

```
2 × 10² + 4 × 10¹ + 5 × 10⁰
```

---

# 2️⃣ Binary Number System

Binary system ka **base 2** hota hai.

Isme sirf **2 digits use hote hain**:

```
0 and 1
```

Computer internally **binary numbers par hi kaam karta hai**.

Example:

```
1010
```

Calculation:

```
1 × 2³ + 0 × 2² + 1 × 2¹ + 0 × 2⁰
= 8 + 0 + 2 + 0
= 10 (decimal)
```

---

# 3️⃣ Octal Number System

Octal system ka **base 8** hota hai.

Digits:

```
0 1 2 3 4 5 6 7
```

Example:

```
17 (Octal)
```

Calculation:

```
1 × 8¹ + 7 × 8⁰
= 8 + 7
= 15 (decimal)
```

---

# 4️⃣ Hexadecimal Number System

Hexadecimal system ka **base 16** hota hai.

Digits:

```
0 1 2 3 4 5 6 7 8 9 A B C D E F
```

Yaha:

```
A = 10
B = 11
C = 12
D = 13
E = 14
F = 15
```

Example:

```
1A (Hexadecimal)
```

Calculation:

```
1 × 16¹ + 10 × 16⁰
= 16 + 10
= 26 (decimal)
```

---

# 5️⃣ Number System Comparison

| Number System | Base | Digits |
|---------------|------|-------|
| Binary | 2 | 0,1 |
| Octal | 8 | 0–7 |
| Decimal | 10 | 0–9 |
| Hexadecimal | 16 | 0–9, A–F |

---

# 6️⃣ Number Systems in Java

Java me different number systems ko represent karne ke special formats hote hain.

| Number System | Example |
|---------------|--------|
| Decimal | `10` |
| Binary | `0b1010` |
| Octal | `012` |
| Hexadecimal | `0xA` |

---

# Example Program

```java
public class NumberSystemExample {

    public static void main(String[] args) {

        int decimal = 10;

        int binary = 0b1010;

        int octal = 012;

        int hex = 0xA;

        System.out.println(decimal);
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hex);

    }

}
```

---

# Output

```
10
10
10
10
```

Explanation:

```
0b1010 → Binary
012 → Octal
0xA → Hexadecimal

Sabka decimal value 10 hai
```

---

# 7️⃣ Binary Conversion Example

Binary → Decimal

Example:

```
1011
```

Calculation:

```
1 × 2³ + 0 × 2² + 1 × 2¹ + 1 × 2⁰
= 8 + 0 + 2 + 1
= 11
```

---

# ⚡ Important Points

- Binary system computer ka **main number system** hai
- Decimal system human use ke liye common hai
- Octal aur Hexadecimal **binary ko short form me represent karte hain**
- Java me binary, octal aur hex values ko special prefixes se likhte hain

```
Binary → 0b
Octal → 0
Hex → 0x
```

---

# 🎯 Interview Questions

1️⃣ Number system kya hota hai?  
2️⃣ Binary system ka base kya hota hai?  
3️⃣ Octal system me kitne digits hote hain?  
4️⃣ Hexadecimal me A ka value kya hota hai?  
5️⃣ Java me binary number ka prefix kya hota hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Decimal Number System  
✔ Binary Number System  
✔ Octal Number System  
✔ Hexadecimal Number System  
✔ Java me number system representation  

Number systems **computer science ka fundamental concept hain**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Bitwise Operators
- Left Shift
- Right Shift
- Binary Operations