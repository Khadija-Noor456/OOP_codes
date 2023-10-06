package LabAssignment;

enum LibraryItemType {
    BOOK,
    MAGAZINE;
}

// LibraryItem Class
class LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;
    private LibraryItemType itemType;

    // Constructors
    public LibraryItem(String title, String author, int year, LibraryItemType itemType) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.itemType = itemType;
        this.isBorrowed = false;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public LibraryItemType getItemType() {
        return itemType;
    }

    // Equals method to compare items based on their attributes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryItem that = (LibraryItem) o;

        if (year != that.year) return false;
        if (isBorrowed != that.isBorrowed) return false;
        if (!title.equals(that.title)) return false;
        if (!author.equals(that.author)) return false;
        return itemType == that.itemType;
    }
}

