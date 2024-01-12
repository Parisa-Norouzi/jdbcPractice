import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class AuthorRepository {

    private final JdbcConnection jdbcConnection = new JdbcConnection();

    public AuthorRepository() throws SQLException {
    }
    public int registerAuthour(Authour authour) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addUser = "INSERT INTO authour(First_Name, Last_Name, age) VALUES (?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addUser);

        preparedStatement.setString(1, authour.getFirstName());
        preparedStatement.setString(2, authour.getLastName());
        preparedStatement.setInt(3, authour.getAge());


        int result = preparedStatement.executeUpdate();
        return result;
    }
    }