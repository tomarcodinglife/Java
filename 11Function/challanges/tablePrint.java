import java.util.Scanner;

public class tablePrint{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Table No. for Print : ");
        int tableNumber = input.nextInt();
        table(5);
    }

    public static void table(int tableNum){
        int i = 1; 
        while (i <= 10) {
            System.out.println(tableNum + "*" + i + "=" + (tableNum * i));
            i++;
        }
    }
}