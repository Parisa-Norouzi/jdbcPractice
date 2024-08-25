import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BookService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BookRepository bookRepository;

    static {
        try {
            bookRepository = new BookRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public BookService() throws SQLException {
    }

    public static void addBook() throws SQLException {
        System.out.println("Please Enter BookName:");
        String BookName=scanner.nextLine();
        System.out.println("Please Enter authour:");
        String authourRef=scanner.nextLine();
        System.out.println("Please Enter yearpublish:");
        String yearpublish=scanner.nextLine();

        Book book=new Book(BookName,authourRef,yearpublish);
        int result=  bookRepository.registerBook(book);
        if(result==1)
            System.out.println(BookName +"successfully register");
        else
            System.out.println(" something is wrong :");

    }
    public static void delBook() throws SQLException {
        System.out.println("** Delete book **");
        System.out.println("Enter book Id you want to delete");
        int id = scanner.nextInt();
        scanner.nextLine();

        int result = BookRepository.deleteBook(id);
       if (result != 0)
            System.out.println("Book has successfully delete");
        else
            System.out.println("Error");
    }
    public static void booklist() throws SQLException {
        System.out.println(("Please enter your bookid:"));
        int id = scanner.nextInt();
        scanner.nextLine();
        int result= BookRepository.load(id).getBookid();
        if(result!=0)
            System.out.println("id:"+BookRepository.load(id).getBookid() +" " +"bookName: "+BookRepository.load(id).getBookName() );
        else
            System.out.println(" something is wrong :");

    }

}
