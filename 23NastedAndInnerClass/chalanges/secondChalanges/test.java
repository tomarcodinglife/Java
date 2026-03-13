package secondChalanges;

public class test extends Person {

    public test(String name, int age) {
        super(name, age);
    }   


    public static void main(String[] args) {
        test personFirst = new test("John Doe", 30);
        test personSecond = new test("John Doe", 30);
        test personThiThird = new test("John Doe", 25);

        // Testing firstly the toString method
        System.out.println("Testing toString method:");
        System.out.println(personFirst.toString());

        // Testing the hashCode method  
        System.out.println("Testing hashCode method:");
        System.out.println("personFirst hashCode: " + personFirst.hashCode());
        System.out.println("personSecond hashCode: " + personSecond.hashCode());
        System.out.println("personThiThird hashCode: " + personThiThird.hashCode());

        // Testing the equals method
        System.out.println("Testing equals method:");
        System.out.println("personFirst equals personSecond: " + personFirst.equals(personSecond)); // should be true
        System.out.println("personFirst equals personThiThird: " + personFirst.equals(personThiThird)); // should be false

    }


    
}
