import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Month Finder");
        System.out.print("Enter the nom of Month : ");
        int num = input.nextInt();

        // Static Method Call
        String Result = monthGet(num);
        System.out.println("Month is " + Result);

        // Non-Statics Call
        month myObj = new month();
        String Result2 = myObj.monthGets(num);
        System.out.println("Month is " + Result2);


    }

    // static
    public static String monthGet(int Day){
        return switch (Day) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "invalid";
        };
    }

    // non static
    public String monthGets (int Day){
        String monthStr = switch (Day) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "invalid";
        };
        return monthStr;
    }

}
