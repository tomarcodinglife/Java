import java.util.Scanner;

public class GradeMarks{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter total Marks : ");
        double TotalMarks = input.nextDouble();
        System.out.print("Enter Obtain Marks : ");
        double ObtainMarks = input.nextDouble();

        double Percentage = ((ObtainMarks / TotalMarks) * 100);
        
        if (Percentage >= 90) {
            System.out.println("Marks Equal or Above 90%");
        }else if (Percentage >= 75 && Percentage < 90) {
            System.out.println("Marks Equal or Above 75%");
        }else if (Percentage >= 60 && Percentage < 75){
            System.out.println("Marks Equal or Above 60%");
        }else if (Percentage >= 30 && Percentage < 60){
            System.out.println("Marks Equal or Above 30%");
        }else{
            System.out.println("You are fail");
        }
        System.out.print("Marks Percentage is : " + Percentage + "%");
    }

}