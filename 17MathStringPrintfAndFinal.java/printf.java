
public class printf {
    
    public static void main(String[] args) {
        int age = 26;
        String myname = "Sujit Tomar";
        int marks = 4155;

        System.out.printf("My age is %d", age);

        /*
            Specifier	    Meaning
            %d	            integer
            %f	            float/double
            %s	            string
            %c	            char
            %b	            boolean
            %n	            new line

        */

        System.out.printf("Name: %s Age: %d", "Sujit", 22);
        System.out.println();


        // Method First which is older
        System.out.println("Hello " + myname + ", your marks is " + marks);

        // Method Second which is newer
        System.out.printf("Hello %-10S, your marks is %0,5d", myname, marks);


    }

}
