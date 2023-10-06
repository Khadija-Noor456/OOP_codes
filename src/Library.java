package LabAssignment;
public class Library {
  private LibraryItem[] items;
  private int itemCount;

  public Library(int capacity) {
    items = new LibraryItem[capacity];
    itemCount = 0;
  }

  public Library() {
    LibraryItem[] items ;

  }

  public void addItem(LibraryItem item) {
    if (itemCount < items.length) {
      items[itemCount] = item;
      itemCount++;
      System.out.println("Item added successfully.");
    } else {
      System.out.println("The library is full. Cannot add more items.");
    }
  }

  public void borrowItem(LibraryItem item) {
    for (int i = 0; i < itemCount; i++) {
      if (items[i].equals(item) && !items[i].isBorrowed()) {
        items[i].isBorrowed();
        System.out.println("Item is borrowed");
        return;
      }
    }
    System.out.println("Item not found in the library");
  }

  public void returnItem(LibraryItem item) {
    for (int i = 0; i < itemCount; i++) {
      if (items[i].equals(item) && items[i].isBorrowed()) {
        items[i].isBorrowed();
        System.out.println("Item returned successfully.");
        return;
      }
    }
    System.out.println("Item not found in the library or not borrowed.");
  }

  public void displayAvailableItems() {
    System.out.println("Available Items in the Library:");
    for (int i = 0; i < itemCount; i++) {
      if (!items[i].isBorrowed()) {
        System.out.println("Title: " + items[i].getTitle() + ", Author: " + items[i].getAuthor());
      }
    }
  }

  public void displayBorrowedItems() {
    System.out.println("Borrowed Items in the Library:");
    for (int i = 0; i < itemCount; i++) {
      if (items[i].isBorrowed()) {
        System.out.println("Title: " + items[i].getTitle() + ", Author: " + items[i].getAuthor());
      }
    }
  }
}

