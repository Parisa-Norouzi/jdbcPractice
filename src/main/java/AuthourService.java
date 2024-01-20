import java.sql.SQLException;
import java.util.Scanner;

public class AuthourService {
    private final Scanner scanner=new Scanner(System.in);
    private final AuthorRepository authorRepository=new AuthorRepository();

    public AuthourService() throws SQLException {
    }

    public void singUp() throws SQLException {

        System.out.println("Please enter your FirstName: ");
        String firstname=scanner.nextLine();
        System.out.println("Please enter your LastName: ");
        String lastname=scanner.nextLine();
        System.out.println("Please enter your age: ");
        String age =scanner.nextLine();

        Authour users=new Authour(firstname,lastname,age);
        authorRepository.registerAuthor(users);
    }
}
