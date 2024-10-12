import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_conf";
        String user = "root";
        String password = "1234567";
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                Ansi.getInstance().printGreen("Connection established successfully");
            }


        } catch (SQLException e) {
            Ansi.getInstance().printYellow("====> Connection failed");
            Ansi.getInstance().printYellow("====> Error: " + e.getMessage());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
