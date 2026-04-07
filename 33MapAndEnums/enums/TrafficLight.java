package enums;

public enum TrafficLight {

    RED, GREEN, YELLOW;

    public String getAction() {
        switch (this) {
            case RED: return "Stop";
            case GREEN:return "Go";
            case YELLOW: return "Caution";
            default: return "Unknown";
        }
    }



    
}
