# ☕ Java Lesson – File Handling (Read & Write)

Is lesson me hum cover karenge:

- File handling kya hota hai
- File class ka use
- File create karna
- File me write karna
- File se read karna
- BufferedReader vs FileReader
- Best practices

---

# 1️⃣ File Handling Kya Hota Hai?

File handling ka matlab hai:

```
program ke through file create, read, write aur delete karna
```

Java me file handling ke liye:

```
java.io package use hota hai
```

---

# 2️⃣ Required Imports

```java
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
```

---

# 3️⃣ File Create Karna

```java
import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        try {
            File file = new File("data.txt");

            if(file.createNewFile()){
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

        } catch(IOException e){
            System.out.println("Error creating file");
        }
    }
}
```

---

# 4️⃣ File Me Write Karna

File write karne ke liye:

```
FileWriter use hota hai
```

Example:

```java
import java.io.FileWriter;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Hello Sujit");
            writer.close();

            System.out.println("Data written");
        } catch(IOException e){
            System.out.println("Write error");
        }
    }
}
```

---

# 5️⃣ File Read Karna – FileReader

```java
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("data.txt");

            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }

            reader.close();
        } catch(IOException e){
            System.out.println("Read error");
        }
    }
}
```

---

# 6️⃣ File Read Karna – BufferedReader (Better Way)

BufferedReader fast aur efficient hota hai.

```java
import java.io.*;

public class Test {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();
        } catch(IOException e){
            System.out.println("Error reading file");
        }
    }
}
```

---

# 7️⃣ Append Mode Me Write Karna

```java
FileWriter writer = new FileWriter("data.txt", true);
```

Ye existing data delete nahi karta.

---

# 8️⃣ File Information Lena

```java
File file = new File("data.txt");

System.out.println(file.getName());
System.out.println(file.getAbsolutePath());
System.out.println(file.length());
```

---

# 9️⃣ File Delete Karna

```java
File file = new File("data.txt");

if(file.delete()){
    System.out.println("File deleted");
}
```

---

# 🔟 Try-with-resources (Best Practice)

Ye automatically file close kar deta hai.

```java
try(FileWriter writer = new FileWriter("data.txt")) {
    writer.write("Hello");
}
catch(IOException e){
    System.out.println("Error");
}
```

---

# 1️⃣1️⃣ Complete Program – Write then Read

```java
import java.io.*;

class Test {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("data.txt");
            fw.write("Java File Handling");
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();

        } catch(IOException e){
            System.out.println("Error");
        }
    }
}
```

---

# 1️⃣2️⃣ File Handling Classes Summary

| Class | Purpose |
|------|---------|
| File | file create, info, delete |
| FileWriter | write data |
| FileReader | read characters |
| BufferedReader | fast reading |

---

# 1️⃣3️⃣ Checked Exception in File Handling

File operations me:

```
IOException aata hai
```

Isliye:

```
try-catch ya throws mandatory hai
```

---

# 🎯 Interview Questions

1. FileWriter aur FileReader me difference kya hai?
2. BufferedReader fast kyun hota hai?
3. Append mode kya hota hai?
4. Try-with-resources kya hai?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ File create karna  
✔ File me data write karna  
✔ File se data read karna  
✔ BufferedReader ka use  
✔ Try-with-resources best practice  

File handling Java me **persistent storage aur logging** ke liye essential hai.