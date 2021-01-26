import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Conn {

    public Connection get_connection() {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost/message_app",
                    "root",
                    "root"
            );

            if (connection != null) {
                System.out.println("Connection success");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return connection;
    }

};
