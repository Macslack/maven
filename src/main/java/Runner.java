import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Book book = new Book("test", "test1", 200);
        Book book1 = new Book("test3", "test4", 300);
        book1.setTitle("caz");
        DBBook.update(book1);
        DBBook.save(book);
        DBBook.save(book1);
        Author author = new Author("bob", "test5", 100);
        Author author1 = new Author("bill", "test6", 200);
        author1.setFirstName("callum");
        DBAuthor.update(author1);
        List<Book> books = DBBook.getBooks();
        List<Author> authors = DBAuthor.getAuthors();

    }
}
