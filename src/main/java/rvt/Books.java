public class Books {
    private String title;
    private int page;
    private int year;
    public Books(String title, int page, int year) {
        this.title = title;
        this.page = page;
        this.year = year;
    }
    public String getTitle() {
        return this.title;
    }
    public String toString() {
        return this.title + ", " + this.page + " pages, " + this.year;
    }


}