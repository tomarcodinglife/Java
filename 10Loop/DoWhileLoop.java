import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Age Checker");

        int age;
        do{
            System.out.println("Enter the own Age : ");
            age = input.nextInt();
            if (age < 0 || age > 150) {
                System.out.println("Invalid Entry");
            }else if (age <= 18) {
                System.out.println("Your are Child");
            }else if(age <= 44){
                System.out.println("Your are young");
            }else{
                System.out.println("Your are old");
            }
        }while(age < 0 || age > 150);
        input.close();

    }
}
