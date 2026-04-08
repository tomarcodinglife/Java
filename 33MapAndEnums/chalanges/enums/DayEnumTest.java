package enums;
import enums.Days;

public class DayEnumTest {

    public static void main(String[] args) {
        
        Days today = Days.WEDNESDAY;

        System.out.println("Today is: " + today);
        System.out.println("Is today a weekend? " + today.isWeekend());
        System.out.println("Is today a weekday? " + today.isWeekday());

        // Testing with a weekend day
        Days saturday = Days.SATURDAY;
        System.out.println("\nToday is: " + saturday);
        System.out.println("Is saturday a weekend? " + saturday.isWeekend());
        System.out.println("Is saturday a weekday? " + saturday.isWeekday());

        // Values method to iterate through all enum constants
        System.out.println("\nAll days of the week:");
        for (Days day : Days.values()) {
            System.out.println("Day: " + day + ", Is Weekend? " + day.isWeekend() + ", Is Weekday? " + day.isWeekday());
        }
    }

    
}
