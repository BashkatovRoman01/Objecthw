public class Book {
    private Author author;
    String Name;
    private int yearPublishing;
    private String bookName;

    public Book(Author author, int yearPublishing, String bookName) {
        this.Name = Name;
        this.yearPublishing = yearPublishing;
        this.bookName = bookName;
    }

    public String getName() {
        return this.Name;
    }
    public int getyearPublishing() {
        return this.yearPublishing;
    }
    public String getBookName() {
        return this.bookName;
    }
    public void setYearPublishing (int yearPublishing) {
        this.yearPublishing=yearPublishing;
    }
}
