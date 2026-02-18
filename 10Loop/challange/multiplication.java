import java.util.Scanner;

public class multiplication{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to table Multiplication");
        int num = input.nextInt();

        for(int i=1; i <= 10; i++ ){
            System.out.println(i + " X " + num + " = " + i * num);
        }

    }
}