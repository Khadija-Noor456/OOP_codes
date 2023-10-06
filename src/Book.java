package LabAssignment;

class Book extends LibraryItem {
    private int pageCount;

    // Constructor
    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year, LibraryItemType.BOOK);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
}
