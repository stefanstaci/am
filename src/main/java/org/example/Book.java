package org.example;

public class Book extends Product {

    private String author;
    private String genre;

    public Book(int id, String name, double price, int quantity, String author, String genre) {
        super(id, name, price, quantity);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString() {
        return "Book{" + " id = '" + getId() + '\'' +
                " name = '" + getName() + '\'' +
                " price = '" + getPrice() + '\'' +
                " quantity = '" + getQuantity() + '\'' +
                " author = '" + author + '\'' +
                ", genre = '" + genre + '\'' +
                '}';
    }
}
