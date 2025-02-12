
public class Main {
    public static void main(String[] args) {
        PrintedBook pb1 = new PrintedBook("To Kill a Mocckingbird", "Harper Le", 1960, 2810, "J.B.M.", 18.99);
        PrintedBook pb2 = new PrintedBook("1984", "George Orwel", 1999, 320, " Warburg", 15.99);
        EBook eb1 = new EBook("The great Gatsby", "F. Scott Fitzgerald", 1925, 1.5, "Pdf", 80.99);
        EBook eb2 = new EBook("Pride and Prejudece", "Jane Austen", 18199, 2.9, "EPUB");
        System.out.println(pb1.getBookInfo());
        pb1.printBookDetails();
        System.out.println();
        pb1.bookType();
        pb1.printBook();
        System.out.println();
        System.out.println(pb2.getBookInfo());
        pb2.printBookDetails();
        System.out.println();
        pb2.bookType();
        pb2.printBook();
        System.out.println();
        System.out.println(eb1.getBookInfo());
        eb1.printBookDetails();
        System.out.println();
        eb1.bookType();
        System.out.println();
        System.out.println(eb2.getBookInfo());
        eb2.printBookDetails();
        System.out.println();
        eb2.bookType();

        System.out.println("\nAll functions worked properly ");
    }
}
