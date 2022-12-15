public class Main {

    public static void main(String[] args) {
      Author Pushkin = new  Author ("Alexander","Pushkin");

        System.out.println("Pushkin.authorFirstName = " + Pushkin.authorFirstName);
        System.out.println("Pushkin.authorSecondtName = " + Pushkin.authorSecondtName);
        Book Onegin = new Book("Evgeniy", 1861, "Evgeniy Onegin" );
        
        System.out.println("Onegin.Name = " + Onegin.Name);
        System.out.println("Onegin.YearPublishing = " + Onegin.YearPublishing);
        System.out.println("Onegin.bookName = " + Onegin.bookName);
    }
}