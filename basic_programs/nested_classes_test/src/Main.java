import in.devanshu.test_programs.Book;
import in.devanshu.test_programs.DVD;
import in.devanshu.test_programs.LibraryItem;
import in.devanshu.test_programs.Magzine;

public class Main {
    public static void main(String[] args) {
        LibraryItem lb1 = new LibraryItem();
        lb1.returnItem();

        System.out.println();

        // From Magzine Class
        Magzine m1 = new Magzine();
        m1.returnItem();

        System.out.println();

        // From DVD class
        DVD d1 = new DVD();
        d1.checkout();

        System.out.println();

        // From Book Class
        Book b1 = new Book();
        b1.returnItem();
    }
}