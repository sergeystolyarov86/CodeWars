import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcApp {
    private static Connection connection;

    public static void main(String[] args) {
        try {
            connect();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    public static void connect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:javadb.db");
    }

    public static void disconnect() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


