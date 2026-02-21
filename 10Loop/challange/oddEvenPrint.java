
public class oddEvenPrint {
   public static void main(String[] args) {
        
    oddNumberPrint(0, 100);
    System.out.println("--------------------------------");
    evenNumberPrint(0, 50);
   }

   public static void evenNumberPrint(int startNumber, int lastNumber){

        int i = startNumber;

        while (i <= lastNumber) {
            if (i % 2 != 0) {
                i++;
                continue;
            }
            
            System.out.println(i);
            i++;
        }
   }

   public static void oddNumberPrint(int startNumber, int lastNumber){

        int i = startNumber;
        while (i <= lastNumber) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
   }

    
}
