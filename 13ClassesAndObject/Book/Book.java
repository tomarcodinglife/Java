package Book;

public class Book {
    // static variable - System Level
    static int totalTypeOfBook;

    // instance or variable - Object Level
    String title;
    String author;
    long isbn;
    int noOfBook;
    int volume;
    boolean isBorrowed;


    // Static Blocks
    // static {
    //     totalTypeOfBook = 0;
    // }

    // {
    //     totalTypeOfBook++;
    // }

    // Normal Method
    public Book (String title, String author, long isbn, int noOfBook){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.noOfBook = noOfBook;
        this.volume = noOfBook;
        totalTypeOfBook++; // every single created object total book increase +1
        System.out.println("Book Created " + title); 
    }

    // Static Method - Class Level Information
    public static int totalTypeOfBook(){
        return totalTypeOfBook;
    }

    public void showRemainingBooks(){
        System.out.println("Remain Book is " + noOfBook);
        
    }

    // instance method → book-specific behavior
    public void borrowBook(){
        if(noOfBook > 0){
            System.out.println("Yes you can borrowed");
            noOfBook--;
            showRemainingBooks();
        }else {
            System.out.println("Sorry I have not copy available of " + title);
        }
    }

    public void returnBook(){
        if(noOfBook < volume){
            noOfBook++;
            System.out.println("Your Book Return");
        }else{
            System.out.println("i have book already in my library ");
        }
    }
    
}
