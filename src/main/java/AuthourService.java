import java.sql.SQLException;
import java.util.Scanner;

public class AuthourService {
    private static final Scanner scanner=new Scanner(System.in);
    private static final AuthorRepository authorRepository;

    static {
        try {
            authorRepository = new AuthorRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public AuthourService() throws SQLException {
    }

    public static void singUp() throws SQLException {

        System.out.println("Please enter your FirstName: ");
        String firstname=scanner.nextLine();
        System.out.println("Please enter your LastName: ");
        String lastname=scanner.nextLine();
        System.out.println("Please enter your age: ");
        String age =scanner.nextLine();

        Authour users=new Authour(firstname,lastname,age);
       int result= authorRepository.registerAuthor(users);
       if(result==1)
           System.out.println(firstname +"successfully register");
       else
           System.out.println(" something is wrong :");

    }
}
