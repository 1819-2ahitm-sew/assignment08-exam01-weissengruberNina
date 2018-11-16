package at.htl.exam01.document;

public class Email extends Document{
    String subjekt;
    String to;
    String author;

    Email(String author) {
        super(author);
        this.author = author;
    }
}
