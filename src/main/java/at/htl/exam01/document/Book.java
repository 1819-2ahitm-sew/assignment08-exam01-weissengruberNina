package at.htl.exam01.document;

public class Book extends Document{
    String title;
    String author;

    Book(String author) {
        super(author);
        this.author = author;
    }
}
