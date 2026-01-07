import java.util.Scanner;

public class OddNumTotal {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your No. : ");
        int n = input.nextInt();
        int result = oddNumSum(n);
        System.out.println(result);

    }

    public static int oddNumSum(int n){
        int i = 0;
        int sum = 0;
        while (i <= n) {
            if (i%2 != 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

}
