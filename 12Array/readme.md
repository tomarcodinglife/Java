# ☕ Java Lesson – Arrays & 2D Arrays

Is lesson me hum seekhenge:

- Array kya hota hai
- Array creation & input utility
- Array operations:
  - Delete element
  - Max & Min
  - Merge sorted arrays
  - Number occurrences
  - Palindrome check
  - Reverse array
  - Array searching
  - Sorted check
  - Sum & Average
- 2D Arrays:
  - Input & output
  - Diagonal sum
  - Sum & Average
  - Search in 2D array
  - Multidimensional arrays

---

# 📌 Array Kya Hota Hai?

Array ek **container hai jisme same type ke multiple elements store kiye ja sakte hain**.

- Fixed size hota hai  
- Index 0 se start hota hai  
- Array me data **contiguous memory me store hota hai**

---

# 1️⃣ Array Creation

```java
// 1D Array
int[] numbers = new int[5]; // size 5
int[] arr = {1,2,3,4,5};

// 2D Array
int[][] matrix = new int[3][3];
int[][] mat = { {1,2,3}, {4,5,6}, {7,8,9} };
```

---

# 2️⃣ Array Input Utility

```java
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

}
```

---

# 3️⃣ Delete from Array (Shift Elements)

```java
public class DeleteArray {

    static int[] deleteElement(int[] arr, int index){
        int n = arr.length;
        for(int i=index; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        int[] newArr = new int[n-1];
        for(int i=0;i<n-1;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = deleteElement(arr, 2); // delete index 2
        for(int num : arr) System.out.print(num + " ");
    }

}
```

Output:

```
1 2 4 5
```

---

# 4️⃣ Max & Min Number in Array

```java
public class MaxMin {

    public static void main(String[] args) {
        int[] arr = {5,3,9,1,7};
        int max = arr[0];
        int min = arr[0];

        for(int num : arr){
            if(num > max) max = num;
            if(num < min) min = num;
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

}
```

---

# 5️⃣ Merge Two Sorted Arrays

```java
public class MergeSorted {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1+n2];

        int i=0,j=0,k=0;

        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]) merged[k++] = arr1[i++];
            else merged[k++] = arr2[j++];
        }

        while(i<n1) merged[k++] = arr1[i++];
        while(j<n2) merged[k++] = arr2[j++];

        for(int num : merged) System.out.print(num + " ");
    }

}
```

Output:

```
1 2 3 4 5 6
```

---

# 6️⃣ Number Occurrences

```java
public class Occurrence {

    static int countOccurrences(int[] arr, int x){
        int count = 0;
        for(int num : arr){
            if(num == x) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2};
        System.out.println(countOccurrences(arr, 2)); // 3
    }

}
```

---

# 7️⃣ Palindrome Check (1D Array)

```java
public class ArrayPalindrome {

    static boolean isPalindrome(int[] arr){
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            if(arr[i] != arr[n-i-1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        System.out.println(isPalindrome(arr)); // true
    }

}
```

---

# 8️⃣ Reverse Array

```java
public class ReverseArray {

    static void reverse(int[] arr){
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        for(int num : arr) System.out.print(num + " ");
    }

}
```

Output:

```
5 4 3 2 1
```

---

# 9️⃣ Search in Array

```java
public class SearchArray {

    static int search(int[] arr, int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(search(arr, 3)); // 2 (index)
    }

}
```

---

# 🔟 Check Sorted Array

```java
public class SortedCheck {

    static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isSorted(arr)); // true
    }

}
```

---

# 1️⃣1️⃣ Sum & Average (1D Array)

```java
public class SumAverage {

    static int sum(int[] arr){
        int s = 0;
        for(int num : arr) s += num;
        return s;
    }

    static double average(int[] arr){
        return (double)sum(arr)/arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Sum = " + sum(arr));
        System.out.println("Average = " + average(arr));
    }

}
```

---

# 1️⃣2️⃣ 2D Arrays – Input & Output

```java
import java.util.Scanner;

public class TwoDArrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][3];

        System.out.println("Enter 6 numbers:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
```

---

# 1️⃣3️⃣ Diagonal Sum (Square 2D Array)

```java
public class DiagonalSum {

    public static void main(String[] args) {
        int[][] mat = { {1,2,3}, {4,5,6}, {7,8,9} };
        int sum = 0;
        for(int i=0;i<3;i++){
            sum += mat[i][i]; // main diagonal
        }
        System.out.println("Diagonal Sum = " + sum);
    }

}
```

Output:

```
Diagonal Sum = 15
```

---

# 1️⃣4️⃣ Sum & Average 2D Array

```java
public class SumAverage2D {

    public static void main(String[] args) {
        int[][] mat = { {1,2}, {3,4} };
        int sum = 0, count = 0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum += mat[i][j];
                count++;
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double)sum/count);
    }

}
```

---

# 1️⃣5️⃣ Search in 2D Array

```java
public class Search2D {

    static boolean search(int[][] mat, int key){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == key) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = { {1,2,3}, {4,5,6} };
        System.out.println(search(mat, 5)); // true
    }

}
```

---

# ⚡ Important Points

- Array ek **homogeneous data structure** hai  
- 1D & 2D arrays **index based access** karte hain  
- Nested loops **2D array traversal ke liye important**  
- Common operations:
  - Sum, Average, Max, Min  
  - Reverse, Palindrome  
  - Search & Sorted check  
  - Merge, Occurrences  

---

# 🎯 Interview Questions

1️⃣ Array kya hota hai?  
2️⃣ 2D array me elements kaise access karte hain?  
3️⃣ Array reverse aur palindrome kaise check karte hain?  
4️⃣ Max & Min nikalne ka efficient method kya hai?  
5️⃣ 2D array me diagonal sum kaise calculate karte hain?

---

# 🧾 Lesson Summary

Is lesson me humne seekha:

✔ 1D & 2D Arrays  
✔ Array Input Utility  
✔ Delete / Merge / Reverse / Palindrome / Occurrences  
✔ Max & Min, Sum & Average  
✔ Search & Sorted check  
✔ Nested Loops for 2D Arrays  
✔ Diagonal Sum, Sum & Average 2D array  

Arrays **Java ke fundamental data structure hai aur DSA ke liye basic concept hain**.

---

# 🚀 Next Lesson

Next lesson me hum seekhenge:

- Strings in Java
- String methods
- String manipulation  
- String challenges