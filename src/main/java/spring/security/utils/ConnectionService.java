package spring.security.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Imant on 04.04.17.
 */
public class ConnectionService {

    public static Connection createConnection() {
        Connection connection = null;

        try {
            Class.forName("org.sqlite.JDBC");
            final String DB_URL = PropertiesHolder.getProperty("DB_URL");
            connection = DriverManager.getConnection(DB_URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
