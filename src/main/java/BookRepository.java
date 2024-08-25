import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRepository {
    private static final JdbcConnection jdbcConnection;

    static {
        try {
            jdbcConnection = new JdbcConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public BookRepository() throws SQLException {
    }

    public int registerBook(Book book) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addBook = "INSERT INTO book(book_Name, authourref,year_publish) VALUES (?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addBook);

        preparedStatement.setString(1, book.getBookName());
        preparedStatement.setString(2, book.getAuthourRef());
        preparedStatement.setString(3, book.getYearpublish());
        int result=preparedStatement.executeUpdate();
        return  result;
    }

    public static int deleteBook(int bookid) throws SQLException {
        Connection connection = jdbcConnection.getConnection();
        String deleteQuery = "DELETE FROM book WHERE book_id = ? ;";
        PreparedStatement ps = connection.prepareStatement(deleteQuery);
        ps.setInt(1, bookid);
       int result=ps.executeUpdate();
        return result;
    }
    public static Book load(int bookid) throws SQLException {
        Connection connection = jdbcConnection.getConnection();
        String loadQuary = "SELECT * FROM Book WHERE book_id = ?;";

        PreparedStatement ps = connection.prepareStatement(loadQuary);
        ps.setInt(1,bookid);
        ResultSet resultSet = ps.executeQuery();
        if (resultSet.next()){
            int book_id = resultSet.getInt(1);
            String book_name = resultSet.getString(2);
            String authourRef = resultSet.getString(3);
            String yearpublish = resultSet.getString(4);


            return new Book(book_id , book_name , authourRef, yearpublish );
        }
        else {
            System.out.println("patient with id \' " + bookid + "\' is not exist");
            return null ;
        }
    }

}
