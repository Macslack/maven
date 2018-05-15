import db.DBAuthor;
import db.DBBook;
import db.DBHelper;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {



        Author author0 = new Author("Christopher", "Tolkin", 100);
        Author author1 = new Author("Howard", "Lovecraft", 200);
        author1.setFirstName("callum");
        DBHelper.save(author1);
        DBHelper.save(author0);
        List<Book> books = DBBook.getBooks();
        List<Author> authors = DBAuthor.getAuthors();
        Book book0 = new Book("Necronomicon", 200, author1);
        Book book1 = new Book("The Silmarillion", 300, author0);
        book1.setTitle("caz");
        DBHelper.save(book1);
        DBHelper.save(book0);
        DBHelper.save(book1);


        Book foundBook = DBHelper.find(Book.class, book0.getId() );

        Author foundAuthors = DBHelper.find(Author.class, author0.getId() );






    }
}
