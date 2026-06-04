class Book extends LibraryItem {
    private String author;
    private int pages;
//super class will be used here to call the constructor of the parent class
    public Book(int itemId, String title, boolean isAvailable, String author, int pages) {
        super(itemId, title, isAvailable);
        this.author = author;
        this.pages = pages;
    }
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}



