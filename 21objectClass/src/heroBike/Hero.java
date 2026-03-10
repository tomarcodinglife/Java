package heroBike;
import method.bike.Bike;

public class Hero extends Bike{
    private int price;

    public Hero(String colour, int manufecturingYear, String model, int price){
        super(colour, manufecturingYear, model);
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Model").append(model).append("\n");
        str.append("Manufecturing Year : ").append(manufecturingYear).append("\n");
        str.append("Price : ").append(price).append("\n");
        return str.toString();
    }

    public void setPrice(int price){
        if(price <= 0){
            System.out.print("Invalid Price");
        }
        this.price = price;
    }


}