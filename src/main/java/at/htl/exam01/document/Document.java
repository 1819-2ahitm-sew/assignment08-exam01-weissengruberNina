package at.htl.exam01.document;

abstract public class Document {
    String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    Document(String author){};
}

