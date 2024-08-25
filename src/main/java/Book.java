public class Book {
    private int Bookid ;
    private String BookName ;
    private String authourRef ;
    private String yearpublish ;

    public Book(int id) {
    }

    public Book(int bookid, String bookName, String authourRef, String yearpublish) {
        Bookid = bookid;
        BookName = bookName;
        this.authourRef = authourRef;
        this.yearpublish = yearpublish;
    }

    public Book(String bookName, String authourRef, String yearpublish) {
        BookName = bookName;
        this.authourRef = authourRef;
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

    public String getYearpublish() {
        return yearpublish;
    }

    public void setYearpublish(String yearpublish) {
        this.yearpublish = yearpublish;
    }

    public String getAuthourRef() {
        return authourRef;
    }

    public void setAuthourRef(String authourRef) {
        this.authourRef = authourRef;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Bookid=" + Bookid +
                ", BookName='" + BookName + '\'' +
                ", authourRef='" + authourRef + '\'' +
                ", yearpublish='" + yearpublish + '\'' +
                '}';
    }
}
