package labsession25;

public class Encap3 {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // Constructor
    public Encap3(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; 
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable; 
    }

    public void issueBook() {
        if (isAvailable) {
        	
            isAvailable = false;
            
            System.out.println(title + " issued");
        } else {
            System.out.println(title + " already issued.");
        }
    }

    
    public void returnBook() {
    	
        if (!isAvailable) {
        	
            isAvailable = true;
            
            System.out.println(title + " returned");
        } else {
            System.out.println(title + " not issued");
        }
    }

   
    public void displayInfo() {
    	
        System.out.println(title);
        System.out.println(author);
        System.out.println(isbn);
        System.out.println(isAvailable ? "Available" : "Not Available");
    }

    
    public static void main(String[] args) {
    	
        Encap3 b1 = new Encap3("Core", "lilly", "978");
        Encap3 b2 = new Encap3("Java", "Mango", "970");

        b1.displayInfo();
        b1.issueBook();
        b1.returnBook();
        b2.returnBook();
    }
}
