public class Main {

    public static void main(String[] args) {
      Author Pushkin = new  Author ("Alexander","Pushkin");

        System.out.println("Pushkin.authorFirstName = " + Pushkin.getAuthorFirstName());
        System.out.println("Pushkin.authorSecondtName = " + Pushkin.getAuthorSecondtName());
        Book Onegin = new Book("Evgeniy", 1861, "Evgeniy Onegin" );
        
        System.out.println("Onegin.Name = " + Onegin.getName());
        System.out.println("Onegin.yearPublishing = " + Onegin.getyearPublishing());
        Onegin.setYearPublishing(1912);
        System.out.println("Onegin.getyearPublishing() = " + Onegin.getyearPublishing());
        System.out.println("Onegin.bookName = " + Onegin.getBookName());
    }
}