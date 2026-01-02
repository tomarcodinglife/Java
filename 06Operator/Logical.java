import java.util.Scanner;

public class Logical {

    public static void main(String[] args) {

        System.out.println("Free Suggestion");
        Scanner input = new Scanner(System.in);

        System.out.print("Whats your Name : ");
        String UserName = input.nextLine();
        System.out.println("Hi " + UserName);

        System.out.print("Whats your Age : ");
        double age = input.nextDouble();
        input.nextLine(); // buffer clear
        age = Math.round(age);

        System.out.print("Whats your Gender : ");
        String Gender = input.nextLine();
        Gender = Gender.toLowerCase();

        if (age >= 18 && age <= 28) {
            System.out.print("You are Zen G Group & Male" + UserName);
        }else if (age >= 28 && age <= 44){
            System.out.print("You are Millennials Group & Male" + UserName);
        }else if (age >= 45 && age <= 60){
            System.out.print("You are Gen X Group & Male" + UserName);
        }else if (age >= 61 && age <= 70) {
            System.out.print("You are Boomers II Group & Male" + UserName);
        }else if (age >= 71 && age <= 79) {
            System.out.print("You are Boomers I* Group & Male" + UserName);
        }else if (age >= 80 && age <= 97){
            System.out.print("You are Post War Group & Male" + UserName);
        }else if (age >= 98 && age <= 103) {
            System.out.print("You are WWII Group & Male" + UserName);
        }else {
            System.out.print("Age Group generation not support" + UserName);
        }
        
        if(Gender.equals("male")) {
            System.out.println("Gender : Male");
            System.out.println("Suggestions:");
            System.out.println("- Driving Licence");
            System.out.println("- Voter ID");
            System.out.println("- Aadhaar Card");
        }else if(Gender.equals("female")){
            System.out.println("Gender : Female");
            System.out.println("Suggestions:");
            System.out.println("- Aadhaar Card");
        }else {
            System.out.println("Invalid gender input");
        }

    }

}