import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner=new Scanner(System.in);
    private final AuthourService authourService=new AuthourService();
    private final BookService bookService=new BookService();

    public Menu() throws SQLException {
    }


    public void  publicMenu() throws SQLException {

        System.out.println("*****welcome*******");
        System.out.println("1-sign up");
         System.out.println("2-sign in");
        System.out.println("3-exist");
        int number =scanner.nextInt();
        scanner.nextLine();
        switch (number){
            case 1 -> signUp();

        }
    }
    public void  saveBooks() throws SQLException {

        System.out.println("1-saveBooks");

        int number =scanner.nextInt();
        scanner.nextLine();
        switch (number){
           // case 1 -> signbook();

        }
    }
    public void signUp() throws SQLException {
        ///userService.singUp();
        int numberInput = -1;
        while (numberInput != 0) {
            System.out.println("*** Add MENU ***");
            System.out.println("1-Add Authour");
            System.out.println("2-Add Book");
            System.out.println("3-delete Book");
            System.out.println("4-Book list");
            System.out.println("Choose a number :");

            numberInput = scanner.nextInt();
            scanner.nextLine();
            switch (numberInput) {
                case 1 -> AuthourService.singUp();
               case 2 -> BookService.addBook();
               case 3-> BookService.delBook();
               case 4->BookService.booklist();
                case 0 -> System.out.println("Return to main menu");
                default -> System.out.println("Wrong input");
            }
        }
    }

}
