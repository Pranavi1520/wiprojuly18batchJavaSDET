package labsessionaug2;

import java.util.Scanner;

class InvalidBookException extends Exception {
	
	private static final long serialVersionUID = 1L;

public InvalidBookException(String message) {
     super(message);
 }
}

class Book {
private String title;
private String author;
private String isbn;

 public Book(String title, String author, String isbn) throws InvalidBookException {
	 
     if (title == null || title.trim().isEmpty()) {
         throw new InvalidBookException("Title cannot be empty.");
     }
     if (author == null || author.trim().isEmpty()) {
         throw new InvalidBookException("Author cannot be empty.");
     }
     if (isbn == null || !isbn.matches("\\d{3}-\\d{10}")) {
         throw new InvalidBookException("ISBN must be in format 123-1234567890.");
     }

     this.title = title.trim();
     this.author = author.trim();
     this.isbn = isbn.trim();
 }

 public String toString() {
     return "Book { Title: '" + title + "', Author: '" + author + "', ISBN: '" + isbn + "' }";
 }
}

public class Expection1 {
 public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);

     String[][] bookData = {
         {"Java", "James ", "123-1234567890"},                     
         {"", "Bank", "1261234567"}, 
         {"Henry", "Show", "1234567890"}
     };

     for (int i = 0; i < bookData.length; i++) {
         String title = bookData[i][0];
         String author = bookData[i][1];
         String isbn = bookData[i][2];

         System.out.println("Validating Book " + (i + 1));

         try {
             Book book = new Book(title, author, isbn);
             System.out.println(" Valid Book " + book);
             
         } catch (InvalidBookException e) {
             System.out.println("Validation Error " + e.getMessage());
         }
     }

     scanner.close();
 }
}
