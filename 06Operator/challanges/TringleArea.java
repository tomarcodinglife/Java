import java.util.Scanner;

public class TringleArea {

    public static void main (String[] main) {

        Scanner input = new Scanner (System.in);
        System.out.print("Enter Tringle B : ");
        double B = input.nextInt();
        System.out.print("Enter Tringle H : ");
        double H = input.nextInt();

        double TotalArea = 0.5 * B * H;

        System.out.print("Total Area : " + TotalArea);
        
    }
}