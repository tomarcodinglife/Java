import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Switch Control Statement Method");
        System.out.println("Enter the Day : ");
        int Day = input.nextInt();

        // old method
        oldSwitch(Day);

        // Java 14 Version updated method
        newSwitch(Day);

    }

    public static void oldSwitch(int Day){
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
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Please Enter Valid Day");
                break;
        }
    };

    public static void newSwitch(int Day) {
        String dayStr = switch(Day){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6, 7 -> "Holiday";
            default -> "Invailid Day";
        };
        System.out.println(dayStr);
    };

}
