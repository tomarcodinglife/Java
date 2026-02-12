package Course;

public class Course {
    // Static Variable
    static int maxCapasity = 100 ;
    // Instance Variable
    String courseName;
    int enrolldments = 0;
    int studentName;

    // Array to store students
    String[] enrolledStudent = new String[maxCapasity];


    // Static Method
    public static void setMaxCapacity(int maxCapacity){
        Course.maxCapasity = maxCapacity;
    }

    // Constructor
    public Course(String courseName){
        this.courseName = courseName;
        
    }

    public void enrollStudent(String studentName){
        if (enrolldments < maxCapasity) {
            enrolledStudent[enrolldments] = studentName;
            enrolldments++;
            System.out.println(studentName + " Student Enrolled" + " in " + courseName);
        }else{
            System.out.println(courseName + " Max Capasity Full " + studentName);
        }
    }

    public void unenrollStudent(String studentName){
        
        if(enrolldments == 0){
            System.out.println("No Student to remove");
            return;
        }

        int index = 0;
        boolean found = false;

        // Step 1 Find the student
        while (index < enrolldments) {
            if(enrolledStudent[index].equals(studentName)){
                found = true;
                break;
            }
            index++;
        }

        // Step 2 shift left element left using while loop
        int shiftIndex = index;

        while (shiftIndex < enrolldments-1) {
            enrolledStudent[shiftIndex] = enrolledStudent[shiftIndex + 1];
            shiftIndex++;
        }

        // Step 3 Remove Last duplicate
        enrolledStudent[enrolldments - 1] = null;
        enrolldments--;

        System.out.println(studentName + " unenrolled from " + courseName);
    }

    public void showTotalStudent(){
         System.out.println("Total students in " + courseName + ": " + enrolldments);
    }

}
