public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Author author = (Author) other;
        return lastName.equals(author.lastName) && firstName.equals(author.firstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName,lastName);
    }
    @Override
    public String toString() {
        return firstName + ": " + lastName;
    }

}