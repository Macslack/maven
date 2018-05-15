package models;

public class Book {
    private String title;
    private String author;
    private int stock;
    private int id;


    public Book(String title, String author, int stock) {
        this.title = title;
        this.author = author;
        this.stock = stock;

    }
    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
