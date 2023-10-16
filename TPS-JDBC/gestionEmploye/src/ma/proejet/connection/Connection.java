package ma.proejet.connection;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author hp
 */
public class Connection {
 private static com.mysql.jdbc.Connection connection;

    static {
        try {
           
            FileInputStream f = new FileInputStream("base.properties");

            Properties p = new Properties();
            p.load(f);
            String url = p.getProperty("jdbc.url");
            String login = p.getProperty("jdbc.username");
            String password = p.getProperty("jdbc.password");
            String driver = p.getProperty("jdbc.driver");
            Class.forName(driver);
            connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, login, password);
        } catch (Exception ex) {
            System.out.println(""+ex.getMessage());
        }
    }

    public static com.mysql.jdbc.Connection getConnection() {
        return connection;
    }
}