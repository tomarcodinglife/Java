package enums;


public enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Yaha par humne do methods banaye hain, ek weekend check karne ke liye aur dusra weekday check karne ke liye

    // Method to check if the day is a weekend
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY; // Agar current day SATURDAY ya SUNDAY hai to ye method true return karega, warna false
    }


    // Method to check if the day is a weekday
    public boolean isWeekday() {
        return !isWeekend(); // Weekday hoga agar wo weekend nahi hai
    }
    
}
