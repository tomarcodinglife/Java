import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to Fahrenheit to Celsius Convertor");
        System.out.print("Enter Fahrenheit Value : ");
        double fahrenheit = input.nextDouble();

        double Celsius = ((fahrenheit - 32) * 5.0f / 9.0f);
        System.out.print(Celsius + "C");
    }

}