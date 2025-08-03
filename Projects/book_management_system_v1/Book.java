public class Book {

    // Static Variable : Totel no. of books an individual have
    static int totalBooks;

    // Instance Variable : Title of the book
    String title;
    String Author;
    String ISBN;
    boolean isBorrowed;

    // Static block of the class
    static{
        totalBooks = 0;
    }

    // Object Initialization of the class
    {
        totalBooks++;
    }

    // Parameterized Constructor
    Book(String title , String author , String ISBN){
        this.title = title;
        this.Author = author;
        this.ISBN = ISBN;
    }

    Book(String ISBN){
        this( ISBN  , "Unknown" , "Unknown");
    }

    static int totalNoOFBooks() {
        return totalBooks;
    }

    // Instance Method
    void borrowBook(){
        if (isBorrowed){
            System.out.println("You have already borrowed this book.");
        }else{
            isBorrowed = true;
            System.out.println("Enjoy the Book");
        }
    }

    void returnBook(){
       if (isBorrowed){
           isBorrowed = false;
           totalBooks--;
           System.out.println("Your book is successfully returned.");
       }else{
           System.out.println("Your book is already in the self.");
       }
    }

    public static void main(String[] args){
        Book design = new Book("Design of things" , "unknown" , "123");
        System.out.println(Book.totalNoOFBooks());
        design.borrowBook();
        design.borrowBook();

        design.returnBook();
        design.returnBook();;
        System.out.println(Book.totalNoOFBooks());

    }
}
