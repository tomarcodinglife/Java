import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Switch Control Statement Method");
        System.out.println("Enter the Day : ");
        int Day = input.nextInt();

        // old method
        

        // Java 14 Version updated method

        
    }

    public void oldSwitch(int Day){
                switch (Day) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                            
                    default:
                        System.out.println("Please Enter Valid Day");
                        break;
            }
        };
}
