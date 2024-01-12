import java.util.Scanner;

public class bookService {
    private final Scanner scanner = new Scanner(System.in);

    public void addBook(){
        System.out.println("plese inter BookName:");
        String BookName=scanner.nextLine();

        System.out.println("plese inter yearpublish:");
        String yearpublish=scanner.nextLine();

        Authour book1 =new Authour(BookName,yearpublish,10);
        System.out.println(book1);

    }
}
