import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Your are male (Enter true / false) : ");
        
        boolean gender = input.nextBoolean();

        if (gender){
            System.out.print("Your are male");
        }else{
            System.out.print("Your are not male");
        }
        
    }

}