import java.sql.SQLException;
import java.util.Scanner;

public class BookService {
    private final Scanner scanner = new Scanner(System.in);
    private final BookRepository bookRepository=new BookRepository();

    public BookService() throws SQLException {
    }

    public void addBook() throws SQLException {
        System.out.println("Please Enter BookName:");
        String BookName=scanner.nextLine();
        System.out.println("Please Enter authour:");
        String authourRef=scanner.nextLine();
        System.out.println("Please Enter yearpublish:");
        String yearpublish=scanner.nextLine();

        Book book=new Book(BookName,authourRef,yearpublish);
        bookRepository.registerBook(book);

    }
}
