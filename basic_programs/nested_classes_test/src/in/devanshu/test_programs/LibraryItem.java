package in.devanshu.test_programs;

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public void checkout(){
        System.out.println("CHECKOUT");
    }

    public void returnItem(){
        System.out.println("Returning an Item");
    }
}
