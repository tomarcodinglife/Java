package thirdChalanges;

public class ArrayOperations {
 
    private int[] array;

    /* it is static - it means that it belongs to the class rather than an instance of the class. This allows us to call the method without creating an instance of ArrayOperations, which is useful for utility methods that operate on arrays. */

    /* Static inner class bnane ka fayda ye hai ki iske methods ko directly class ke naam se call kar sakte hain, bina kisi instance ke. Ye useful hota hai jab aapke methods sirf utility methods hain jo arrays par operate karte hain, aur unhe kisi instance variable ki zarurat nahi hoti. Static inner class ke methods ko call karne ke liye aapko ArrayOperations.StatisticsWithStatic.mean(array) jaisa syntax use karna hoga.

    Static Inner Class की खास बातें
    1. Outer class का object बनाना जरूरी नहीं
    2. Methods directly class name से call हो सकते हैं
    3. Outer class के non-static variables access नहीं कर सकते

    throw new IllegalArgumentException("Array cannot be null or empty"); is used to indicate that the method has received an invalid argument. In this case, if the array is null or empty, it is not possible to calculate the mean, so we throw an exception to signal that something went wrong. This helps to prevent errors and allows the caller of the method to handle the situation appropriately.

    */

    public static class StatisticsWithStatic {
        public static double mean(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }
            int sum = 0;

            for (int num : array) {
                sum += num;
            }
            return (double) sum / array.length;
        }

        public static double median(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }

            /* array.clone ek new array create karta hai jisme original array ke elements copy ho jate hain */
            int[] sortedArray = array.clone();
            /* java.util.Arrays.sort method ka use karke array ko sort karte hain */
            java.util.Arrays.sort(sortedArray);
            int middle = sortedArray.length / 2;
            if (sortedArray.length % 2 == 0) {
                return (sortedArray[middle - 1] + sortedArray[middle]) / 2.0;
            } else {
                return sortedArray[middle];
            }
        }
        

        
    }

    /* it is non-static - it means that it belongs to an instance of the class. This means that you need to create an instance of ArrayOperations in order to call the methods in StatisticsWithNonStatic. This can be useful if the methods need to access instance variables or if you want to maintain state within the class. However, in this case, since the methods are purely utility methods that operate on arrays, it may be more appropriate to make them static. */

    /* Non-static inner class bnane ka fayda ye hai ki iske methods ko instance variables ke sath access kar sakte hain, aur agar aapko class ke andar state maintain karni hai to bhi ye useful ho sakta hai. Lekin agar aapke methods sirf utility methods hain jo arrays par operate karte hain, to unhe static banana zyada appropriate hoga.
    
    */

    public class StatisticsWithNonStatic {
        public double mean(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return (double) sum / array.length;
        }

        public double median(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }
            int[] sortedArray = array.clone();
            java.util.Arrays.sort(sortedArray);
            int middle = sortedArray.length / 2;
            if (sortedArray.length % 2 == 0) {
                return (sortedArray[middle - 1] + sortedArray[middle]) / 2.0;
            } else {
                return sortedArray[middle];
            }
        }

    }

}
