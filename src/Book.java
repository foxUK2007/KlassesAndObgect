import java.util.Objects;

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

        @Override
    public boolean equals(Object other) {
            if (this == other) return true;
            if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Book fantasy1 = (Book) other;
        return nameBook.equals(fantasy1.nameBook);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameBook,yearOfPublishing, author);

    }
    @Override
    public String toString() {
        return author + ": " + nameBook;
    }

}

