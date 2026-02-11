package Book;

public class CodingBook {
    
    public static void main(String[] args){

        Book JavaBook = new Book(
            "Java Programming", 
            "Sujit Tomar", 
            5451455L, 
            3
        );

        Book JavaScript = new Book(
            "JavaScript Programming",
            "Tomar & Alok",
            652548L,
            2
        );
        
        // static method → call from class name
        System.out.println(
            "Total Type of Book : " + Book.totalTypeOfBook()
        );

        // instance variables
        System.out.println(
            "Total Book of " + JavaBook.title + 
            " Available " + JavaBook.noOfBook + " Copies"
        );

        // Instance Method
        JavaBook.borrowBook();

        System.out.println(
            "Remaining Copies :" + JavaBook.noOfBook
        );

        System.out.println(
            "Total Book of " + JavaScript.title +
            " Available " + JavaScript.noOfBook + " Copies"
        );

        System.out.println("-------------------------------------------------");
        JavaScript.borrowBook();
        System.out.println("-------------------------------------------------");
        JavaBook.borrowBook();
        System.out.println("-------------------------------------------------");
        JavaScript.borrowBook();
        System.out.println("-------------------------------------------------");
        JavaBook.borrowBook();
        System.out.println("-------------------------------------------------");
        JavaBook.borrowBook();
        System.out.println("-------------------------------------------------");
        JavaScript.borrowBook();
        
        
        System.out.println("-------------------------------------------------");
        JavaBook.returnBook();
        System.out.println(JavaBook.noOfBook);
        JavaBook.returnBook();
        System.out.println(JavaBook.noOfBook);
        JavaBook.returnBook();
        System.out.println(JavaBook.noOfBook);
        JavaBook.returnBook();

        JavaBook.borrowBook();
        
    }

}
