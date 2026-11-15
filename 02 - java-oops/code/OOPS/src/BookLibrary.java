class Book {
    String title;
    String author;
    double price;
    boolean isBestSeller;

//    constructor

    Book(){
        System.out.println("Default constructor");
    }

    Book(String title, String author, double price, boolean isBestSeller){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isBestSeller = isBestSeller;
    }


}

public class BookLibrary {
    static void main() {

        Book dune = new Book("Dune","Frank Herbert", 499, true);
        System.out.println(dune);
        System.out.println(dune.title);
        System.out.println(dune.author);
    }
}
