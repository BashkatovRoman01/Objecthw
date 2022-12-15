public class Main {

  public static Book createBook (String Name, int YearPublishing, String bookName) {
      Book book= new Book();
      book.Name=Name;
      book.YearPublishing = YearPublishing;
      book.bookName=bookName;
      return book; }
    public static Author createAuthor (String authorFirstName, String authorSecondtName) {
      Author author= new Author();
      Author.authorFirstName=authorFirstName;
      Author.authorSecondtName = authorSecondtName;
      return author;
    }
    public static void main(String[] args) {
      Author Pushkin = createAuthor ("Alexander","Pushkin");
      Pushkin.authorFirstName="Alexander";
      Pushkin.authorSecondtName="Pushkin";
        System.out.println("Pushkin.authorFirstName = " + Pushkin.authorFirstName);
        System.out.println("Pushkin.authorSecondtName = " + Pushkin.authorSecondtName);
        Book Onegin = createBook("Evgeniy", 1861, "Evgeniy Onegin" );
        
        System.out.println("Onegin.Name = " + Onegin.Name);
        System.out.println("Onegin.YearPublishing = " + Onegin.YearPublishing);
        System.out.println("Onegin.bookName = " + Onegin.bookName);
    }
}