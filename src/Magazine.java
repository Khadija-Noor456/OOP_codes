package LabAssignment;

public class Magazine extends LibraryItem {
       int issueNumber;
        public Magazine(String title, String author, int year, int issueNumber) {
            super(title, author, year, LibraryItemType.MAGAZINE);
            this.issueNumber = issueNumber;
        }

        public int issueNumber() {
            return issueNumber;
        }

}
