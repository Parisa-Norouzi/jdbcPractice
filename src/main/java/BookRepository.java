
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookRepository {
    private final JdbcConnection jdbcConnection = new JdbcConnection();

    public BookRepository() throws SQLException {
    }
    public int registerBook(Book book) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addBook = "INSERT INTO book(Book_Name, AuthourRef, year_publish) VALUES (?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addBook);

        preparedStatement.setString(1, book.getBookName());
        preparedStatement.setString(2, String.valueOf(book.getAuthourRef()));
        preparedStatement.setString(3, book.getYearpublish());


        int result = preparedStatement.executeUpdate();
        return result;
    }
}
