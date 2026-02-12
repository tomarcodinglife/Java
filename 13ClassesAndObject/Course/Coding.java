package Course;

public class Coding {
    public static void main(String[] args) {
        
        Course JavaProgramming = new Course(
            "Java with Tomar"
        );

        Course JavaScriptProgramming = new Course(
            "JavaScript with Tomar"
        );

        JavaProgramming.setMaxCapacity(5);

        JavaProgramming.enrollStudent("Rohit Kumar");
        JavaProgramming.enrollStudent("Amit Kumar");
        JavaProgramming.enrollStudent("Sohan Kumar");
        JavaProgramming.enrollStudent("Naman Kumar");
        JavaProgramming.enrollStudent("Akriti Kumari");
        JavaProgramming.enrollStudent("Shivam Kumar");

        JavaProgramming.showTotalStudent();

        JavaProgramming.unenrollStudent("Sohan Kumar");
        JavaProgramming.enrollStudent("Shivam Kumar");
        JavaProgramming.showTotalStudent();


    }
}

