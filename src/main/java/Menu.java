import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner=new Scanner(System.in);
    private final AuthourService userService=new AuthourService();

    public Menu() throws SQLException {
    }

    public void  publicMenu() throws SQLException {

        System.out.println("*****welcome*******");
        System.out.println("1-sign up");
        int number =scanner.nextInt();
        scanner.nextLine();
        switch (number){
            case 1 -> signUp();

        }
    }
    public void signUp() throws SQLException {
        userService.singUp();
    }
}
