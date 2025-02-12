class EBook extends Book {
    private double fileSizeMB;
    private String fileFormat;
    private double price;
    public EBook(String title, String author, int yearPublished, double fileSizeMB, String fileFormat, double pricePerMB) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
        this.price = fileSizeMB*pricePerMB ;
    }
    public EBook(String title, String author, int yearPublished, double fileSizeMB, String fileFormat) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
        this.price = 0.0;
    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }
    public String getFileFormat() {
        return fileFormat;
    }
    public double getPrice() {
        return price;
    }
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String getBookInfo() {
        return super.getBookInfo() + "\n File Size: " + fileSizeMB + " MB\n File Format: " + fileFormat + "\n Price: $" + price;
    }
    @Override
    public void printBookDetails() {
        System.out.println(getBookInfo());
    }
    public void bookType() {
        System.out.println("This is an ebook");
    }
}