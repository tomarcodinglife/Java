package trafficsignal;

public enum SignalColor {

    RED(5000), YELLOW(2000), GREEN(10000);

    private int duration;

    // Getter for the duration of each signal color
    public int getDuration() {
        return duration;
    }

    // Constructor to initialize the duration for each signal color
    SignalColor(int duration) {
        this.duration = duration;
    }
    
}
