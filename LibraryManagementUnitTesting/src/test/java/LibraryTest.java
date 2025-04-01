import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;  
  
public class LibraryTest {  
  
    @Test  
    public void testAddBook() {  
        Library library = new Library();  
        Book book = new Book("1984", "George Orwell");  
        library.addBook(book);  
        assertTrue(library.listAvailableBooks().contains(book));  
    }  
  
    @Test
    public void testAddDuplicateBook() {
        Library library = new Library();
        Book book = new Book("1984", "George Orwell");
        library.addBook(book);
        library.addBook(book); // Attempt to add the same book again
        assertEquals(1, library.listAvailableBooks().size(), "Duplicate books should not be added.");
    }
  
    @Test  
    public void testCalculateFineAfterReturn() {  
        // Setup  
        Library library = new Library();  
        Patron patron = new Patron("Alice Smith");  
        Book book = new Book("Design Patterns", "Erich Gamma");  
  
        library.addBook(book);  
        library.addPatron(patron);  
          
        // Check out for 2 days  
        library.checkOutBook(patron, book, 2);   
          
        // Simulate that 2 days have passed, and set the due date  
        book.setDueDate(LocalDate.now().minusDays(2));  
  
        // Return the book  
        library.returnBook(patron);   
  
        // Act: Calculate fine after returning  
        double fineAfterReturn = library.calculateFine(patron);   
  
        // Assert: No fine should be calculated after return  
        assertEquals(0, fineAfterReturn, "The fine should be zero after returning the book.");  
    }  

    @Test
    public void testNonexistentBookCheckout() {
        Library library = new Library();
        Patron patron = new Patron("Alice Smith");
        Book book = new Book("Nonexistent Book", "Unknown Author");
        library.addPatron(patron);
        boolean result = library.checkOutBook(patron, book, 7); // Attempt to check out a book not in the library
        assertFalse(result, "Should not be able to check out a nonexistent book.");
    }

    @Test
    public void testFineCalculation() {
        Library library = new Library();
        Patron patron = new Patron("Alice Smith");
        Book book = new Book("Design Patterns", "Erich Gamma");
        library.addBook(book);
        library.addPatron(patron);

        library.checkOutBook(patron, book, 2);
        book.setDueDate(LocalDate.now().minusDays(5)); // Simulate overdue by 5 days

        double fine = library.calculateFine(patron);
        assertEquals(2.5, fine, 0.01, "Fine should be correctly calculated as $0.50 per day overdue.");
    }

    @Test
    public void testListBooksAndPatrons() {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Brave New World", "Aldous Huxley");
        Patron patron = new Patron("Alice Smith");

        library.addBook(book1);
        library.addBook(book2);
        library.addPatron(patron);

        assertEquals(2, library.listAvailableBooks().size(), "Should list all available books.");
        assertEquals(1, library.listPatrons().size(), "Should list all registered patrons.");
    }
}
