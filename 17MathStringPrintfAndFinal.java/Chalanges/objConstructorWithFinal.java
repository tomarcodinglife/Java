
// Question - Create an object with final field and a constructor to initialize them.

public class objConstructorWithFinal {
    final String company;
    final String model;
    final String color;
    final int wheel;
    final String fuelType;

    public objConstructorWithFinal(String company, String model, String color, int wheel, String fuelType) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.wheel = wheel;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        StringBuffer objToString = new StringBuffer();
        objToString.append("Company").append(" ").append(company);
        objToString.append("model").append(" ").append(model);

        return objToString.toString();
    }


    public static void main(String[] args) {
        objConstructorWithFinal safari = new objConstructorWithFinal("Tata", "XUV01", "Black", 4, "Desel");


    }




    


}
