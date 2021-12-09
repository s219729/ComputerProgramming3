public class Chapter {
    private String title;
    private int numberOfPages;
    private int startingPageNumber;

    public Chapter(String title, int numberOfPages, int startingPageNumber) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.startingPageNumber = startingPageNumber;
    }

    public String getTitle() {
        return this.title;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public int getStartingPageNumber() {
        return this.startingPageNumber;
    }
}
