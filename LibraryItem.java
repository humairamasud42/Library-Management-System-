class LibraryItem {

    private int itemId;
    private String title;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, boolean isAvailable) {
        this.itemId = itemId;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;

        if (isAvailable == false) {
            System.out.println("Item checked out");
        } else {
            System.out.println("Item returned");
        }
    }
    public void getDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Available: " + isAvailable);
    }
}

