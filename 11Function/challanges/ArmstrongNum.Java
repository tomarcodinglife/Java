
public class ArmstrongNum{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Check Armstrong Cheacker")
        System.out.print("Enter Number : ")
        int UserInput = input.nextInt();


    }

    public static int DigitsCount(int Num) {
        int count = 0;
        int DigitCounter = 0

        while(Num > 0) {
            int digit = Num % 10;
            DigitCounter = DigitCounter * 10 + digit;
            Num = Num / 10;
            count++;
        }
    }

    public static int NumberIdenditify(int Num) {
        int count = 0;
        int DigitCounter = 0

        while(Num > 0) {
            int digit = Num % 10;
            DigitCounter = DigitCounter * 10 + digit;
            Num = Num / 10;
            count++;
        }
    }



}