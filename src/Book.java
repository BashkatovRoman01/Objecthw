public class Book {

    String Name;
    private int YearPublishing;
    String bookName;

    public Book(String Name, int YearPublishing, String bookName) {
        this.Name = Name;
        this.YearPublishing = YearPublishing;
        this.bookName = bookName;
    }

    public String getName() {
        return this.Name;
    }
    public int getYearPublishing() {
        return this.YearPublishing;
    }
    public String getBookName() {
        return this.bookName;
    }
    public void setYearPublishing (int YearPublishing) {
        this.YearPublishing=YearPublishing;
    }
}
