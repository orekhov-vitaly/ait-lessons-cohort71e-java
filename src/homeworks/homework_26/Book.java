package homeworks.homework_26;

public class Book implements Cloneable{
    private int publicationYear;
    private String name;
    private String author;

    public Book(int publicationYear, String name, String author) {
        this.publicationYear = publicationYear;
        this.name = name;
        this.author = author;
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publicationYear=" + publicationYear +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
