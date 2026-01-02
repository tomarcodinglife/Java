import java.time.Year;
import java.util.Scanner;

public class AgeGuess {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Birth Year : ");
        int BirthYear = input.nextInt();
        int CurentYear = Year.now().getValue();
        int RealAge = (CurentYear - BirthYear);
        
        if (RealAge <= 13) {
            System.out.print("You are Child");
        }else if (RealAge <= 20 && RealAge > 13) {
            System.out.print("You are Teen");
        }else if (RealAge <= 60 && RealAge > 20) {
            System.out.print("You are Adult");
        }else if (RealAge > 60) {
            System.out.print("You are Senior");
        }
    }
}