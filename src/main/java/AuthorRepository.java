import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class AuthorRepository {


        private  final JdbcConnection jdbcConnection=new JdbcConnection();

        public AuthorRepository() throws SQLException {
        }

    public void  registerAuthor(Authour authours) throws SQLException {
            Connection connection=jdbcConnection.getConnection();
            String addUser = "INSERT INTO authours(first_Name , last_Name ,age) VALUES (?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(addUser);

            preparedStatement.setString(1,authours.getFirstName());
            preparedStatement.setString(2,authours.getLastName());
            preparedStatement.setString(3,authours.getAge());
            preparedStatement.executeUpdate();
        }
        private Connection connection;


    }
