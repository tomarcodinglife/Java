
public class MyFunction {

    public static void main(String[] args) {

        // System.out.println("Welcome");
        // name();
        printPattern();

    }


    // this is function
    public static void name() {
        System.out.println("Sujit Tomar");
    }

    public static void printPattern(){

        int star = 0;
        while (star < 5) {
            System.out.print("*");
            int space = 0;
            while (space < star) {
                System.out.print(" *");
                space++;
            }
            System.out.println();
            star++;
        }

    }


}