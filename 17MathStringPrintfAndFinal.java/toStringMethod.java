
class toStringMethod{
    String name;
    int roll;
    double marks;
    boolean pass;

    toStringMethod(String name, int roll, double marks, boolean pass) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "toStringMethod{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", marks=" + marks +
                ", pass=" + pass +
                '}';
    }


    public static void main(String[] args) {
        toStringMethod myStr = new toStringMethod("Sujit", 5, 99, true);
        System.out.println(myStr.toString());

    }

    


}
