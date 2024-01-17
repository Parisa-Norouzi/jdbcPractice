import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class AuthorRepository {


        private  final JdbcConnection jdbcConnection=new JdbcConnection();

        public AuthorRepository() throws SQLException {
        }

    public void  registerAuthor(Authour users) throws SQLException {
            Connection connection=jdbcConnection.getConnection();
            String addUser = "INSERT INTO users(First_Name, Last_Name,age) VALUES (?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(addUser);

            preparedStatement.setString(1,users.getFirstName());
            preparedStatement.setString(2,users.getLastName());
            preparedStatement.setString(3,users.getAge());
            preparedStatement.executeUpdate();
        }
        private Connection connection;


    }
