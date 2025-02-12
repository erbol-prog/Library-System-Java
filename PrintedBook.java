class PrintedBook extends Book {
    private int numberOfPages;
    private String publisher;
    private double price;
    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, double price) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = "Unknown";
        this.price = price;
    }
    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, String publisher, double pricePerPage) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.price = pricePerPage*numberOfPages;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public String getPublisher() {
        return publisher;
    }
    public double getPrice() {
        return price;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String getBookInfo() {
        return super.getBookInfo() + "\n Pages: " + numberOfPages + "\n Publisher: " + publisher + "\n Price: " + price ;
    }
    @Override
    public void printBookDetails() {
        System.out.println(getBookInfo());
    }
    public void bookType() {
        System.out.println("This is a printed book");
    }
    public void printBook() {
        System.out.println("Printing the book...");
    }
}