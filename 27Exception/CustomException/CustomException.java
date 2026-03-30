package CustomException;

public class CustomException {
    
    public static void checkAge(int age) throws MyException {

        if (age < 18) {
            throw new MyException("Age must be at least 18");
        } else {
            System.out.println("Access granted");
        }
        
    }   

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (MyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    

}
