public class Book {
    private final String nameBook;
    private final Author author;
    private int yearOfPublishing;

    public Book(String nameBook, int yearOfPublishing, Author author) {
        this.nameBook = nameBook;
        this.yearOfPublishing = yearOfPublishing;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

}
