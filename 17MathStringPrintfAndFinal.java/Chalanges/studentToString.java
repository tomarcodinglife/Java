
    public class studentToString {
        String name;
        int age;
        int rollNumber;
        String address;
        double marks;
        boolean status;


        public studentToString (String name, int age, int rollNumber, String address, double marks, boolean status) {

            this.name = name;
            this.age = age;
            this.rollNumber = rollNumber;
            this.address = address;
            this.marks = marks;
            this.status = status;

        }

        @Override
        public String toString(){
            StringBuffer result = new StringBuffer();
            result.append("Name: " ).append(name).append("\n");
            result.append("Age: ").append(age).append("\n");
            result.append("Roll Number: ").append(rollNumber).append("\n");
            result.append("Address: ").append(address).append("\n");
            result.append("Marks: ").append(marks).append("\n");
            result.append("Status: ").append(status).append("\n");
            return result.toString();
        }

        public static void main(String[] args) {
            studentToString SujitTomar = new studentToString("Sujit Tomar", 25, 115, "Aurangabad", 370, true);
            System.out.println(SujitTomar);
                    
        }

    }
