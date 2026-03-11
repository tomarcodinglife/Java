# ☕ Java Lesson – Control Statements & Decision Making

Is lesson me hum seekhenge:

- Ternary Operator
- Switch Statement
- Odd & Even check
- Minimum number check
- Month print with Switch & Scanner
- Calculator with Scanner input
- Absolute number check
- Score check with If-Else & Scanner input

---

# 📌 Control Statements Kya Hote Hain?

Control statements **program ke flow ko control karte hain**.  
Decision making aur loops me use hote hain.

---

# 1️⃣ Ternary Operator

Short form of **if-else**.

```java
variable = (condition) ? value_if_true : value_if_false;
```

### Example

```java
public class TernaryExample {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
    }
}
```

Output:

```
Maximum = 20
```

---

# 2️⃣ Switch Statement

Multiple choices ke liye use hota hai.

```java
switch(expression){
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}
```

### Example – Month Name

```java
import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch(month){
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Invalid month"); 
        }
    }
}
```

---

# 3️⃣ Odd & Even Check

```java
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
}
```

---

# 4️⃣ Minimum Number

```java
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int min = (a < b) ? a : b;
        System.out.println("Minimum = " + min);
    }
}
```

---

# 5️⃣ Calculator (Scanner Input)

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+,-,*,/): ");
        char op = sc.next().charAt(0);

        double result;
        switch(op){
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
            default: result = 0; System.out.println("Invalid operator"); break;
        }

        System.out.println("Result = " + result);
    }
}
```

---

# 6️⃣ Absolute Number Check

```java
import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int abs = (n < 0) ? -n : n;
        System.out.println("Absolute = " + abs);
    }
}
```

---

# 7️⃣ Score Check with If-Else

```java
import java.util.Scanner;

public class ScoreCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score (0-100): ");
        int score = sc.nextInt();

        if(score >= 90){
            System.out.println("Grade: A");
        } else if(score >= 75){
            System.out.println("Grade: B");
        } else if(score >= 50){
            System.out.println("Grade: C");
        } else{
            System.out.println("Grade: F");
        }
    }
}
```

---

# ⚡ Important Points

- **Ternary operator** short if-else ke liye use hota hai  
- **Switch** multiple choices aur discrete values ke liye  
- **If-Else** numerical conditions aur range check ke liye  
- Scanner input ke saath **dynamic decision making** possible hai  
- Control statements program ka **flow aur logic** control karte hain

---

# 🎯 Interview Questions

1️⃣ Ternary operator ka syntax aur use kya hai?  
2️⃣ Switch aur If-Else me difference kya hai?  
3️⃣ Odd / Even check ka best method kya hai?  
4️⃣ How to print month using switch statement?  
5️⃣ Calculator program me error handling kaise karenge?  
6️⃣ Absolute number nikalne ka simple logic kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ Ternary Operator  
✔ Switch Statement  
✔ Odd & Even check  
✔ Minimum number  
✔ Month print using switch + scanner  
✔ Calculator using scanner input  
✔ Absolute number check  
✔ Score check using If-Else  

Control statements **Java ke fundamental building blocks hain for decision making aur program flow**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Loops (for, while, do-while)  
- Nested loops  
- Pattern printing  
- Break & Continue statements