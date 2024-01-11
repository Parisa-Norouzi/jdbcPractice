public class book {
    private int Bookid ;
    private String BookName ;
    private int yearpublish ;

    public book() {
    }

    public book(int bookid, String bookName, int yearpublish) {
        Bookid = bookid;
        BookName = bookName;
        this.yearpublish = yearpublish;
    }

    public int getBookid() {
        return Bookid;
    }

    public void setBookid(int bookid) {
        Bookid = bookid;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getYearpublish() {
        return yearpublish;
    }

    public void setYearpublish(int yearpublish) {
        this.yearpublish = yearpublish;
    }

    @Override
    public String toString() {
        return "book{" +
                "Bookid=" + Bookid +
                ", BookName='" + BookName + '\'' +
                ", yearpublish=" + yearpublish +
                '}';
    }
}
