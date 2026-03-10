package method.bike;

public class Bike{

    protected String colour;
    protected int manufecturingYear;
    protected String model;

    public Bike(String colour, int manufecturingYear, String model){
        this.colour = colour; 
        this.manufecturingYear = manufecturingYear;
        this.model = model;
    }


    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Model :").append(model).append("\n");
        str.append("Manufecturing Year :").append(manufecturingYear).append("\n");
        return str.toString();
    }

    



}