import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.print("Enter the first Num : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        input.nextLine();

        System.out.print("Enter the calculation first 3 character (Add, Sub, Mul, Div) : ");
        String method = input.nextLine();

        int result = calculation(num1, num2, method);
        System.out.println("Result = " + result);


    }

    public static int calculation(int num1, int num2, String method){
        return switch(method){
            case ("Add") -> (num1 + num2);
            case ("Sub") -> (num1 - num2);
            case ("Mul") -> (num1 * num2);
            case ("Div") -> {
                            if (num2 == 0) {
                                System.out.println("Can not devide by 0");
                                yield 0;
                            }else{
                                yield num1 / num2;
                            }
                        }
            default -> {
                System.out.println("Invailed Operations");
                yield 0;
            }
        };
    };
    
}
