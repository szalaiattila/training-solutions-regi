package classstructureconstructor;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Valami", "Valami");

        book.register("0123");

        System.out.println("Szerzo: " + book.getAuthor());
        System.out.println("Cim: " + book.getTitle());
        System.out.println("Regisztracios szam: " + book.getRegNumber());


    }

}