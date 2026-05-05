
public class Library {
    private Book[] books;

    public Library() {
        books = new Book[10];
        for (int i = 0; i < 10; i++) {
            books[i] = new Book();
        }
    }

    public void borrow(int n) {
        if (n < 1 || n > 10) {
            System.out.println("Error: Invalid book number.");
            return;
        }

        Book book = books[n - 1];

        if (book.isBorrowed()) {
            System.out.println("Error: Book " + n + " is already borrowed.");
        } else {
            book.borrow();
            System.out.println("Book " + n + " borrowed.");
        }
    }

    public void returnBook(int n) {
        if (n < 1 || n > 10) {
            System.out.println("Error: Invalid book number.");
            return;
        }

        Book book = books[n - 1];

        if (!book.isBorrowed()) {
            System.out.println("Error: Book " + n + " is already returned.");
        } else {
            book.returnBook();
            System.out.println("Book " + n + " returned.");
        }
    }
}