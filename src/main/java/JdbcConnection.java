import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    private final Connection connection =
      DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
    public JdbcConnection() throws SQLException {
    }

    public Connection getConnection() {
        return connection;
    }
}
