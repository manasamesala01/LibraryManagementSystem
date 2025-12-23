import java.util.ArrayList; // add this

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(int id, String name) {
        books.add(new Book(id, name));
        System.out.println("Book added successfully.");
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b.id + " | " + b.name + " | Issued: " + b.isIssued);
        }
    }

    void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id && !b.isIssued) {
                b.isIssued = true;
                System.out.println("Book issued.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id && b.isIssued) {
                b.isIssued = false;
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Invalid book ID !.");
    }
}
