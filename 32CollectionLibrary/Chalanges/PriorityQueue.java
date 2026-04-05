
import java.util.*;

public class PriorityQueue {


    public static class Student {
        private final String name;
        private final char grade;
    
        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade; 
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public char getGrade() {
            return grade;
        }

        public void setGrade(char grade) {
            // this.grade = grade; // This will cause a compilation error because grade is declared as final and cannot be reassigned after it has been initialized in the constructor.
        }

        @Override
        public String toString() {
            return "Student {name='" + name + "', grade=" + grade + "}";
        }


    
        
    }


    public static void main(String[] args) {
        PriorityQueue<Student> studentQueue = new PriorityQueue<>(
            new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return Character.compare(s1.getGrade(), s2.getGrade()); // Compare students based on their grades
                }
            }
        );

        studentQueue.offer(new Student("Alice", 'A'));
        studentQueue.offer(new Student("Bob", 'B'));
        studentQueue.offer(new Student("Charlie", 'C'));



        // Polling students from the priority queue will return them in order of their grades (A, B, C)
        System.out.println(studentQueue.poll()); // Output: Student {name='Alice', grade=A
       



        
    }

    
}