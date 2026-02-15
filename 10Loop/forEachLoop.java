
public class forEachLoop {
    public static void main(String[] args) {
        String[] array  = new String[]{
        "Rohit", "Sohan", "Sameer", "Aman", "Rahu", "Raman", "Shivam"
        };

        printArray(array);
        System.out.println();
        PrintForEach(array);
    }

    public static void printArray(String[] Array){
        for(int i =0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
    }

    public static void PrintForEach(String[] Array){
        for(String name : Array){
            System.out.print(name + " ");
        }
    }


}
