import java.util.Scanner;

public class passwordChecker{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Password Checker Method");

        String UserPassword;
        
        do{
            System.out.print("Enter the Valid Password : ");
            UserPassword = input.nextLine();
            showValidation(UserPassword);
        }while(!isValidPassword(UserPassword));
        System.out.println("Password Accepted!");
    }

    public static boolean isValidPassword(String pass){
        boolean hasLength = pass.length()>=8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecial = false;

        
        for(int i = 0; i < pass.length(); i++){
            char ch = pass.charAt(i);

            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }else if(Character.isLowerCase(ch)){
                hasLowerCase = true;
            }else if(!Character.isLetterOrDigit(ch)){
                hasSpecial = true;
            }
        }

        return hasLength && hasUpperCase && hasLowerCase && hasSpecial;
    }


    public static void showValidation(String pass){

        System.out.println("Length >= 8 : " + ((pass.length() >= 8) ? ("YES") : ("NO")));

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecial = false;

        for (int i = 0; i < pass.length(); i++ ){
            char ch = pass.charAt(i);

            if(Character.isUpperCase(ch)) hasUpperCase = true;
            if(Character.isLowerCase(ch)) hasLowerCase = true;
            if(!Character.isLetterOrDigit(ch)) hasSpecial = true;
        }

            System.out.println("Uppercase Present : " + (hasUpperCase ? "YES" : "NO"));
            System.out.println("Lowercase Present : " + (hasLowerCase ? "YES" : "NO"));
            System.out.println("Special Character Present : " + (hasSpecial ? "YES" : "NO"));
            System.out.println("-----------------------------------");

    }


}