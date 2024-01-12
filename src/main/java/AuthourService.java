import java.util.Scanner;

public class AuthourService {
    private final Scanner scanner = new Scanner(System.in);
   
    public void register(){
        System.out.println("plese inter FirstName:");
        String FirstName=scanner.nextLine();

        System.out.println("plese inter LastName:");
        String LastName=scanner.nextLine();

        System.out.println("plese inter age:");
        String age=scanner.nextLine();
        authour au =new authour(FirstName,LastName,10);
        System.out.println(au);

    }
}
