# Java
Java is a high-level, object-oriented, platform-independent programming language used to build software applications. It was developed by Sun Microsystems in 1995 and is now maintained by Oracle.

## Why Java is Popular

### Platform Independent
Java follows the rule:
“Write Once, Run Anywhere”
A Java program can run on Windows, Linux, macOS, etc., without changes.

### Object-Oriented
Java is based on concepts like:
Class
Object
Inheritance
Polymorphism
Encapsulation
This makes programs reusable, modular, and easy to maintain.

### Secure
Java has:
No direct memory access
Bytecode verification
Automatic garbage collection

### Robust & Reliable
Strong memory management
Exception handling
Less chances of crashes

## JDK vs JVM VS JRE
JDK is a complete kit for Java developers. (JDK = JRE, Javac or Java Compiler, Development & Debugger) JVM is a virtual machine that runs Java programs. Using JVM Executes Java bytecode (.class files), Converts bytecode into machine code, Makes Java platform-independent, Manages memory and garbage collection and JRE provides the environment required to run Java applications. (JRE = JVM + Libraries)

## Variables 

## Data Type

### Premitive Data Type

| Data Type | Description                                  | Size (Fixed) | Example                          | Type              | 
|----------|-----------------------------------------------|--------------|----------------------------------|------------------ |
| byte     | Very small integer                            | 1 byte       | byte a = 10;                     | Integer (Integral)|
| short    | Small integer                                 | 2 bytes      | short b = 100;                   | Integer (Integral)|
| int      | Integer value (whole numbers)                 | 4 bytes      | int c = 1000;                    | Integer (Integral)|
| long     | Large integer                                 | 8 bytes      | long d = 100000L;                | Integer (Integral)|
| float    | Single-precision decimal number               | 4 bytes      | float e = 3.14f;                 | Floating-Point    |
| double   | Double-precision decimal number               | 8 bytes      | double f = 3.14159;              | Floating-Point    |
| char     | Single Unicode character                      | 2 bytes      | char g = 'A';                    | Character Type    |
| boolean  | True or false                                 | 1 byte*      | boolean h = true;                | Boolean           |
---

### Example 
    int age = 20;
    boolean isRealAge = true;
    float myMarks = 70.0f;
    double myHeight = 5.7;
    String name = "Sujit Kumar Singh";
    byte level = 3; (Use when Memory very need)
    short year = 2025; (Use when memory need small but larger than byte)
    long population = 140000000L; (Use only when required large value store in memory)

## Non Premitive Data Type

| Data Type | Description                                   | Size    | Example                                  | Type                |
|----------|------------------------------------------------|---------|------------------------------------------|---------------------|
| String   | Sequence of characters (String class)          | Depends | String a = "Hello";                      | Text / Reference    |
| Array    | Collection of elements of same data type       | Depends | int[] b = {1, 2, 3};                     | Collection          |
| Class    | Blueprint for creating objects                 | Depends | class Student { }                        | User-Defined Type   |
| Object   | Parent class of all Java classes               | Depends | Object obj = new Object();               | Universal Reference |
| Interface| Blueprint with abstract methods                | Depends | interface Shape { }                      | Abstract Type       |
| Enum     | Set of named constants                         | Depends | enum Day { MON, TUE };                   | Special Class       |
---



